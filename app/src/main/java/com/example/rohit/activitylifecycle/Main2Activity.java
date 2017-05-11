package com.example.rohit.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i("Main2Activity","onCreate **") ;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main2Activity","onStart **") ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main2Activity","onResume **") ;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main2Activity","onPause **") ;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Main2Activity","onStop **") ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Main2Activity","onDestroy **") ;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Main2Activity","onRestart **") ;
    }
}
