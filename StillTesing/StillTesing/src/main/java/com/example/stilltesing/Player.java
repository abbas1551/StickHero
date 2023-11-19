package com.example.stilltesing;

public class Player {
    private int currentScore;

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
    private Skin currentSkin;

    public Skin getCurrentSkin() {
        return currentSkin;
    }

    public void setCurrentSkin(Skin currentSkin) {
        this.currentSkin = currentSkin;
    }
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){}
    public void turnUpsideDown(){}
    public void isOnObstacle(){}
    public void stop(){}
    public void revive(){}
}
