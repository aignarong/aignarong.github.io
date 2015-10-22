class Ball {
  float speed;
  float x;
  float y = height;

  Ball(float tempx, float tempspeed) {
    x = tempx;
    speed = tempspeed;
  }

  void update() {
    y = y + speed;

    if (y < 0 || y>height) {
      speed *=1;
    }

    noStroke();
    fill (255, 255, 255);
    //ellipse(width/2, y, 20, 20);
  }

  void display() {
    noStroke();
    ellipse(x, y, 2, 2);
  }
  void reset(){
    y = height/2;
  }
  
}