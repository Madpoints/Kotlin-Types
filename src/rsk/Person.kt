package rsk

abstract class Person {
    var firstName:String = ""
    var lastName:String = ""

    open fun getName():String = "$firstName $lastName"
    abstract fun getAddress():String
}

class Student:Person() {
    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }
}