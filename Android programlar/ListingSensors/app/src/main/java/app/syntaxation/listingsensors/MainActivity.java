package app.syntaxation.listingsensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Accessing to the sensors through SensorManager
        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE) ;

        // Getting the sensor list with getSensorList method
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL) ;

        // Defining a variable for displaying all sensors
        TextView sensorListTextView = (TextView) findViewById(R.id.sensorListTextView) ;

        StringBuilder stringBuilder = new StringBuilder();

        // Getting all the sensors with a for loop
        for (Sensor sensor : sensorList) {
            stringBuilder.append("Name : " + sensor.getName() + "\n");
            stringBuilder.append("Type : " + sensor.getType() + "\n");
            stringBuilder.append("Vendor : " + sensor.getVendor() + "\n");
            stringBuilder.append("Version : " + sensor.getVersion() + "\n");
            stringBuilder.append("Maximum Range : " + sensor.getMaximumRange() + "\n");
            stringBuilder.append("Power : " + sensor.getPower() + "\n");
            stringBuilder.append("\n");
        }
        sensorListTextView.setText(stringBuilder.toString());
    }
}
