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

    fun getWeatherFromLocalSourceRus() = getDataFromLocalSource(isRussian = true)

    fun getWeatherFromLocalSourceWorld() = getDataFromLocalSource(isRussian = false)

    fun getWeatherFromRemoteSource() = getDataFromLocalSource(isRussian = true)

    private fun getDataFromLocalSource(isRussian: Boolean) {
        liveDataToObserver.value = AppState.Loading
        Thread {
            sleep(1_000)
            if (Random.nextBoolean()) {
                liveDataToObserver.postValue(
                    AppState.Success(
                        if (isRussian) {
                            repository.getWeatherFromLocalStorageRus()
                        } else {
                            repository.getWeatherFromLocalStorageWorld()
                        }
                    )
                )
            } else {
                liveDataToObserver.postValue(AppState.Error(Exception("Заглушка ошибки")))
            }
        }.start()
    }
}