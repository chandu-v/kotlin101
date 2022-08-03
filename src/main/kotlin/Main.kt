fun main(args: Array<String>) {
    println("Hello World!")

    var name = "chandu"
    val company = "Paytm"
    println("Name is: $name");
    name = "Changed Chandu"
    println("Name is: $name");

    var students = listOf("chandu","mukesh","venu","dp","mahesh")
    students.get(0);
    var subjects = mutableListOf("maths","physics","chemistry")
    subjects.add("biology")
    println("====Students====")
    students.forEach { student -> println(student) }
    println("====Students with Index====")
    students.forEachIndexed { index, student -> println("$index -> $student") }
    println("====Subjects====")
    subjects.forEach{subject -> println(subject)}
    println("====Employee Company Map====")
    var empCompany = mapOf("chandu" to "paytm","mukesh" to "keka","venu" to "cognizant", "dp" to "quapita")
    empCompany.entries.forEach{ entry -> println("${entry.key} = ${entry.value}")}
    val num1 = 1;
    val num2 = 3;
    val total = addTwoNumbers(num1, num2)
    println("Sum of $num1 , $num2 is $total")
    val diff = subtract(num2 = 10, num1 = 1)
    println("Difference is : $diff")

    val person = Person("Chandu","Vutukuri")
    println("FirstName: ${person.firstName}, LastName: ${person.lastName}")
    val employee = Employee("Chandu" , "V", 13000F)
    println("Employee FirstName: ${employee.firstName}, LastName: ${employee.lastName}, Salary: ${employee.salary}")

    val shapeFactory = ShapeFactory()
    implementShapeFunction(shapeFactory.getShape(Shapes.CIRCLE))
    implementShapeFunction(shapeFactory.getShape(Shapes.SQUARE))
    implementShapeFunction(shapeFactory.getShape(Shapes.RECTANGLE))
}

fun implementShapeFunction(shape: Shape?) {
    if(shape != null){
        shape.draw()
        shape.getArea()
    }
}


fun addTwoNumbers(num1: Int, num2: Int): Int {
    return num1*num2
}

fun subtract(num1: Int = 0, num2 : Int = 0) = num1-num2