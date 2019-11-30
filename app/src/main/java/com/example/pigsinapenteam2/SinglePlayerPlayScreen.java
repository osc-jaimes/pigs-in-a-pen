package com.example.pigsinapenteam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;

public class SinglePlayerPlayScreen extends AppCompatActivity {
  //Instance Variables + instantiations
  GameState gameState;
  HumanPlayer player1;
  Button confirmButton;
  int cellX;
  int cellY;
  boolean isHorizontal;
  //

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_single_player_play_screen);
    this.confirmButton = findViewById(R.id.confirmButton);
    //setting confirm button to not exist for now
   confirmButton.setVisibility(View.GONE);
  }

  public void buttonClicked(View V){
    int buttonId = V.getId();
    Button theButton = findViewById(buttonId);
    theButton.setBackgroundColor(getResources().getColor(R.color.fences));

  }

  public void onClickVertical1(View v){
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 0;
    isHorizontal = false;
  }

  public void onClickVertical2(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 0;
    isHorizontal = false;
  }

  public void onClickVertical3(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 0;
    isHorizontal = false;
  }

  public void onClickVertical4(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 1;
    isHorizontal = false;
  }

  public void onClickVertical5(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 1;
    isHorizontal = false;
  }

  public void onClickVertical6(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 1;
    isHorizontal = false;
  }

  public void onClickVertical7(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 2;
    isHorizontal = false;
  }

  public void onClickVertical8(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 2;
    isHorizontal = false;
  }
  public void onClickVertical9(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 2;
    isHorizontal = false;
  }
  public void onClickVertical10(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 3;
    isHorizontal = false;
  }
  public void onClickVertical11(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 3;
    isHorizontal = false;
  }
  public void onClickVertical12(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 3;
    isHorizontal = false;
  }
  public void onClickHorizontal1(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 3;
    isHorizontal = true;
  }
  public void onClickHorizontal2(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 0;
    isHorizontal = true;
  }
  public void onClickHorizontal3(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 0;
    isHorizontal = true;
  }
  public void onClickHorizontal4(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 3;
    cellY = 0;
    isHorizontal = true;
  }
  public void onClickHorizontal5(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 1;
    isHorizontal = true;
  }
  public void onClickHorizontal6(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 1;
    isHorizontal = true;
  }
  public void onClickHorizontal7(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 1;
    isHorizontal = true;
  }
  public void onClickHorizontal8(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 3;
    cellY = 1;
    isHorizontal = true;
  }
  public void onClickHorizontal9(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 0;
    cellY = 2;
    isHorizontal = true;
  }
  public void onClickHorizontal10(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 1;
    cellY = 2;
    isHorizontal = true;
  }
  public void onClickHorizontal11(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 2;
    cellY = 2;
    isHorizontal = true;
  }
  public void onClickHorizontal12(View v) {
    if (!player1.getHasMoved()) {
      confirmButton.setVisibility(View.VISIBLE);
      buttonClicked(v);
    }
    cellX = 3;
    cellY = 2;
    isHorizontal = true;
  }

  public void onClickConfirmationButton(View v) {
    confirmAction(cellX, cellY, isHorizontal);
    confirmButton.setVisibility(View.GONE);
  }

  public void confirmAction(int cellX, int cellY, boolean isHorizontal){
    player1.doMove(gameState, cellX, cellY, isHorizontal);
  }
}