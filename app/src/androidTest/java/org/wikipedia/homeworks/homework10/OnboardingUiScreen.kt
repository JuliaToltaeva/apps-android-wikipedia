package org.wikipedia.homeworks.homework10

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiSelector
import com.kaspersky.components.kautomator.component.common.views.UiView
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.screen.UiScreen


object OnboardingUiScreen : UiScreen<OnboardingUiScreen>() {
    override val packageName: String = "org.wikipedia.alpha"

    val image = UiView {
        withId(
            this@OnboardingUiScreen.packageName,
            "imageViewCentered"
        )
    }

    val title = UiTextView {
        withId(
            this@OnboardingUiScreen.packageName,
            "primaryTextView"
        )
    }

    val text = UiTextView {
        withId(
            this@OnboardingUiScreen.packageName,
            "secondaryTextView"
        )
    }

    val addOrEditLangButton = UiButton {
        withId(
            this@OnboardingUiScreen.packageName,
            "addLanguageButton"
        )
    }

    val skipButton = UiButton {
        withId(
            this@OnboardingUiScreen.packageName,
            "fragment_onboarding_skip_button"
        )
    }

    val continueButton = UiButton {
        withId(
            this@OnboardingUiScreen.packageName,
            "fragment_onboarding_forward_button"
        )
    }

    val getStartedButton = UiButton {
        withId(
            this@OnboardingUiScreen.packageName,
            "fragment_onboarding_done_button"
        )
    }

    private val device: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    val getBackBeforeStartedButton: UiObject? = device.findObject(
        UiSelector()
            .className("android.widget.LinearLayout")
            .instance(6)
    )
}
