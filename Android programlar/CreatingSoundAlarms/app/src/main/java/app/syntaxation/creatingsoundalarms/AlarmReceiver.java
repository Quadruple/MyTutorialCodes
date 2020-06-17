package app.syntaxation.creatingsoundalarms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.Toast;

// Implementing BroadcastReceiver for getting the alarm signal
public class AlarmReceiver extends BroadcastReceiver
{
    // This part of the code will work after alarm is received.
    @Override
    public void onReceive(Context context, Intent intent)
    {
        // Giving the user a prompt that says alarm is up.
        Toast.makeText(context, "Alarm! Wake up! Wake up!", Toast.LENGTH_LONG).show();
        // Getting the users default ringtone
        Uri alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        // If the user's default alarm does not exist, making the default alarm as notification sound
        if (alarmUri == null)
        {
            alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        }
        // Setting the ringtone and than playing it
        Ringtone ringtone = RingtoneManager.getRingtone(context, alarmUri);
        ringtone.play();
    }
}
