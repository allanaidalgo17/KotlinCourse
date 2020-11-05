package fundamentos.oo.inheritance

interface Sporting {
    var boost: Boolean

    fun turnOnBoost() {
        boost = true
    }

    fun turnOffBoost() {
        boost = false
    }
}