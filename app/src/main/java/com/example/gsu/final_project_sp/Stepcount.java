package com.example.gsu.final_project_sp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Stepcount extends AppCompatActivity implements SensorEventListener{


    SensorManager sensorManager;
    Sensor sensor;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepcount);
        display = (TextView) findViewById(R.id.textView3);
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
    }


    @Override
    public void onResume() {
super.onResume();
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

        if (sensor!=null) {
            sensorManager.registerListener(this,sensor,SensorManager.SENSOR_DELAY_UI);
        } else {
            Toast.makeText(this,"No sensor detected",Toast.LENGTH_LONG).show();
        }
    }



    @Override
    public void onSensorChanged(SensorEvent event) {

        display.setText(""+ event.values[0]+".");

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
