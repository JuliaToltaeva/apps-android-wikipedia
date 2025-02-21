package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class InTheNewsItemRecycler(matcher: Matcher<View>) :
    KRecyclerItem<InTheNewsItemRecycler>(matcher) {
    val inTheNewsImage = KImageView(matcher) {
        withId(R.id.horizontal_scroll_list_item_image)
    }

    val inTheNewsText = KTextView(matcher) {
        withId(R.id.horizontal_scroll_list_item_text)
    }

}