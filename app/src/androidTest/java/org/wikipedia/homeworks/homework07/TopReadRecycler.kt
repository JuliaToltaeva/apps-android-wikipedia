package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class TopReadRecycler(matcher: Matcher<View>) : KRecyclerItem<TopReadItems>(matcher) {
    val baseNumber = KTextView(matcher) {
        withId(R.id.baseNumberView)
    }
}