package rsk

fun main(args: Array<String>) {
    val kevin = Student("Kevin", "Day",1, "some tutor")
    println(kevin.id)

    Student.createPostgrad("Ray")
    Student.createUndergrad("Steph")
}

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val kevin = Student("Kevin", "Day",1, "some tutor")
            println(kevin.id)

            Student.createPostgrad("Ray")
            Student.createUndergrad("Steph")
        }
    }
}

abstract class Person(var firstName:String,  var lastName:String) {

    open fun getName():String = "$firstName $lastName"
    abstract fun getAddress():String
}

open class Student(firstName: String, lastName: String, _id:Int, var tutor: String = "") : Person(firstName, lastName) {
    val id : Int

    init {
        id = _id

    }

    fun enrole(courseName: String) {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }

    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }

    companion object : XmlSerializer<Student>{
        override fun toXml(item: Student) {

        }

        fun createUndergrad(name: String): Undergraduate {
            return Undergraduate(name)
        }
        fun createPostgrad(name: String): Postgraduate {
            return Postgraduate(name)
        }
    }
}

class Undergraduate(firstName: String) : Student(firstName, "", 1) {

}

class Postgraduate(firstName: String) : Student(firstName, "", 1) {

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}