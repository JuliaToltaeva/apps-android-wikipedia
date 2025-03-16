package org.wikipedia.homeworks.homework13

import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
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

class WebViewWorksTests : TestCase() {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)


    // урок в онлайне, не работает
    @Test
    fun checkWebViewWorksCw() {
        run {
            step("skip Onboarding") {
                OnboardingScreen.skipButton.click()
            }
            step("choose item on ExploreScreen") {
                ExploreScreen.items.childWith<FeaturedArticleItem> {
                    withDescendant { withText("Featured article") }
                }.perform {
                    Thread.sleep(1000)
                    image.click()
                }
            }
            step("check cw") {
                FeaturedArticleScreen {
                    webView {
                        withElement(Locator.XPATH, "//span[@class='mw-page-title-main']") {
                            hasText("Flight Pattern")
                        }
                    }
                }
            }
        }
    }

    //домашка

    @Test
    fun checkWebViewWorksHw() {
        run {
            step("skip Onboarding") {
                OnboardingScreen.skipButton.click()
            }
            step("choose item on ExploreScreen") {
                ExploreScreen.items.childWith<InTheNewsItem> {
                    withDescendant { withText(R.string.view_card_news_title) }
                }.invoke {
                    step("click on image #0") {
                        items.childAt<InTheNewsItemRec>(0) {
                            click()
                        }
                    }
                }
            }
            step("choose article on InTheNewsScreen") {
                InTheNewsScreen.items
                    .childAt<InTheNewsScreenRec>(0) {
                        title.click()
                    }
            }
            step("check and scroll to References") {
                InTheNewsScreen {
                    webView {
                        withElement(Locator.ID, "References") {
                            scroll()
                            hasText("References")
                        }
                    }
                }
            }
            step("check and click xpath to link #5") {
                InTheNewsScreen {
                    webView {
                        withElement(
                            Locator.XPATH, "//sup[@class='mw-ref reference right-touch-area']"
                        ) {
                            click()
                        }
                    }
                }
            }
            step("check text and turn back") {
                ReferenceScreen.items {
                    childWith<ReferenceScreenItem> {
                        withDescendant {
                            //number
                        }
                    }.perform {
                        items.childAt<ReferenceScreenItem>(0) {
                            click()
                            //pressback()
                        }
                    }
                }
            }
            step("check mw-redirect link") {
                InTheNewsScreen {
                    webView {
                        withElement(
                            Locator.XPATH, "//sup[@class='mw-redirect']"
                        ) {
                            click()
                            Thread.sleep(1000)
                        }
                    }
                }
            }
        }
    }
}