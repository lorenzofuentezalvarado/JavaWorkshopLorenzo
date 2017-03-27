int x=0;
void setup(){
  size(1300, 200);
}
  void draw(){
    if(x>1300){
      x=0;
    }
    background(0);
    fill(#FFD70A);
    ellipse(x, 100, 50, 50);
    x=x+10;
  }