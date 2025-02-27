package org.wikipedia.homeworks.homework09

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.homeworks.homework07.ExploreScreen
import org.wikipedia.homeworks.homework07.InTheNewsItem
import org.wikipedia.homeworks.homework07.InTheNewsItemRecycler
import org.wikipedia.homeworks.homework08.OnboardingScreen
import org.wikipedia.main.MainActivity


//2. Реализовать такой сценарий теста:
//- Скипаем онбординг
//- Находим блок In the news (по тексту заголовка)
//- Листаем до третьей картинки и кликаем по ней
//- Кликаем по второй статье из списка
//- Проверяем, что отображается элемент с ID page_web_view (элемент объявить как KView а не KWebView с которым мы ещё не умеем пока работать)
//3. Для каждого задействованного экрана описать PageObject со всеми значимыми элементами

class InTheNewsTests : TestCase() {

    @get: Rule
    val activity: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun checkElementPageWebView() {
        run {
            step("skip onboarding") {
                OnboardingScreen.skipButton.click()
            }
            ExploreScreen.items.childAt<InTheNewsItem>(7) {
                step("find In the news") {
                    inTheNewsHeader {
                        isDisplayed()
                    }
                }
                step("click on image #3") {
                    recyclerInTheNews.childAt<InTheNewsItemRecycler>(2) {
                        click()
                    }
                    step("click on state #2") {


                    }
                }
            }

//            view_list_card_item_title

        }
    }
}