import kotlin.math.pow

object ResistorColorTrio {

    fun text(vararg input: Color): String {
        val (firstDigit, secondDigit, numberOfZeroes) = input
        var result = "${firstDigit.ordinal}${secondDigit.ordinal}".toInt()
        result *= 10.toDouble().pow(numberOfZeroes.ordinal.toDouble()).toInt()
        var i = 0
        while (result > 1_000) {
            i += 1
            result /= 1_000
        }
        val unit = Unit.values()[i].name.lowercase()
        return "$result $unit"
    }
}
