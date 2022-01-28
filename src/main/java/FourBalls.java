import processing.core.PApplet;

public class FourBalls extends PApplet {


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Circle ball1;
    Circle ball2;
    Circle ball3;
    Circle ball4;

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        int ball1VerticalPosition = HEIGHT / 5;
        int ball2VerticalPosition = ball1VerticalPosition * 2;
        int ball3VerticalPosition = ball1VerticalPosition * 3;
        int ball4VerticalPosition = ball1VerticalPosition * 4;
        ball1 = new Circle(10, 10, ball1VerticalPosition, 1, this);
        ball2 = new Circle(10, 10, ball2VerticalPosition, 2, this);
        ball3 = new Circle(10, 10, ball3VerticalPosition, 3, this);
        ball4 = new Circle(10, 10, ball4VerticalPosition, 4, this);
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ball1.display();
        ball1.move();
        ball2.display();
        ball2.move();
        ball3.display();
        ball3.move();
        ball4.display();
        ball4.move();
    }
}
