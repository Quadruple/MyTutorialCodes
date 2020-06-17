package app.syntaxation.creatingpedometer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private TextView StepShow ;

    // Determining a sensor manager for calling the sensor services
    private SensorManager mSensorManager ;

    // Determining sensors for matching them with sensor types
    private Sensor mStepCounterSensor ;
    private Sensor mStepDetectorSensor ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencing the widgets
        StepShow = (TextView) findViewById(R.id.StepShow) ;

        // Getting the sensor service for calling
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE) ;

        // Calling the sensors on sensor variables using sensor service variable
        mStepCounterSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER) ;
        mStepDetectorSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR) ;
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        // Determining variables for sensors and sensor returning values
        // Determining a sensor variable for getting the sensor type and assign them
        Sensor sensor = event.sensor ;
        float[] values = event.values ;
        int value = -1 ;

        // Getting the value from values array, parsing the float to int and assigning it to the value variable for display
        if (values.length > 0) {
            value = (int) values[0] ;
        }

        // Getting the sensor type and displaying the counted steps
        if (sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
            StepShow.setText("Step Counter Detected :" + value);
        }
        else if(sensor.getType() == Sensor.TYPE_STEP_DETECTOR) {
            StepShow.setText("Step Detector Detected :" + value);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override
    protected void onResume() {
        super.onResume();

        // While the program resumes, assigning registers on both sensors to make them active
        mSensorManager.registerListener(this , mStepCounterSensor , SensorManager.SENSOR_DELAY_FASTEST) ;
        mSensorManager.registerListener(this , mStepDetectorSensor , SensorManager.SENSOR_DELAY_FASTEST);

    }

    @Override
    protected void onStop() {
        super.onStop();

        // When the program stops registered sensors should be unregistered for makning them stop
        mSensorManager.unregisterListener(this , mStepCounterSensor);
        mSensorManager.unregisterListener(this , mStepDetectorSensor);


    }
}




















