package ru.mine.weatheraplication.ui.main.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.mine.weatheraplication.R
import ru.mine.weatheraplication.databinding.MainActivityBinding
import ru.mine.weatheraplication.ui.main.view.main.MainFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}