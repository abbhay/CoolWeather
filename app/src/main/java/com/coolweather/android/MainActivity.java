<<<<<<< HEAD
package com.coolweather.android;
=======
package com.example.android;
>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

<<<<<<< HEAD
=======
import com.example.android.R;

>>>>>>> 9d4ce5daec21a506fc4336bbe945b7f6d380f284
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        // 从 SharedPreferences 中读取缓存数据
        if(prefs.getString("weather",null)!=null){
            // 之前请求过则直接跳转到天气信息
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
