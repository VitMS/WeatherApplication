package ru.mine.weatheraplication.model.dto

data class WeatherDto(
    val city: CityDto = getDefaultCity(),
    val temperature: Int,
    val feelsLike: Int = 0
)

fun getDefaultCity() = CityDto("Москва", 55.755826, 37.617299900000035)

fun getWorldCities(): List<WeatherDto> {
    return listOf(
        WeatherDto(
            city = CityDto(city = "Лондон", lat = 51.5085300, lon = -0.1257400),
            temperature = 1,
            feelsLike = 2
        ),
        WeatherDto(
            city = CityDto(city = "Токио", lat = 35.6895000, lon = 139.6917100),
            temperature = 3,
            feelsLike = 4
        ),
        WeatherDto(
            city = CityDto(city = "Париж", lat = 48.8534100, lon = 2.3488000),
            temperature = 5,
            feelsLike = 6
        ),
        WeatherDto(
            city = CityDto(city = "Берлин", lat = 52.52000659999999, lon = 13.404953999999975),
            temperature = 7,
            feelsLike = 8
        ),
        WeatherDto(
            city = CityDto(city = "Рим", lat = 41.9027835, lon = 12.496365500000024),
            temperature = 9,
            feelsLike = 10
        ),
        WeatherDto(
            city = CityDto(city = "Минск", lat = 53.90453979999999, lon = 27.561524400000053),
            temperature = 11,
            feelsLike = 12
        ),
        WeatherDto(
            city = CityDto(city = "Стамбул", lat = 41.0082376, lon = 28.97835889999999),
            temperature = 13,
            feelsLike = 14
        ),
        WeatherDto(
            city = CityDto(city = "Вашингтон", lat = 38.9071923, lon = -77.03687070000001),
            temperature = 15,
            feelsLike = 16
        ),
        WeatherDto(
            city = CityDto(city = "Киев", lat = 50.4501, lon = 30.523400000000038),
            temperature = 17,
            feelsLike = 18
        ),
        WeatherDto(
            city = CityDto(city = "Пекин", lat = 39.90419989999999, lon = 116.40739630000007),
            temperature = 19,
            feelsLike = 20
        )
    )
}

fun getRussianCities(): List<WeatherDto> {
    return listOf(
        WeatherDto(
            city = CityDto(city = "Москва", lat = 55.755826, lon = 37.617299900000035),
            temperature = 1,
            feelsLike = 2
        ),
        WeatherDto(
            city = CityDto(city = "Санкт-Петербург", lat = 59.9342802, lon = 30.335098600000038),
            temperature = 3,
            feelsLike = 3
        ),
        WeatherDto(
            city = CityDto(city = "Новосибирск", lat = 55.00835259999999, lon = 82.93573270000002),
            temperature = 5,
            feelsLike = 6
        ),
        WeatherDto(
            city = CityDto(city = "Екатеринбург", lat = 56.83892609999999, lon = 60.60570250000001),
            temperature = 7,
            feelsLike = 8
        ),
        WeatherDto(
            city = CityDto(city = "Нижний Новгород", lat = 56.2965039, lon = 43.936059),
            temperature = 9,
            feelsLike = 10
        ),
        WeatherDto(
            city = CityDto(city = "Казань", lat = 55.8304307, lon = 49.06608060000008),
            temperature = 11,
            feelsLike = 12
        ),
        WeatherDto(
            city = CityDto(city = "Челябинск", lat = 55.1644419, lon = 61.4368432),
            temperature = 13,
            feelsLike = 14
        ),
        WeatherDto(
            city = CityDto(city = "Омск", lat = 54.9884804, lon = 73.32423610000001),
            temperature = 15,
            feelsLike = 16
        ),
        WeatherDto(
            city = CityDto(city = "Ростов-на-Дону", lat = 47.2357137, lon = 39.701505),
            temperature = 17,
            feelsLike = 18
        ),
        WeatherDto(
            city = CityDto(city = "Уфа", lat = 54.7387621, lon = 55.972055400000045),
            temperature = 19,
            feelsLike = 20
        )
    )
}
