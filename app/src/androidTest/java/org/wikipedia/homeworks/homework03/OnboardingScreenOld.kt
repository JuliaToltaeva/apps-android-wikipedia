package org.wikipedia.homeworks.homework03

import androidx.appcompat.widget.AppCompatImageView
import com.google.android.material.button.MaterialButton
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R
import org.wikipedia.views.AppTextView

object OnboardingScreenOld: KScreen<OnboardingScreenOld>() {

    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val skipButton = KButton {
        withId(R.id.fragment_onboarding_skip_button)
    }

}

val continueButton = listOf(
    MaterialButton::class.java,
    "fragment_onboarding_forward_button",
    "onboarding_continue"
)

val addOrEditLanguages = listOf(
    MaterialButton:: class.java,
    "addLanguageButton",
    "onboarding_multilingual_add_language_text"
)

val titleTheFreeEncyclopedia = listOf(
    AppTextView:: class.java,
    "primaryTextView"
)

val logoOnboardingScreen1 = listOf(
    AppCompatImageView::class.java,
    "imageViewCentered"
)

val logoOnboardingScreen2 = listOf(
    AppCompatImageView::class.java,
    "imageViewCentered"
)

val textOnboardingScreen2 = listOf(
    AppTextView:: class.java,
    "secondaryTextView"
)








