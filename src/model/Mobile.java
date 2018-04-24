package model;

import java.awt.*;

public class Mobile {
    private int speed;
    private Direction direction;
    private Position position;
    private Dimension dimension;
    private DogfightModel dogfightModel;

    public Mobile(int speed, Direction direction, Position position, Dimension dimension, String image) {
        this.speed = speed;
        this.direction = direction;
        this.position = position;
        this.dimension = dimension;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public Position getPosition() {
        return position;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public int getWidth(Dimension dimension) {
        return dimension.width;
    }

    public int getHeight(Dimension dimension) {
        return dimension.height;
    }

    public void move() {
    }

    public void placeInArea(IArea area) {
    }

    public boolean isPlayer(int player) {
        return true;
    }

    public void moveUp() {
    }

    public void moveRight() {
    }

    public void moveDown() {
    }

    public void movLeft() {
    }

    public Color getColor(){}

    public DogfightModel getDogFightModel(){
        return dogfightModel;
    }

    public void setDogFightModel(IDogfightModel dogFightModel){}

    public boolean hit(){}

    public boolean isWeapon(){}

    public Image getImage(){}
}