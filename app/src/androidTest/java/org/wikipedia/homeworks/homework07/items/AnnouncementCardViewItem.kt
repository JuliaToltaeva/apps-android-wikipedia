package org.wikipedia.homeworks.homework07.items

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

// Описать блок:
// - Customize,

class AnnouncementCardViewItem(matcher: Matcher<View>) :
    KRecyclerItem<AnnouncementCardViewItem>(matcher) {

    val imageCustomize = KImageView(matcher) {
        withId(R.id.view_announcement_header_image)
    }

    val textCustomize = KTextView(matcher) {
        withId(R.id.view_announcement_text)
        withText(R.string.feed_configure_onboarding_text)
    }

    val customizeButton = KButton(matcher) {
        withId(R.id.view_announcement_action_positive)
    }

    val gotItButton = KButton(matcher) {
        withId(R.id.view_announcement_action_negative)
    }










}