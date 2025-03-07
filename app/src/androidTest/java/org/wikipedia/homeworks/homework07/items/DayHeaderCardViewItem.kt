package org.wikipedia.homeworks.homework07.items

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

// Описать блок:
// - блок даты,

class DayHeaderCardViewItem(matcher: Matcher<View>) : KRecyclerItem<DayHeaderCardViewItem>(matcher) {
    val dayHeader = KTextView(matcher) {
        withText(R.id.day_header_text)
    }
}