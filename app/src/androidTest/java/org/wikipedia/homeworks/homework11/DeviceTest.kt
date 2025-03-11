package org.wikipedia.homeworks.homework11

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.homeworks.homework07.items.InTheNewsItem
import org.wikipedia.homeworks.homework07.recyclers.InTheNewsItemRec
import org.wikipedia.homeworks.homework07.recyclers.InTheNewsScreenRec
import org.wikipedia.homeworks.homework07.screens.ExploreScreen
import org.wikipedia.homeworks.homework07.screens.InTheNewsScreen
import org.wikipedia.homeworks.homework08.OnboardingScreen
import org.wikipedia.main.MainActivity
import java.util.Locale

class DeviceTest : TestCase() {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun rotateAmdCheckOrientation() {

        run {
            val orientationBeforeRotation = device.uiDevice.isNaturalOrientation
            Thread.sleep(1000)

            step("rotate screen") {
                device.exploit.rotate()
            }

            val orientationAfterRotation = device.uiDevice.isNaturalOrientation
            Thread.sleep(1000)

            step("check orientation") {
                Assert.assertNotEquals(
                    "Orientation not changed after rotation",
                    orientationBeforeRotation, orientationAfterRotation
                )
            }
        }
    }

    @Test
    fun sleepAndWakeUp() {
        run {
            step("check screen get sleep") {
                device.uiDevice.sleep()
                Thread.sleep(3000)
            }
            step("check screen wakeup") {
                device.uiDevice.wakeUp()
            }
            step("check element is displayed") {
                OnboardingScreen.skipButton.isDisplayed()
            }
        }
    }

    @Test
    fun pressHomeAndRecentApps() {
        run {
            step("click home button") {
                device.exploit.pressHome()
                Thread.sleep(2000)
            }
            step("click pressRecentApps to show using apps") {
                repeat(2) { device.uiDevice.pressRecentApps() }
                Thread.sleep(2000)
            }
            step("check continue button is displayed") {
                OnboardingScreen.continueButton.isDisplayed()
            }
        }
    }

    @Test
    fun toggleWifiAndCheckArticle() {
        before {
            device.network.toggleWiFi (false)
            device.network.toggleMobileData (false)
            Thread.sleep(1000)
        }.after {
            device.network.toggleWiFi(true)
            device.network.toggleMobileData (true)
            Thread.sleep(1000)
        }.run {
            step("click skip button") {
                OnboardingScreen.skipButton.click()
            }
            step("open InTheNews recycler") {
                ExploreScreen.items.childWith<InTheNewsItem> {
                    withDescendant {
                        withText(R.string.view_card_news_title)
                    }
                }.invoke {
                    items.childAt<InTheNewsItemRec>(2) {
                        click()
                    }
                }
            }
            step("open InTheNews screen") {
                InTheNewsScreen.items.childAt<InTheNewsScreenRec>(1) {
                    step("click on article #1") {
                        title.click()
                    }
                }
            }
            step("get error of connect to Internet") {
                CannotCorrectToInternetScreen.errorText.isDisplayed()
                CannotCorrectToInternetScreen.retryButton.isDisplayed()
            }
            step("toggle WiFi on") {
                device.network.toggleWiFi(true)
                Thread.sleep(1000)
            }
            step("no error of connect to Internet") {
                CannotCorrectToInternetScreen.retryButton.click()
                Thread.sleep(1000)
            }
        }
    }

    @Test
    fun changeAndCheckLanguage() {
        before {
            device.language.switchInApp(Locale.ENGLISH)
        }.after {
            device.language.switchInApp(Locale.ENGLISH)
        }.run {
            step("change language") {
                device.language.switchInApp(Locale.ITALY)
                OnboardingScreen.continueButton
                Thread.sleep(1000)
            }
            step("check button in Italian") {
                OnboardingScreen.continueButton.containsText("Continua")
            }
        }
    }

    @Test
    fun checkMainActivityIsActive() {
        activity.scenario.onActivity { activity ->
            Assert.assertTrue(activity.isFinishing.not())
        }
    }
}
