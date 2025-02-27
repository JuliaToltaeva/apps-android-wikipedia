package org.wikipedia.homeworks.homework08

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.pager2.KViewPager2
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import org.wikipedia.R

//Описать экран Onboarding по всем правилам
// (слайды экрана в пейджере KViewPager2,
// аналогично ресайклеру),
// список языков в ресайклере.

object OnboardingScreen : KScreen<OnboardingScreen>() {

    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val addOrEditLanguagesButton = KButton {
        withId(R.id.addLanguageButton)
        withText(R.string.onboarding_multilingual_add_language_text)
    }

    val skipButton = KButton {
        withId(R.id.fragment_onboarding_skip_button)
    }

    val continueButton = KButton {
        withId(R.id.fragment_onboarding_forward_button)
    }

    val getStartedButton = KButton {
        withId(R.id.fragment_onboarding_done_button)
    }

    val items = KViewPager2(
        builder = {
            withId(R.id.fragment_pager)
        },
        itemTypeBuilder = {
            itemType(::OnboardingScreenItemRecycler)
        }
    )
}









