package rsk

interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    fun setTime(time: SuperTime) = setTime(time.hours)
}

interface EndOfTheWorld {
    fun setTime(time: SuperTime) {}
}

class SuperTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class FunTime : Time, EndOfTheWorld {

    override fun setTime(time: SuperTime) {
        super<Time>.setTime(time)
        super<EndOfTheWorld>.setTime(time)
    }

    override fun setTime(hours: Int, mins: Int, secs: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}