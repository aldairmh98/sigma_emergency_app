package com.hackathon.emergency;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class MyMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "id")
                .setSmallIcon(R.drawable.common_google_signin_btn_icon_dark)
                .setContentTitle("HI")
                .setContentText("Ha llegado")
                .setPriority(NotificationCompat.PRIORITY_HIGH);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        System.out.println("Hola");
        // notificationId is a unique int for each notification that you must define
        notificationManager.notify((int) Math.round(Math.random()), builder.build());

    }
}
