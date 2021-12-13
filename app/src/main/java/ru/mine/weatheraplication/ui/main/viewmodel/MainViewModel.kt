package ru.mine.weatheraplication.ui.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.mine.weatheraplication.model.Repository
import ru.mine.weatheraplication.model.RepositoryImpl
import java.lang.Thread.sleep
import kotlin.random.Random

class MainViewModel(
    private val liveDataToObserver: MutableLiveData<AppState> = MutableLiveData(),
    private val repository: Repository = RepositoryImpl()
) : ViewModel() {

    fun getLiveData() = liveDataToObserver

    fun getWeather() = getDataFromLocalSource()

    fun getWeatherFromLocalSource() = getDataFromLocalSource()

    fun getWeatherFromRemoteSource() = getDataFromLocalSource()

    private fun getDataFromLocalSource() {
        liveDataToObserver.value = AppState.Loading
        Thread {
            sleep(1_000)
            if (Random.nextBoolean()) {
                liveDataToObserver.postValue(AppState.Success(repository.getWeatherFromLocalStorage()))
            } else {
                liveDataToObserver.postValue(AppState.Error(Exception("Нет интернета")))
            }
        }.start()
    }
}