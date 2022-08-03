open class Person constructor(_firstName: String, _lastName: String ){
    var firstName: String
    var lastName: String

    init {
        firstName = _firstName
        lastName = _lastName
    }
}

class Employee(_firstName: String, _lastName: String, _salary : Float) : Person(_firstName, _lastName) {

    var salary : Float
    init {
        salary = _salary
    }
}