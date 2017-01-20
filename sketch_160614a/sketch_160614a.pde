PImage img;
int mosaicWidth = 30;
int mosaicHeight = 20;

void setup(){
  size(600, 600);
  noStroke();
}

void draw(){
  background(0);
  img = loadImage("photo.jpg");
  image(img,width/4, height/4, width/2, height/2);
  loadPixels();
  for(int j = 0; j < height; j+=mosaicHeight){
    for (int i = 0; i < width; i+=mosaicWidth){
      color c = pixels[j * width + i];
        fill(c);
        mosaicWidth = mouseX / 12 + 10;
        mosaicHeight = mouseY / 4 + 10;
        rect(i, j, mosaicWidth, mosaicHeight);
    }
  }

}
