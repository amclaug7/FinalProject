package com.example.amclaug7.finals;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.TextView;

public class PermutationResults extends AppCompatActivity {
    public static final String PR = "PermutationResults";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w(PR,"Inside PermutationResults:onCreate\n");
        Configuration config = getResources().getConfiguration();
        modifyLayout(config);
    }

    public void updateView(){
        PermuCalculator permuCalc = com.example.amclaug7.finals.PermutationActivity.permuCalc;
        TextView resultValueTV = findViewById(R.id.results);

        resultValueTV.setText(permuCalc.formatPermutations());
    }

    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        modifyLayout(newConfig);
    }

    public void modifyLayout(Configuration newConfig){
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_permutation_results);
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_permutation_results_landscape);
    }

    public void goBack(View v){
        this.finish();
    }

    public void onStart(){
        super.onStart();
        Log.w(PR,"Inside PermutationResults:onStart\n");
        updateView();
    }

    protected void onRestart(){
        super.onRestart();
        Log.w(PR,"Inside PermutationResults:onRestart\n");
    }

    protected void onResume(){
        super.onResume();
        Log.w(PR,"Inside PermutationResults:onResume\n");
    }

    protected void onPause(){
        super.onPause();
        Log.w(PR,"Inside PermutationResults:onPause\n");
    }

    protected void onStop(){
        super.onStop();
        Log.w(PR,"Inside PermutationResults:onStop\n");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w(PR,"Inside PermutationResults:onDestroy\n");
    }
}
