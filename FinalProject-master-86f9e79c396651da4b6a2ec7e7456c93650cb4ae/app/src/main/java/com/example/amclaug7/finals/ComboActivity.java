package com.example.amclaug7.finals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.content.res.Configuration;

public class ComboActivity extends AppCompatActivity {
    public static final String CA = "ComboActivity";
    public static ComboCalculator comboCalc;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.w(CA,"Inside ComboActivity:onCreate\n");
        Configuration config = getResources().getConfiguration();
        modifyLayout(config);
        comboCalc = new ComboCalculator();
    }

    public void updateView(){
        EditText nValueET = findViewById(R.id.data_nValue);
        nValueET.setText(Integer.toString(comboCalc.getN()));
        EditText kValueET = findViewById(R.id.data_kValue);
        kValueET.setText(Integer.toString(comboCalc.getK()));
    }

    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        modifyLayout(newConfig);
    }

    public void modifyLayout(Configuration newConfig){
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_combo);
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_combo_landscape);
    }

    public void updateComboCalcObject(){
        EditText nValueET = findViewById(R.id.data_nValue);
        String nValueString = nValueET.getText().toString();
        EditText kValueET = findViewById(R.id.data_kValue);
        String kValueString = kValueET.getText().toString();

        try{
            int N = Integer.parseInt(nValueString);
            comboCalc.setN(N);
            int K = Integer.parseInt(kValueString);
            comboCalc.setK(K);
        }catch(NumberFormatException nfe){
            comboCalc.setN(0);
            comboCalc.setK(0);
        }
    }

    public void calculateCombo(View v){
        Intent myIntent = new Intent(this, ComboResults.class);
        updateComboCalcObject();
        this.startActivity(myIntent);
    }

    public void goBack(View v){
        this.finish();
    }

    protected void onStart(){
        super.onStart();
        Log.w(CA,"Inside ComboActivity:onStart\n");
    }

    protected void onRestart(){
        super.onRestart();
        updateView();
        Log.w(CA,"Inside ComboActivity:onRestart\n");
    }

    protected void onResume(){
        super.onResume();
        Log.w(CA,"Inside ComboActivity:onResume\n");
    }

    protected void onPause(){
        super.onPause();
        Log.w(CA,"Inside ComboActivity:onPause\n");
    }

    protected void onStop(){
        super.onStop();
        Log.w(CA,"Inside ComboActivity:onStop\n");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w(CA,"Inside ComboActivity:onDestroy\n");
    }
}
