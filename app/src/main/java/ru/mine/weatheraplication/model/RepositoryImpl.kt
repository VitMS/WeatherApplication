package ru.mine.weatheraplication.model

import ru.mine.weatheraplication.model.dto.WeatherDto
import ru.mine.weatheraplication.model.dto.getRussianCities
import ru.mine.weatheraplication.model.dto.getWorldCities

class RepositoryImpl : Repository {

    override fun getWeatherFromServer(): WeatherDto {
        return WeatherDto(temperature = -11)
    }

    override fun getWeatherFromLocalStorageRus(): List<WeatherDto> {
        return getRussianCities()
    }

    override fun getWeatherFromLocalStorageWorld(): List<WeatherDto> {
        return getWorldCities()
    }
}