import kotlin.math.pow

object ResistorColorTrio {

    fun text(vararg input: Color): String {
        val (firstDigit, secondDigit, numberOfZeroes) = input

        var result = "${firstDigit.ordinal}${secondDigit.ordinal}".toInt()
        result *= 10.toDouble().pow(numberOfZeroes.ordinal.toDouble()).toInt()

        val unitPosition = (result.toString().length - 1) / 3

        result /= 1_000.toDouble().pow(unitPosition.toDouble()).toInt()

        val unit = Unit.values()[unitPosition].name.lowercase()

        return "$result $unit"
    }
}
