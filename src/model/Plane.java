package model;

public class Plane {
    private static int SPEED = 2;
    private static int WIDTH = 100;
    private static int HEIGHT = 30;
    private int player;

    public Plane(int player, Direction direction, Position position, String image) {
        this.player = player;
    }

    public boolean hit(){}

    public boolean isPlayer(int player){
        if (this.player == player){
            return true;
        }
        else {
            return false;
        }
    }


}
