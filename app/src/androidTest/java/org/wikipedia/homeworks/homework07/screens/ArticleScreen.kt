package org.wikipedia.homeworks.homework07.screens

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.web.KWebView
import org.wikipedia.R

object ArticleScreen : KScreen<ArticleScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val title = KTextView {
        withId(R.id.articleTitle)
    }

    val pageWebView = KView {
        withId(R.id.page_web_view)
    }

    val webView = KWebView {
        withId(R.id.page_web_view)
    }

    val image = KImageView {
        withId(R.id.articleImage)
    }

}

