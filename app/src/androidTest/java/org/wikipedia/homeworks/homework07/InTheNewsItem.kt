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
//        withId(R.id.view_card_header_title)
        withText("In the news")
    }

    val inTheNewsItemMenu = KImageView(matcher) {
        withId(R.id.view_list_card_header_menu)
        withParent {
            isInstanceOf(CardHeaderView::class.java)
        }
    }

    // заголовок и кнопка меню повторяют по содержанию class TopReadItem(matcher: Matcher<View>)
    // как будто бы нет смысла их описывать

    val recyclerInTheNews = KRecyclerView(
        parent = matcher,
        builder = {
            withId(R.id.news_cardview_recycler_view)
        },
        itemTypeBuilder = {
            itemType(::InTheNewsItemRecycler)
        }
    )

}