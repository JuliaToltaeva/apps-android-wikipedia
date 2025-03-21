package org.wikipedia.homeworks.homework13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object ReferenceScreen : KScreen<ReferenceScreen>() {
    override val layoutId = null
    override val viewClass = null

    val index = KTextView{
        withId(R.id.reference_id)
        isDisplayed()
    }

    val title = KTextView{
        withText(R.id.reference_title_text)
    }

}