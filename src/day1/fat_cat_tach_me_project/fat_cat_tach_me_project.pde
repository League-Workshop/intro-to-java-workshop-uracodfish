PImage mustachee;
  PImage fatcat;
void setup(){
fatcat = loadImage("fat cat.jpg");

size(800, 600);

fatcat.resize(width,height);
background(fatcat);
mustachee = loadImage("mustachee.png");}
void draw(){
  if (mousePressed)
image(mustachee, mouseX -72.5, mouseY -25 );
textSize(32);
text("I AM VERY FAT", 300, 100);
text("DEAL WITH IT", 300, 150);
fill(255, 100, 0);}