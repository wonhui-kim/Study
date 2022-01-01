package mobile.example.alarmtest;

import android.app.PendingIntent;
import android.content.*;
import android.widget.*;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class RepeatReceiver extends BroadcastReceiver {

	public void onReceive(Context context, Intent intent) {
//		Toast.makeText(context, "Hi all!", Toast.LENGTH_SHORT).show();


		// notification 생성
		/*추가*/
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
		PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);

		NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "MY_CHANNEL")
				.setSmallIcon(R.drawable.ic_stat_name)
				.setContentTitle("기상 시간")
				.setContentText("일어나! 공부할 시간이야!")
				.setPriority(NotificationCompat.PRIORITY_DEFAULT)
				.setContentIntent(pendingIntent)
				.setAutoCancel(true);

		NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
	}



}