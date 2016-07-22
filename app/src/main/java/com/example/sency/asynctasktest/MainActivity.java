package com.example.sency.asynctasktest;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;

/**
 * 使用AsyncTask完成异步加载
 */

public class MainActivity extends Activity {

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressDialog = new ProgressDialog(this);
    }

    class DownloadTask extends AsyncTask<Void, Integer, Boolean> {

        @Override
        protected void onPreExecute() {
            progressDialog.show();
        }

        @Override
        protected Boolean doInBackground(Void... params) {
            return true;
        }
    }
}
