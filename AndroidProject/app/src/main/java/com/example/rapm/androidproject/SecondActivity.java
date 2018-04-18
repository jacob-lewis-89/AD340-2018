package com.example.rapm.androidproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(R.layout.activity_second);

        if(getIntent().hasExtra("userInput")){
            TextView tv = (TextView)findViewById(R.id.intentTextView);
            String userInputEditTextResult = getIntent().getExtras().getString("userInput");
            tv.setText(userInputEditTextResult);
        }
        else{
            TextView tv = (TextView)findViewById(R.id.intentTextView);
            String noInputFound = "Nothing here";
            tv.setText(noInputFound);
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart() called");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}
