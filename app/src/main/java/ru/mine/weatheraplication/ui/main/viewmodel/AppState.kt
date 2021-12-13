package ru.mine.weatheraplication.ui.main.viewmodel

import ru.mine.weatheraplication.model.dto.WeatherDto

sealed class AppState {
    data class Success(val weatherData: WeatherDto) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
