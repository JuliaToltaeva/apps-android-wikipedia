package org.wikipedia.homeworks.homework06

import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher


//Задание: Разработка пользовательских матчеров для геометрических фигур
//https://docs.google.com/document/d/1K2Yhu-ueNwk9jyXpkzi2YZJoZOT8LBvv_NLgMi_f7Dg/edit?tab=t.0

enum class Color { RED, BLUE, GREEN, YELLOW, BLACK, WHITE }

val shapes = listOf(
    Shape(10f, 3, Color.RED), Shape(5f, 4, Color.BLUE), Shape(7f, 2, Color.GREEN),
    Shape(0.5f, 1, Color.YELLOW), Shape(-3f, 5, Color.BLACK), Shape(8f, -2, Color.WHITE),
    Shape(12f, 6, Color.RED), Shape(15f, 8, Color.BLUE), Shape(20f, 4, Color.GREEN),
    Shape(9f, 5, Color.YELLOW), Shape(2f, 3, Color.BLACK), Shape(11f, 7, Color.WHITE),
    Shape(6f, 10, Color.RED), Shape(3f, 2, Color.BLUE), Shape(4f, 1, Color.GREEN),
    Shape(25f, 12, Color.YELLOW), Shape(30f, 14, Color.BLACK), Shape(35f, 16, Color.WHITE),
    Shape(40f, 18, Color.RED), Shape(50f, 20, Color.BLUE)
)

data class Shape(val sideLength: Float, val numberOfSides: Int, val color: Color)


//Проверка длины стороны в заданном диапазоне (например, от 0.1 до 100.0).

class SideLengthInRangeMatcher(

    private val min: Float,
    private val max: Float

) : TypeSafeMatcher<Shape>() {

    override fun describeTo(description: Description) {
        description.appendText("sideLength is between $min and $max")
    }

    override fun matchesSafely(shape: Shape): Boolean {
        return shape.sideLength in min..max
    }

}

//Проверка количества углов:
//Для фигур с 3 и более сторонами количество углов совпадает с количеством сторон.
//Для фигур с 1 или 2 сторонами (линий) углы отсутствуют (значение углов = 0).

class NumberOfCornersMatcher(

    private val numberOfSides: Int,
    private val numberOfCorners: Int

): TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        description.appendText("numberOfSides is equal numberOfCorners $numberOfCorners or 0")
    }

    override fun matchesSafely(shape: Shape): Boolean {
        return when {
            numberOfSides > 3 -> numberOfSides == numberOfCorners
            numberOfSides in 1..2 -> numberOfCorners == 0
            else -> false
        }
    }

}

//Проверка на чётное количество сторон.

class EvenNumberOfSides(

    val numberOfSides: Int

): TypeSafeMatcher<Shape>() {
    override fun describeTo(description: Description) {
        TODO("Not yet implemented")
    }

    override fun matchesSafely(shape: Shape): Boolean {
        TODO("Not yet implemented")
    }

}


//Проверка цвета фигуры.
//Проверка на наличие отрицательной длины стороны (недопустимо).
//Проверка на наличие отрицательного количества сторон (недопустимо).












