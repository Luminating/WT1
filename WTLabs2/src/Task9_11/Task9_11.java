package Task9_11;

public class Task9_11 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(1, "red"));
        basket.addBall(new Ball(3, "blue"));
        basket.addBall(new Ball(2, "green"));
        basket.addBall(new Ball(1, "blue"));
        basket.addBall(new Ball(4, "yellow"));
        System.out.println(basket.ballsWeight());
        System.out.println(basket.ballsCountByColor("blue"));
    }
}
