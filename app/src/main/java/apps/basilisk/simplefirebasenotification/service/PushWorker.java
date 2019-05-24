package apps.basilisk.simplefirebasenotification.service;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class PushWorker extends Worker {
    private static final String TAG = "PushWorker";

    public PushWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d(TAG, "doWork: ");

        Data inputData = getInputData();

        Log.d(TAG, "doWork: name = " + inputData.getString("name"));
        Log.d(TAG, "doWork: age = " + inputData.getString("age"));
        Log.d(TAG, "doWork: email = " + inputData.getString("email"));

        Data outputData = new Data.Builder()
                .putString("key1", "val1")
                .putString("key2", "val2")
                .putString("key3", "val3")
                .build();

        return Result.success(outputData);
    }
}
