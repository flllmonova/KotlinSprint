package org.example.lesson_22

fun main() {

    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData("загрузка данных")
    mainScreenViewModel.loadData("наличие загруженных данных")
}

class MainScreenViewModel{

    private val mainScreenState = MainScreenState(data = "отсутствие данных")

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    )

    fun loadData(newState: String): MainScreenState {
        val newMainScreenState =
            if (newState == "загрузка данных") mainScreenState.copy(data = newState, isLoading = true)
            else mainScreenState.copy(data = newState, isLoading = false)
        return newMainScreenState
    }
}
