package org.wikipedia.homeworks.homework07

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object InTheNewsScreen : KScreen<InTheNewsScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val toolbar = KView {
        withId(R.id.toolbar)
    }

    val image = KView {
        withId(R.id.gradient_view)
    }

    val text = KTextView {
        withText(R.id.story_text_view)
    }

    val items = KRecyclerView(
        builder = {
            withId(R.id.news_story_items_recyclerview)
        },
        itemTypeBuilder = {
            itemType(::InTheNewsItemRecInRec)
        }
    )

}
