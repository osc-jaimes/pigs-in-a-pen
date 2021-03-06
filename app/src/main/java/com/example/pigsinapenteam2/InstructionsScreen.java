/**
 * InstructionsScreen.java
 *
 * This class holds the xml and the methods of an instructions page to help user understand how to use app
 */
package com.example.pigsinapenteam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class InstructionsScreen extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    setContentView(R.layout.activity_instructions_screen);
    ScreenLogic.fullScreen(this);
  }

  public void nextPage(View V){
    Intent goNextScreen = new Intent(getApplicationContext(), InstructionScreen2.class);
    startActivity(goNextScreen);
  }

  public void goHome(View V){
    Intent goHome = new Intent(getApplicationContext(), MainScreen.class);
    startActivity(goHome);
  }
  public void onResume(){
    super.onResume();
    ScreenLogic.fullScreen(this);
  }
}
