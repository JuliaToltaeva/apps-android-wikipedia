package org.wikipedia.homeworks.homework05

import android.widget.LinearLayout
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R
import org.wikipedia.views.DiscreteSeekBar

val themeChangingTextSize = KView {
    withId(R.id.text_size_seek_bar)
    isInstanceOf(DiscreteSeekBar::class.java)
}

val themeChangingTextSizeSmallT = KTextView {
    withId(R.id.buttonDecreaseTextSize)
    isInstanceOf(MaterialTextView::class.java)
    withParent {
        isInstanceOf(LinearLayout::class.java)
    }
}

val themeChangingTextSizeBigT = KTextView {
    withId(R.id.buttonIncreaseTextSize)
    isInstanceOf(MaterialTextView::class.java)
    withParent {
        isInstanceOf(LinearLayout::class.java)
    }
}

val themeChangingColor = KView {
    isInstanceOf(LinearLayout::class.java)
}

val themeChangingColorLight = KView {
    isInstanceOf(MaterialButton::class.java)
    withParent {
        isInstanceOf(LinearLayout::class.java)
    }
}

val themeMatchSystemTheme = KView {
    withId(R.id.theme_chooser_match_system_theme_switch)
    withParent {
        isInstanceOf(LinearLayout::class.java)
    }
}