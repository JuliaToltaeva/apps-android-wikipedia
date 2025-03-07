package org.wikipedia.homeworks.homework10

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity


class OnboardingUiAutoTest : TestCase() {

    @get: Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkImage() {
        run {
            OnboardingUiScreen.image.isDisplayed()
        }
    }

    @Test
    fun checkSkipButton() {
        run {
            OnboardingUiScreen.skipButton.click()
        }
    }

    @Test
    fun checkTextAndGetStartedButton() {
        OnboardingUiScreen.run {
            repeat(3) { continueButton.click() }
            title.hasText("Data & Privacy")
            getStartedButton.click()
        }
    }

    @Test
    fun checkReturnBackBeforeGetStartedButton() {
        OnboardingUiScreen.run {
            repeat(3) { continueButton.click() }
            getBackBeforeStartedButton?.click() ?: Exception("Exception")
        }
    }

}