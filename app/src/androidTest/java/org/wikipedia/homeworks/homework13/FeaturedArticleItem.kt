package org.wikipedia.homeworks.homework13

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class FeaturedArticleItem(matcher: Matcher<View>) : KRecyclerItem<FeaturedArticleItem>(matcher) {

    val image = KImageView {
        withId(R.id.articleImage)
    }

    val title = KTextView {
        withId(R.id.articleTitle)
    }

    val description = KTextView {
        withId(R.id.articleDescription)
    }

    val text = KTextView {
        withText(R.id.articleExtract)
    }

}