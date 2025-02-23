package org.wikipedia.homeworks.homework08

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

//Написать несколько тестов, которые проверяют элементы на первом экране (минимум 4).

class OnboardingScreenTests : TestCase() {

    @get: Rule
    val activity: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testOne() {
        run {
            step("addOrEditLanguagesButton isDisplayed") {
                OnboardingScreen.addOrEditLanguagesButton.isDisplayed()
            }
        }
    }

    @Test
    fun testTwo() {
        run {
            step("skipButton isClickable") {
                OnboardingScreen.skipButton.isClickable()
            }
        }
    }

    @Test
    fun testThree() {
        run {
            step("swipe") {
                OnboardingScreen.items.swipeUp()
            }
        }
    }

    @Test
    fun testFour() {
        run {
            step("continueButton isClickable") {
                OnboardingScreen.continueButton.isClickable()
            }
        }
    }

}

