package fundamentos.oo.inheritance

class Ferrari: Car(maxSpeed = 350), Sporting {
    override var boost: Boolean = false
        get() = field
        set(value) {field = value}

    override fun accelerate() {
        updateSpeed(if (boost) 50 else 25)
    }

    override fun decelarate() {
        updateSpeed(-25)
    }
}