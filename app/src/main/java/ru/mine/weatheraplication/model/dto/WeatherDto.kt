package ru.mine.weatheraplication.model.dto

data class WeatherDto(
    val city: CityDto = getDefaultCity(),
    val temperature: Int,
    val feelsLike: Int = 0
)

fun getDefaultCity() = CityDto("Москва", 55.755826, 37.617299900000035)