/**
 * OpenScreen.java
 *
 * This class holds the xml and associated methods for the initial screen on loadup of app
 */
package com.example.pigsinapenteam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class OpenScreen extends AppCompatActivity {

  MediaPlayer mediaPlayer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_open_screen);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    ScreenLogic.fullScreen(this);


    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mexicanwallmart);

    mediaPlayer.start();
    mediaPlayer.setLooping(true);
  }
  public void onResume(){
    super.onResume();
    ScreenLogic.fullScreen(this);
  }
  public void pressStartButton(View V){
    Intent goToMainScreen = new Intent(getApplicationContext(), MainScreen.class);
    startActivity(goToMainScreen);
  }
}
