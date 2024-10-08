package org.example.lesson_18

class Screen(
    val screenWidth: Int,
    val screenHeight: Int,
) {

    fun draw(x: Int, y: Int, drawing: Drawing) {

        if (!(checkCoordinate(x, screenWidth)) && !(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinates("x", "y", drawing)
            return
        }

        if (!(checkCoordinate(x, screenWidth))) {
            notifyAboutWrongCoordinate("x", drawing)
            return
        }

        if (!(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinate("y", drawing)
            return
        }

        drawObject(x, y, drawing)
    }

    fun draw(x: Int, y: Float, drawing: Drawing) {

        if (!(checkCoordinate(x, screenWidth)) && !(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinates("x", "y", drawing)
            return
        }

        if (!(checkCoordinate(x, screenWidth))) {
            notifyAboutWrongCoordinate("x", drawing)
            return
        }

        if (!(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinate("y", drawing)
            return
        }

        drawObject(x, y, drawing)
    }

    fun draw(x: Float, y: Int, drawing: Drawing) {

        if (!(checkCoordinate(x, screenWidth)) && !(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinates("x", "y", drawing)
            return
        }

        if (!(checkCoordinate(x, screenWidth))) {
            notifyAboutWrongCoordinate("x", drawing)
            return
        }

        if (!(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinate("y", drawing)
            return
        }

        drawObject(x, y, drawing)
    }

    fun draw(x: Float, y: Float, drawing: Drawing) {

        if (!(checkCoordinate(x, screenWidth)) && !(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinates("x", "y", drawing)
            return
        }

        if (!(checkCoordinate(x, screenWidth))) {
            notifyAboutWrongCoordinate("x", drawing)
            return
        }

        if (!(checkCoordinate(y, screenHeight))) {
            notifyAboutWrongCoordinate("y", drawing)
            return
        }

        drawObject(x, y, drawing)
    }

    fun checkCoordinate(coordinate: Number, finalScreenPoint: Int): Boolean {
        return when {
            coordinate is Int -> coordinate in 0..finalScreenPoint
            coordinate is Float -> coordinate in 0f..finalScreenPoint.toFloat()
            else -> false
        }
    }

    fun notifyAboutWrongCoordinate(coordinate: String, drawing: Drawing) {
        println("Для создания объекта ${drawing.name} неверно указана координата: $coordinate")
    }

    fun notifyAboutWrongCoordinates(coordinate1: String, coordinate2: String, drawing: Drawing) {
        println("Для создания объекта ${drawing.name} неверно указаны координаты: $coordinate1 и $coordinate2")
    }

    fun drawObject(x: Number, y: Number, drawing: Drawing) {
        println("На координатах ($x, $y) нарисован объект ${drawing.name}")
    }
}

abstract class Drawing {
    abstract val name: String
}

class Point : Drawing() {
    override val name = "точка"
}

class Square : Drawing() {
    override val name = "квадрат"
}

class Circle : Drawing() {
    override val name = "круг"
}