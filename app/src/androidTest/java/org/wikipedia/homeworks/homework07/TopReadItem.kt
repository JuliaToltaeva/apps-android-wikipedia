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
// - блок Top Read (с вложенным ресайклером),

class TopReadItem(matcher: Matcher<View>) : KRecyclerItem<TopReadItem>(matcher) {
    val headerTopRead = KTextView(matcher) {
        withId(R.id.view_card_header_title)
    }

    val topReadMenu = KImageView(matcher) {
        withId(R.id.view_list_card_header_menu)
        withParent {
            isInstanceOf(CardHeaderView::class.java)
        }
    }

    val recyclerTopRead = KRecyclerView(
        builder = {
            withId(R.id.feed_view)
        },
        itemTypeBuilder = {
            itemType(::TopReadItemRecycler)
        }
    )
}