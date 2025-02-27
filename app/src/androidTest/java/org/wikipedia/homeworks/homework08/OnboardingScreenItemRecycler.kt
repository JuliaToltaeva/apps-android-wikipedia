package org.wikipedia.homeworks.homework08

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.pager2.KViewPager2
import io.github.kakaocup.kakao.pager2.KViewPagerItem
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class OnboardingScreenItemRecycler(matcher: Matcher<View>) :
    KViewPagerItem<OnboardingScreenItemRecycler>(matcher) {

    val logoOnboardingScreen = KImageView(matcher) {
        withId(R.id.imageViewCentered)
    }

    val titleOnboardingScreen = KTextView(matcher) {
        withId(R.id.primaryTextView)
    }

    val textOnboardingScreen = KTextView(matcher) {
        withId(R.id.secondaryTextView)
    }

    val items = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.languagesList)
        },
        itemTypeBuilder = {
            itemType(::OnboardingScreenItemLanguageRecycler)
        }
    )


}