package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.loader.content.AsyncTaskLoader

class MainActivity : AppCompatActivity() {

    val CITY: String ="bkaha,bd"
    val API:String="455643b2c5928dc732654b9e3b0c317a"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weatherTask().execute()
    }
    inner class weatherTask(): AsyncTask<String,void,String>()
    {
        override fun onPreExecute()
        {
            super.onPreExecute()
        }
    }

}