/**
 * InstructionsScreen2.java
 *
 * Holds methods and activity to help user understand the app
 */
package com.example.pigsinapenteam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class InstructionScreen2 extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    setContentView(R.layout.activity_instruction_screen2);
    ScreenLogic.fullScreen(this);
  }

  public void goHome(View V){
    Intent goHome = new Intent(getApplicationContext(), MainScreen.class);
    startActivity(goHome);
  }

  public void nextPage(View V){

  }
  public void onResume(){
    super.onResume();
    ScreenLogic.fullScreen(this);
  }
}
