package ru.mine.weatheraplication.model

import ru.mine.weatheraplication.model.dto.WeatherDto

interface Repository {

    fun getWeatherFromServer(): WeatherDto

    fun getWeatherFromLocalStorage(): WeatherDto
}