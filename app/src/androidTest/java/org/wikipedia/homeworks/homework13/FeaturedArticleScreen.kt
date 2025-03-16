package org.wikipedia.homeworks.homework13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.web.KWebView
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView

object FeaturedArticleScreen : KScreen<FeaturedArticleScreen>() {
    override val layoutId = R.layout.fragment_feed
    override val viewClass = FeedView::class.java

    val title = KTextView {
        withId(R.id.main_toolbar_wordmark)
    }

    val webView = KWebView {
        withId(R.id.page_web_view)
    }

}