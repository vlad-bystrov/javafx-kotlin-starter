package org.example

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty

class Employee(_name: String, _salary: Int) {

    private val nameProperty = SimpleStringProperty(_name)
    private val salaryProperty = SimpleIntegerProperty(_salary)

    var name: String
        get() = nameProperty.value
        set(_name) {
            nameProperty.set(_name)
        }

    var salary: Int
        get() = salaryProperty.value
        set(_salary) {
            salaryProperty.set(_salary)
        }
}

fun main() {
    val emp = Employee("Name", 23)
    emp.name = "Vasia"
    emp.salary = 33000

    println("name: ${emp.name}, salary: ${emp.salary}")
}
