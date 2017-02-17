package com.easysales.firebasetest.services;

import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;

import com.easysales.firebasetest.R;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by lord on 18.02.2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle(remoteMessage.getNotification().getTitle())
                    .setContentText(remoteMessage.getNotification().getBody());

        NotificationManager notify = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notify.notify(101, mBuilder.build());
    }
}
