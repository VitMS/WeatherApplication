package ru.mine.weatheraplication.model

import ru.mine.weatheraplication.model.dto.WeatherDto

class RepositoryImpl : Repository {

    override fun getWeatherFromServer(): WeatherDto {
        return WeatherDto(temperature = -11)
    }

    override fun getWeatherFromLocalStorage(): WeatherDto {
        return WeatherDto(temperature = -7)
    }
}