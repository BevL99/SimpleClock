package com.example.simpleclock;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.TextClock;
import android.widget.ToggleButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    public ConstraintLayout clock1, clock2, clock3, clock4, clock5, clock6, clock7, clock8;
    public TextView city1, city2, city3, city4, city5, city6, city7, city8;
    public TextClock time1, time2, time3, time4, time5, time6, time7, time8;
    public ImageView cityI1, cityI2, cityI3, cityI4, cityI5, cityI6, cityI7, cityI8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clock1 = findViewById(R.id.clock1);
        city1 = clock1.findViewById(R.id.city);
        city1.setText(R.string.sydney);
        time1 = clock1.findViewById(R.id.cityTime);
        time1.setTimeZone("Australia/Sydney");
        cityI1 = clock1.findViewById(R.id.cityImage);
        cityI1.setImageResource(R.drawable.sydney);

        clock2 = findViewById(R.id.clock2);
        city2 = clock2.findViewById(R.id.city);
        city2.setText(R.string.hong_kong);
        time2 = clock2.findViewById(R.id.cityTime);
        time2.setTimeZone("Asia/Hong_Kong");
        cityI2 = clock2.findViewById(R.id.cityImage);
        cityI2.setImageResource(R.drawable.hong_kong);

        clock3 = findViewById(R.id.clock3);
        city3 = clock3.findViewById(R.id.city);
        city3.setText(R.string.london);
        time3 = clock3.findViewById(R.id.cityTime);
        time3.setTimeZone("Europe/London");
        cityI3 = clock3.findViewById(R.id.cityImage);
        cityI3.setImageResource(R.drawable.london);

        clock4 = findViewById(R.id.clock4);
        city4 = clock4.findViewById(R.id.city);
        city4.setText(R.string.seoul);
        time4 = clock4.findViewById(R.id.cityTime);
        time4.setTimeZone("Asia/Seoul");
        cityI4 = clock4.findViewById(R.id.cityImage);
        cityI4.setImageResource(R.drawable.seoul);

        clock5 = findViewById(R.id.clock5);
        city5 = clock5.findViewById(R.id.city);
        city5.setText(R.string.tokyo);
        time5 = clock5.findViewById(R.id.cityTime);
        time5.setTimeZone("Asia/Tokyo");
        cityI5 = clock5.findViewById(R.id.cityImage);
        cityI5.setImageResource(R.drawable.tokyo);

        clock6 = findViewById(R.id.clock6);
        city6 = clock6.findViewById(R.id.city);
        city6.setText(R.string.chicago);
        time6 = clock6.findViewById(R.id.cityTime);
        time6.setTimeZone("America/Chicago");
        cityI6 = clock6.findViewById(R.id.cityImage);
        cityI6.setImageResource(R.drawable.chicago);

        clock7 = findViewById(R.id.clock7);
        city7 = clock7.findViewById(R.id.city);
        city7.setText(R.string.paris);
        time7 = clock7.findViewById(R.id.cityTime);
        time7.setTimeZone("Europe/Paris");
        cityI7 = clock7.findViewById(R.id.cityImage);
        cityI7.setImageResource(R.drawable.paris);

        clock8 = findViewById(R.id.clock8);
        city8 = clock8.findViewById(R.id.city);
        city8.setText(R.string.auckland);
        time8 = clock8.findViewById(R.id.cityTime);
        time8.setTimeZone("Pacific/Auckland");
        cityI8 = clock8.findViewById(R.id.cityImage);
        cityI8.setImageResource(R.drawable.auckland);

        ToggleButton toggle = findViewById(R.id.toggle);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton toggle, boolean isChecked) {
                if(isChecked){
                    time1.setFormat12Hour("HH:mm:ss");
                    time2.setFormat12Hour("HH:mm:ss");
                    time3.setFormat12Hour("HH:mm:ss");
                    time4.setFormat12Hour("HH:mm:ss");
                    time5.setFormat12Hour("HH:mm:ss");
                    time6.setFormat12Hour("HH:mm:ss");
                    time7.setFormat12Hour("HH:mm:ss");
                    time8.setFormat12Hour("HH:mm:ss");
                }
                else{
                    time1.setFormat12Hour("h:mm:ss a");
                    time2.setFormat12Hour("h:mm:ss a");
                    time3.setFormat12Hour("h:mm:ss a");
                    time4.setFormat12Hour("h:mm:ss a");
                    time5.setFormat12Hour("h:mm:ss a");
                    time6.setFormat12Hour("h:mm:ss a");
                    time7.setFormat12Hour("h:mm:ss a");
                    time8.setFormat12Hour("h:mm:ss a");
                }
            }
        });

    }
}
