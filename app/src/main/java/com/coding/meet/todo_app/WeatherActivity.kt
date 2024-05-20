package com.coding.meet.todo_app

import android.icu.text.SimpleDateFormat
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject
import java.util.Calendar
import java.util.Date
import java.util.Locale

class WeatherActivity : AppCompatActivity() {

    private lateinit var weatherTextView: TextView
    private lateinit var tempTextView: TextView
    private lateinit var humidityTextView: TextView
    private lateinit var windTextView: TextView
    private lateinit var weatherProgressBar: ProgressBar
    private lateinit var weatherButton: Button
    private lateinit var buttonBack: ImageView
    private lateinit var queue: RequestQueue
    private lateinit var sunriseTextView: TextView
    private lateinit var sunsetTextView: TextView
    private lateinit var pressureTextView: TextView
    private lateinit var tempminTextView: TextView
    private lateinit var tempmaxTextView: TextView
    private lateinit var address: TextView
    private lateinit var textViewTime: TextView
    private lateinit var feel_like: TextView
    private val API_KEY = "e8ac77fd5b19bad2ce56dab71293a88f"
    private val CITY = "Adler,ru"

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather)

        // Инициализация переменных
        weatherTextView = findViewById(R.id.descrTxt)
        tempTextView = findViewById(R.id.temp)
        humidityTextView = findViewById(R.id.humidity)
        windTextView = findViewById(R.id.wind)
        weatherProgressBar = findViewById(R.id.loader)
        weatherButton = findViewById(R.id.weather_button)
        buttonBack = findViewById(R.id.close_weather)
        sunriseTextView = findViewById(R.id.sunrise)
        sunsetTextView = findViewById(R.id.sunset)
        pressureTextView = findViewById(R.id.pressure)
        tempminTextView = findViewById(R.id.temp_min)
        tempmaxTextView = findViewById(R.id.temp_max)
        address = findViewById(R.id.address)
        textViewTime = findViewById(R.id.updated_at)
        feel_like = findViewById(R.id.feel_like)

        buttonBack.setOnClickListener {
            finish()
        }
        weatherButton.setOnClickListener {
            getWeather()
        }

    }
    @RequiresApi(Build.VERSION_CODES.N)
    private fun getWeather() {
        weatherProgressBar.visibility = View.VISIBLE
        weatherTextView.text = ""
        tempTextView.text = ""
        humidityTextView.text = ""
        windTextView.text = ""

        val url = "https://api.openweathermap.org/data/2.5/weather?q=$CITY&appid=$API_KEY&units=metric&lang=ru"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                weatherProgressBar.visibility = View.GONE
                val jsonObject = JSONObject(response)

                val weather = jsonObject.getJSONArray("weather").getJSONObject(0).getString("description")
                val temp = jsonObject.getJSONObject("main").getInt("temp")
                val humidity = jsonObject.getJSONObject("main").getString("humidity")
                val windSpeed = jsonObject.getJSONObject("wind").getString("speed")
                val sunrise = jsonObject.getJSONObject("sys").getLong("sunrise")
                val sunset = jsonObject.getJSONObject("sys").getLong("sunset")
                val pressure = jsonObject.getJSONObject("main").getString("pressure")
                val tempMin = jsonObject.getJSONObject("main").getInt("temp_min")
                val tempMax = jsonObject.getJSONObject("main").getInt("temp_max")
                val country = jsonObject.getJSONObject("sys").getString("country")
                val city = jsonObject.getString("name")
                val feel_temp = jsonObject.getJSONObject("main").getInt("feels_like")


                weatherTextView.text = weather
                tempTextView.text = "$temp°C"
                humidityTextView.text = "$humidity%"
                windTextView.text = "$windSpeed м/с"
                sunriseTextView.text = SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(Date(sunrise*1000))
                sunsetTextView.text = SimpleDateFormat("hh:mm a", Locale.ENGLISH).format(Date(sunset*1000))
                pressureTextView.text = "$pressure hPa"
                tempminTextView.text = "Мин. темп.: $tempMin°C"
                tempmaxTextView.text = "Макс. темп.: $tempMax°C"
                address.text = "$city, $country"
                feel_like.text = "$feel_temp°C"


                val calendar = Calendar.getInstance()
                val year = calendar[Calendar.YEAR]
                val month = calendar[Calendar.MONTH] + 1
                val day = calendar[Calendar.DAY_OF_MONTH]

                val hour = calendar[Calendar.HOUR_OF_DAY]
                val minute = calendar[Calendar.MINUTE]
                val second = calendar[Calendar.SECOND]

                val currentDate = String.format("%02d.%02d.%04d", day, month, year)
                val currentTime = String.format("%02d:%02d:%02d", hour, minute, second)

                val currentDateTime = "$currentDate $currentTime"
                textViewTime.setText(currentDateTime)

            },
            { _ ->
                weatherProgressBar.visibility = View.GONE
                weatherTextView.text = "Ошибка получения данных о погоде!"
            })

        // Инициализация очереди запросов с использованием контекста активности
        queue = Volley.newRequestQueue(this)
        // Добавление запроса в очередь
        queue.add(stringRequest)
    }
}