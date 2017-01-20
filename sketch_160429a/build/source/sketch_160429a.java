import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_160429a extends PApplet {

int NUM = 32;
float[] x = new float[NUM];
float[] y = new float[NUM];
float phase, speed, radius;

public void setup(){
  
  frameRate(60);
  background(0);
  speed = 4.0f;
  radius = height/4.0f;
}

public void draw() {
  fade();
  translate(width/2, height/2);

  phase += speed;

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 2)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 4)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 5)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 1)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 8)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 4)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 4)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 1)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 9)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 4)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 1)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 2)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 8)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 4)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }

  for (int i = 0; i < NUM; i++) {
    x[i] = cos(radians(phase) / NUM * (i + 12)) * radius;
    y[i] = sin(radians(phase) / NUM * (i + 1)) * radius;

    fill(0, 127, 255);
    ellipse(x[i],y[i],5,5);
  }


}



public void fade(){
  noStroke();
  fill(0, 10);
  rect(0, 0, width, height);
}
  public void settings() {  size(600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160429a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
