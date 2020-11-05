package fundamentos.oo.inheritance

open class Car(var maxSpeed: Int = 200, var currentSpeed: Int = 0) {
    protected fun updateSpeed(speed: Int) {
        val newSpeed = currentSpeed + speed
        currentSpeed = when(newSpeed) {
            in 0..maxSpeed -> newSpeed
            in maxSpeed..Int.MAX_VALUE -> maxSpeed
            else -> 0
        }
    }

    open fun accelerate() {
        updateSpeed(5)
    }

    open fun decelarate() {
        updateSpeed(-5)
    }

    override fun toString(): String {
        return "The current speed is $currentSpeed km/h."
    }
}