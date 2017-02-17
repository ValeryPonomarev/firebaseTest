package com.easysales.firebasetest.services;

import android.util.Log;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by lord on 18.02.2017.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        Log.d("Firebase", FirebaseInstanceId.getInstance().getToken());
    }
}
