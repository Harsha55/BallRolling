import processing.core.PApplet;

public class BallRolling extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int C = 10;
    public static final int D = 10;
    int x = 2;

    public static void main(String[] args){ PApplet.main("BallRolling",args);}

    @Override
    public void settings() {
        super.settings();

        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {


        int ballHeight = HEIGHT / 5;
        getEllipse(ballHeight, x);
        getEllipse(2*ballHeight, 2*x);
        getEllipse(3*ballHeight, 3*x);
        getEllipse(4*ballHeight, 4*x);
        x++;
    }

    private void getEllipse(int ballHeight, int x) {
        ellipse(x, ballHeight, C, D);
    }


}
