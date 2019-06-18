package com.example.amclaug7.finals;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.TextView;

public class ComboResults extends AppCompatActivity {
    public static final String CR = "ComboResults";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(CR,"Inside ComboResults:onCreate\n");
        Configuration config = getResources().getConfiguration();
        modifyLayout(config);
    }

    public void updateView(){
        ComboCalculator comboCalc = com.example.amclaug7.finals.ComboActivity.comboCalc;

        TextView resultValueTV = findViewById(R.id.results);
        resultValueTV.setText(comboCalc.formatCombinations());
    }

    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        modifyLayout(newConfig);
    }

    public void modifyLayout(Configuration newConfig){
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_combo_results);
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_combo_results_landscape);
    }


    public void goBack(View v){
        this.finish();
    }

    public void onStart(){
        super.onStart();
        Log.w(CR,"Inside ComboResults:onStart\n");
        updateView();
    }

    protected void onRestart(){
        super.onRestart();
        Log.w(CR,"Inside ComboResults:onRestart\n");
    }

    protected void onResume(){
        super.onResume();
        Log.w(CR,"Inside ComboResults:onResume\n");
    }

    protected void onPause(){
        super.onPause();
        Log.w(CR,"Inside ComboResults:onPause\n");
    }

    protected void onStop(){
        super.onStop();
        Log.w(CR,"Inside ComboResults:onStop\n");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w(CR,"Inside ComboResults:onDestroy\n");
    }
}