package org.wikipedia.homeworks.homework09

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.wikipedia.R
import org.wikipedia.homeworks.homework07.screens.ExploreScreen
import org.wikipedia.homeworks.homework07.screens.ArticleScreen
import org.wikipedia.homeworks.homework07.screens.InTheNewsScreen
import org.wikipedia.homeworks.homework07.items.InTheNewsItem
import org.wikipedia.homeworks.homework07.recyclers.InTheNewsItemRec
import org.wikipedia.homeworks.homework07.recyclers.InTheNewsScreenRec
import org.wikipedia.homeworks.homework08.OnboardingScreen
import org.wikipedia.main.MainActivity


//2. Реализовать такой сценарий теста:
//- Скипаем онбординг
//- Находим блок In the news (по тексту заголовка)
//- Листаем до третьей картинки и кликаем по ней
//- Кликаем по второй статье из списка
//- Проверяем, что отображается элемент с ID page_web_view (элемент объявить как KView а не KWebView с которым мы ещё не умеем пока работать)
//3. Для каждого задействованного экрана описать PageObject со всеми значимыми элементами

class InTheNewsTests : TestCase(Kaspresso.Builder.withForcedAllureSupport()) {

    @get: Rule
    val activity: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

//    @After
//    fun tearDown() {
//        device.files.pull("/sdcard/Documents/allure-results", "app/build")
//    }

    @Test
    fun checkElementPageWebView() {
        run {
            step("skip onboarding") {
                OnboardingScreen.skipButton.click()
            }
            ExploreScreen.items
                .childWith<InTheNewsItem> {
                    withDescendant {
                        withText(R.string.view_card_news_title)
                    }
                }.invoke {
                    step("click on image #1") {
                        items.childAt<InTheNewsItemRec>(2) {
                            click()
                        }
                    }
                }
//            InTheNewsScreen.items
//                .childAt<InTheNewsScreenRec>(1) {
//                    step("click on article #0") {
//                        title.click()
//                    }
//                }
//            step("look for pageWebView") {
//                ArticleScreen.pageWebView.isVisible()
//            }
        }
    }
}