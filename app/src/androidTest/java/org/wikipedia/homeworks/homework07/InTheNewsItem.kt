package org.wikipedia.homeworks.homework07

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.feed.view.CardHeaderView

// Описать блок:
// - блок In the news (с вложенным ресайклером).

class InTheNewsItem(matcher: Matcher<View>) : KRecyclerItem<InTheNewsItem>(matcher) {
    val inTheNewsHeader = KTextView(matcher) {
        withText("In the news")
    }

    val menu = KImageView(matcher) {
        withId(R.id.view_list_card_header_menu)
        withParent {
            isInstanceOf(CardHeaderView::class.java)
        }
    }

    val items = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.news_cardview_recycler_view)
        },
        itemTypeBuilder = {
            itemType(::InTheNewsItemRec)
        }
    )

}