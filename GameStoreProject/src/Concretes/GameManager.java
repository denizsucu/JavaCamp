package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println("The game " + game.getNameOfGame() + " is added the system.");
    }

    @Override
    public void update(Game game) {
        System.out.println("The game " + game.getNameOfGame() + " updated.");
    }

    @Override
    public void delete(Game game) {
        System.out.println("The game " + game.getNameOfGame() + " is deleted from the system.");
    }
}
