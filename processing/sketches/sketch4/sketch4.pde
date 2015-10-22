float y;
float speed=1;
Ball[] balls;

void setup() {
  size(600, 350,P3D);
  y = height;


  balls = new Ball[400];

  //put balls in array
  for (int i= 0; i<balls.length; i++) {
    float spaced = map(i, 0, balls.length-1, 10, width-10);
    balls[i] = new Ball(spaced, random(0-5));
  }
}

void draw() {
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
  line(0, 0, random(600), random(350));
  
  }
}

void keyPressed() {
  if (key  == ENTER) {
    for (int i =0; i <balls.length; i++) {
      balls[i].reset();
    }
  }
}