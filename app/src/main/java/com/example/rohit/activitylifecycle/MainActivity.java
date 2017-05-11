package com.example.rohit.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity","onCreate **") ;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity","onStart **") ;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity","onResume **") ;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","onPause **") ;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","onStop **") ;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivity","onRestart **") ;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","onDestroy **") ;
    }

    public void callNext(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        intent.putExtra("name","rakesh");
        startActivity(intent);
    }
}
