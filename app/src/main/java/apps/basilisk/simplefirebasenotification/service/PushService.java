package apps.basilisk.simplefirebasenotification.service;


import android.os.Bundle;
import android.util.Log;

import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;

public class PushService extends JobService {
    private static final String TAG = "PushService";

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "onStartJob: " + params.getTag());
        Bundle extras = params.getExtras();
        if (extras != null) {
            if (extras.containsKey("name")) Log.d(TAG, "onStartJob: name = " + extras.get("name"));
            if (extras.containsKey("age")) Log.d(TAG, "onStartJob: age = " + extras.get("age"));
            if (extras.containsKey("email")) Log.d(TAG, "onStartJob: email = " + extras.get("email"));
        }
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
