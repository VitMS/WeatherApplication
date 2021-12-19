package ru.mine.weatheraplication.model

import ru.mine.weatheraplication.model.dto.WeatherDto

interface Repository {

    fun getWeatherFromServer(): WeatherDto

    fun getWeatherFromLocalStorageRus(): List<WeatherDto>

    fun getWeatherFromLocalStorageWorld(): List<WeatherDto>
}