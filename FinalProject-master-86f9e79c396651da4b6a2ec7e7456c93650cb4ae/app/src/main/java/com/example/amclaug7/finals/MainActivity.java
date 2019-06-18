package com.example.amclaug7.finals;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config = getResources().getConfiguration();
        modifyLayout(config);
    }

    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        modifyLayout(newConfig);
    }

    public void modifyLayout(Configuration newConfig){
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
            setContentView(R.layout.activity_main);
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            setContentView(R.layout.activity_main_landscape);
    }

    public void forwardCombinations(View v){
        Intent myIntent = new Intent(this, ComboActivity.class);
        this.startActivity(myIntent);
    }

    public void forwardPermutations(View v){
        Intent myIntent = new Intent(this, PermutationActivity.class);
        this.startActivity(myIntent);
    }

    public void goToHelpPage(View v){
        Intent myIntent = new Intent(this, HelpActivity.class);
        this.startActivity(myIntent);
    }
}
