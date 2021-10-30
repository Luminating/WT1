package Task9_11;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public int ballsWeight(){
        int weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int ballsCountByColor(String color){
        int count = 0;
        for(Ball ball : balls) {
            if (ball.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
}
