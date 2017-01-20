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

public class sketch_160510a extends PApplet {

int NUM = 100;
float cx, cy, radius, maxSpeed, maxSize;
float[] x = new float[NUM];
float[] y = new float[NUM];
float[] angle = new float [NUM];

public void setup(){
  
  colorMode(HSB, 360, 100, 100, 100);
  background(0);
  noFill();
  frameRate(60);
  
  cx = width/2;
  cy = height/2;
  radius = width/4;
  maxSpeed = 2;
  maxSize = width/2;
  for (int i=0; i<NUM; i++){
    angle[i] = 0;
  }
}

public void draw(){
  drawFade();
  for (int i=0; i<NUM; i++){
    float thisSpeed = (maxSpeed / NUM) * i+ maxSpeed/7;
    float thisSize = (maxSize / NUM) * i;

    x[i] = cx + (radius * sin(radians(angle[i])));
    y[i] = cx + (radius * cos(radians(angle[i])));
    angle[i] += thisSpeed;
    noFill();
    stroke(random(100), random(50), random(100), 10);
    ellipse(x[i], y[i], thisSize, thisSize);
  }
}

public void drawFade(){
  noStroke();
  fill(0,0,0,5);
  rect(0,0,width,height);
}
  public void settings() {  size(640, 640);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160510a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
