package org.wikipedia.homeworks.homework13

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class ReferenceScreenItem(matcher: Matcher<View>) : KRecyclerItem<ReferenceScreen>(matcher) {

    val number = KTextView{
        withText(R.id.reference_id)
    }

    val text = KTextView{
        withText(R.id.reference_text)
    }

    val textLink = KTextView{
        withText(R.id.reference_ext_link)
    }

}