package org.wikipedia.homeworks.homework13

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.web.KWebView
import org.wikipedia.R

object AfricanUnionScreen : KScreen<ReferenceScreen>() {
    override val layoutId = null
    override val viewClass = null

    val image = KImageView{
        withId(R.id.link_preview_thumbnail)
    }

    val title = KTextView{
        withText(R.id.link_preview_title)
    }

    val overflowButton = KButton{
        withId(R.id.link_preview_overflow_button)
    }

    val webView = KWebView{
        withText(R.id.link_preview_extract_webview)
    }

    val openInNewTabButton = KButton{
        withId(R.id.link_preview_secondary_button)
    }

    val readArticleButton = KButton{
        withId(R.id.link_preview_primary_button)
    }

}