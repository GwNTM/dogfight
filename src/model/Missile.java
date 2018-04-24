package model;

public class Missile {
    private static int SPEED = 4;
    private static int WIDTH = 30;
    private static int HEIGHT = 10;
    private static int MAX_DISTANCE_TRAVELED = 1400;
    private static String image = "missile";
    private int distance_traveled = 0;

    public Missile(Direction direction, Dimension dimension) {

    }

    public int getWidthWithADirection(Direction direction){return 0;}
    public int getHeightWithADirection(Direction direction){return 0;}
    public void move(){}
    public boolean isWeapon(){return true;}
}
