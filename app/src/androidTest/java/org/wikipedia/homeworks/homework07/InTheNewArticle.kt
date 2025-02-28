package org.wikipedia.homeworks.homework07

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object InTheNewArticle : KScreen<InTheNewArticle>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val articleNameInArticle = KTextView {
        withId(R.id.articleTitle)
    }
    val pageWebView = KView {
        withId(R.id.page_web_view)
    }

}

