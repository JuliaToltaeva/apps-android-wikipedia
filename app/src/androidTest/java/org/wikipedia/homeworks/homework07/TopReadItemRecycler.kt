package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class TopReadItemRecycler(matcher: Matcher<View>) : KRecyclerItem<TopReadItem>(matcher) {
    val baseNumber = KTextView(matcher) {
        withId(R.id.baseNumberView)
    }
    val topReadNumber = KTextView(matcher) {
        withId(R.id.numberView)
    }
    val topReadHeader = KTextView(matcher) {
        withId(R.id.view_list_card_item_title)
    }
    val topReadText = KTextView(matcher) {
        withId(R.id.view_list_card_item_subtitle)
    }
    val topReadView = KView(matcher) {
        withId(R.id.view_list_card_item_graph)
    }
    val topReadAmountOfView = KTextView(matcher) {
        withId(R.id.view_list_card_item_pageviews)
    }

}