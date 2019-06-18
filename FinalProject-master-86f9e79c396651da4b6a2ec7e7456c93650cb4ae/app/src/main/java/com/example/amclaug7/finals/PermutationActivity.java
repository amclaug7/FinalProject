package com.example.amclaug7.finals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.content.res.Configuration;
import android.widget.RadioButton;

public class PermutationActivity extends AppCompatActivity {
    public static final String PA = "PermutationActivity";
    public static PermuCalculator permuCalc;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.w(PA,"Inside PermutationActivity:onCreate\n");
        Configuration config = getResources().getConfiguration();
        modifyLayout(config);
        permuCalc = new PermuCalculator();
    }

    public void updateView(){
        EditText aValueET = findViewById(R.id.data_aValue);
        aValueET.setText(Integer.toString(permuCalc.getA()));
        EditText rValueET = findViewById(R.id.data_rValue);
        rValueET.setText(Integer.toString(permuCalc.getR()));

        RadioButton noButton = findViewById(R.id.noButton);
        noButton.setChecked(false);
        RadioButton yesButton = findViewById(R.id.yesButton);
        yesButton.setChecked(false);
    }

    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        modifyLayout(newConfig);
    }

    public void modifyLayout(Configuration newConfig){
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_permutation);
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_permutation_landscape);
    }

    public void updatePermuCalcObject(){
        RadioButton yesButton = findViewById(R.id.yesButton);
        RadioButton noButton = findViewById(R.id.noButton);

        EditText aValueET = findViewById(R.id.data_aValue);
        String aValueString = aValueET.getText().toString();
        EditText rValueET = findViewById(R.id.data_rValue);
        String rValueString = rValueET.getText().toString();

        if(yesButton.isChecked()){
            permuCalc.setX(0);
        }
        else if(noButton.isChecked()){
            permuCalc.setX(1);
        }

        try{
            int A = Integer.parseInt(aValueString);
            permuCalc.setA(A);
            int R = Integer.parseInt(rValueString);
            permuCalc.setR(R);
        }catch(NumberFormatException nfe){
            permuCalc.setA(0);
            permuCalc.setR(0);
        }

    }

    public void calculatePermu(View v){
        Intent myIntent = new Intent(this, PermutationResults.class);
        updatePermuCalcObject();
        this.startActivity(myIntent);
    }

    public void goBack(View v){
        this.finish();
    }

    protected void onStart(){
        super.onStart();
        Log.w(PA,"Inside PermutationActivity:onStart\n");
    }

    protected void onRestart(){
        super.onRestart();
        updateView();
        Log.w(PA,"Inside PermutationActivity:onRestart\n");
    }

    protected void onResume(){
        super.onResume();
        Log.w(PA,"Inside PermutationActivity:onResume\n");
    }

    protected void onPause(){
        super.onPause();
        Log.w(PA,"Inside PermutationActivity:onPause\n");
    }

    protected void onStop(){
        super.onStop();
        Log.w(PA,"Inside PermutationActivity:onStop\n");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w(PA,"Inside PermutationActivity:onDestroy\n");
    }
}
