package mobile.example.alarmtest;

import android.content.*;
import android.widget.*;

public class MyBroadcastReceiver extends BroadcastReceiver {
	public void onReceive(Context context, Intent intent) {
		Toast.makeText(context, "one time!", Toast.LENGTH_LONG).show();
		// Notification 출력 -채널 등록!!
	}
}