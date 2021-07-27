package Entities;

import Abstracts.Entity;

public class Game implements Entity {
    private int gameId;
    private String nameOfGame;
    private double unitPrice;

    public Game(){}

    public Game(int gameId, String nameOfGame, double unitPrice) {
        this.gameId = gameId;
        this.nameOfGame = nameOfGame;
        this.unitPrice = unitPrice;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getNameOfGame() {
        return nameOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.nameOfGame = nameOfGame;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
