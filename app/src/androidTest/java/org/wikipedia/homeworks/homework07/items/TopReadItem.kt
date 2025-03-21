package org.wikipedia.homeworks.homework07.items

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.feed.view.CardHeaderView
import org.wikipedia.homeworks.homework07.recyclers.TopReadItemRecycler

// Описать блок:
// - блок Top Read (с вложенным ресайклером),

class TopReadItem(matcher: Matcher<View>) : KRecyclerItem<TopReadItem>(matcher) {
    val title = KTextView(matcher) {
        withId(R.id.view_card_header_title)
    }

    val topReadMenu = KImageView(matcher) {
        withId(R.id.view_list_card_header_menu)
        withParent {
            isInstanceOf(CardHeaderView::class.java)
        }
    }

    val items = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.view_list_card_list)
        },
        itemTypeBuilder = {
            itemType(::TopReadItemRecycler)
        }
    )
}