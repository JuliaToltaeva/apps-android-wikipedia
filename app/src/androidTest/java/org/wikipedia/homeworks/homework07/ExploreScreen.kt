package org.wikipedia.homeworks.homework07

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.toolbar.KToolbar
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView

// Домашнее задание №7. PageObject, списочные элементы.
// Описать блок:
// - блок In the news (с вложенным ресайклером).
// Классы описаний блоков должны быть в отдельных файлах.
// Описанные блоки добавить в типы блоков ресайклера экрана Explore.

object ExploreScreen : KScreen<ExploreScreen>() {
    override val layoutId = R.layout.fragment_feed
    override val viewClass = FeedView::class.java

    val toolbarTitle = KImageView {
        withId(R.id.main_toolbar_wordmark)
    }

    val items = KRecyclerView(
        builder = {
            withId(R.id.feed_view)
        },
        itemTypeBuilder = {
            itemType(::SearchCardViewItem)
            itemType(::AnnouncementCardViewItem)
            itemType(::DayHeaderCardViewItem)
            itemType(::TopReadItems)
        }
    )

}

