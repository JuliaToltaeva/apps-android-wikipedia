package org.wikipedia.homeworks.homework07.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R
import org.wikipedia.homeworks.homework07.recyclers.InTheNewsScreenRec

object InTheNewsScreen : KScreen<InTheNewsScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val toolbarBackButton = KButton{
        withId(R.id.toolbar)
    }

    val image = KView {
        withId(R.id.gradient_view)
    }

    val context = KTextView {
        withText(R.id.story_text_view)
    }

    val items = KRecyclerView(
        builder = {
            withId(R.id.news_story_items_recyclerview)
        },
        itemTypeBuilder = {
            itemType(::InTheNewsScreenRec)
        }
    )

}
