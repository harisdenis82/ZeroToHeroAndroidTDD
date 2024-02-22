package ru.easycode.zerotoheroandroidtdd

interface Count {

    fun initial(number: String): UiState

    fun increment(number: String): UiState

    fun decrement(number: String): UiState

    class Base(private val step: Int, private val max: Int, private val min: Int) : Count {

        init {
            if (step < 1) throw IllegalStateException("step should be positive, but was $step")
            if (max < 1) throw IllegalStateException("max should be positive, but was $max")
            if (step > max) throw IllegalStateException("max should be more than step")
            if (min > max) throw IllegalStateException("max should be more than min")
        }

        override fun initial(number: String): UiState {
            val digital = number.toInt()
            return when (digital) {
                min -> UiState.Min(number)
                max -> UiState.Max(number)
                else -> UiState.Base(number)
            }
        }

        override fun increment(number: String): UiState {
            val digital = number.toInt()
//            val result = digital + step
//            return if (result + step <= max) UiState.Base(result.toString())
//            else UiState.Max(result.toString())
            val result = digital + step
            return initial(result.toString())
        }

        override fun decrement(number: String): UiState {
            val digital = number.toInt()
//            val result = digital - step
//            return if (result != 0 && result <= max) UiState.Base(result.toString())
//            else UiState.Min(result.toString())
            val result = digital - step
            return initial(result.toString())
        }

    }
}