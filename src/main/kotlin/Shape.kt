interface Shape {

    fun draw()

    fun getArea()
}

class Square(var side: Int) : Shape {
    override fun draw() {
        println("Drawing Square")
    }

    override fun getArea() {
        println("Area of Square is : ${side*side}")
    }
}

class Rectangle(var length: Int, var width: Int) : Shape {
    override fun draw() {
        println("Drawing Rectangle")
    }

    override fun getArea() {
        println("Area of Rectangle is : ${length*width}")
    }
}

class Circle(var radius: Int): Shape {
    override fun draw() {
        println("Drawing Circle")
    }

    override fun getArea() {
        println("Area of circle is : ${2*3.14*radius*radius}")
    }
}

enum class Shapes {
    SQUARE,RECTANGLE,CIRCLE
}

class ShapeFactory {
    fun getShape(shape: Shapes) : Shape?{
        when(shape) {
            Shapes.CIRCLE -> return Circle(10)
            Shapes.SQUARE -> return Square(10)
            Shapes.RECTANGLE -> return Rectangle(10,20)
            else -> {
                println("Incorrect Shape")
                return null
            }
        }
    }
}
