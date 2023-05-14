import processing.core.PApplet;

public class FullscreenApp extends PApplet {

  private int x = 0;

  @Override
  public void settings() {
    fullScreen(P3D, 1);
    smooth(2);
  }

  @Override
  public void setup() {
    background(0);
    noStroke();
    fill(102);
  }

  @Override
  public void draw() {
    rect(x, height * 0.2f, 1, height * 0.6f);
    x = x + 2;
  }

  public static void main(String[] args) {
    PApplet.main("FullscreenApp");
  }
}
