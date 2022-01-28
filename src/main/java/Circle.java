public class Circle {
    private int diameter;
    private int horizontalPosition;
    private int verticalPosition;
    private int speed;
    FourBalls ball;

    public Circle(int diameter, int horizontalPosition, int verticalPosition, int speed, FourBalls ball) {
        this.diameter = diameter;
        this.horizontalPosition = horizontalPosition;
        this.verticalPosition = verticalPosition;
        this.speed = speed;
        this.ball = ball;
    }

    public void display() {
        ball.ellipse(horizontalPosition, verticalPosition, diameter, diameter);
    }

    public void move() {
        horizontalPosition += speed;
    }
}
