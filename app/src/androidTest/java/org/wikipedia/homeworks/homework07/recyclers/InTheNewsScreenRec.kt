package org.wikipedia.homeworks.homework07.recyclers

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.web.KWebView
import org.hamcrest.Matcher
import org.wikipedia.R

class InTheNewsScreenRec(matcher: Matcher<View>) :
    KRecyclerItem<InTheNewsScreenRec>(matcher) {

    val title = KTextView(matcher) {
        withId(R.id.view_list_card_item_title)
    }

    val content = KTextView(matcher) {
        withId(R.id.view_list_card_item_subtitle)
    }

    val image = KTextView(matcher) {
        withId(R.id.view_list_card_item_image)
    }

    val webView = KWebView {
        withId(R.id.page_web_view)
    }
}