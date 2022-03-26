package com.example.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.timer.databinding.ActivityMainBinding
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private val timer1tv by lazy {
        binding.tvTimer1
    }
    private val timer2tv by lazy{
        binding.tvTimer2
    }
    private val btn_start1 by lazy{
        binding.btnStart1
    }
    private val btn_start2 by lazy{
        binding.btnStart5
    }
    private val btn_reset by lazy{
        binding.btnReset
    }
    private var timer1 : Double = 0.00
    private var timer2 : Double = 0.00

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btn_start1.setOnClickListener {
           lifecycleScope.launch { incrementaApos1000Millis() }
        }
        btn_start2.setOnClickListener {
                lifecycleScope.launch { incrementaApos5000Millis() }


        }
        btn_reset.setOnClickListener {
            timer1 = 0.0
            timer2 = 0.0
            updateTimer()
        }
        updateTimer()
    }

    private suspend fun incrementaApos5000Millis() {
        delay(5000)
        timer2 += 5
        updateTimer()
    }

    private suspend fun incrementaApos1000Millis() {
        delay(1000)
        timer1 += 1
        updateTimer()
    }

    private fun updateTimer(){
        timer1tv.text = timer1.toString()
        timer2tv.text = timer2.toString()
    }

}