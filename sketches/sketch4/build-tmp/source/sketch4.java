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

public class sketch4 extends PApplet {

float y;
float speed=1;
Ball[] balls;

public void setup() {
  size(600, 350,P3D);
  y = height;


  balls = new Ball[400];

  //put balls in array
  for (int i= 0; i<balls.length; i++) {
    float spaced = map(i, 0, balls.length-1, 10, width-10);
    balls[i] = new Ball(spaced, random(0-5));
  }
}

public void draw() {
  background(random(255));

  lights();
  sphere(28);

  noStroke();
  fill(255, 0, 255);

  //move balls and draw them
  for (int i=0; i < balls.length; i++) {
    balls[i].update();
    balls[i].display();



  stroke(random(255));
  line(0, 0, random(500), random(300));
  
  }
}

public void keyPressed() {
  if (key  == ENTER) {
    for (int i =0; i <balls.length; i++) {
      balls[i].reset();
    }
  }
}
class Ball {
  float speed;
  float x;
  float y = height;

  Ball(float tempx, float tempspeed) {
    x = tempx;
    speed = tempspeed;
  }

  public void update() {
    y = y + speed;

    if (y < 0 || y>height) {
      speed *=1;
    }

    noStroke();
    fill (255, 255, 255);
    //ellipse(width/2, y, 20, 20);
  }

  public void display() {
    noStroke();
    ellipse(x, y, 2, 2);
  }
  public void reset(){
    y = height/2;
  }
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch4" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
