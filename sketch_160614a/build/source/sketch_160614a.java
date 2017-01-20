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

public class sketch_160614a extends PApplet {

PImage img;
int mosaicWidth = 30;
int mosaicHeight = 20;

public void setup(){
  
  noStroke();
}

public void draw(){
  background(0);
  img = loadImage("photo.jpg");
  image(img,width/4, height/4, width/2, height/2);
  loadPixels();
  for(int j = 0; j < height; j+=mosaicHeight){
    for (int i = 0; i < width; i+=mosaicWidth){
      int c = pixels[j * width + i];
        fill(c);
        mosaicWidth = mouseX / 12 + 10;
        mosaicHeight = mouseY / 4 + 10;
        rect(i, j, mosaicWidth, mosaicHeight);
    }
  }

}
  public void settings() {  size(600, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160614a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
