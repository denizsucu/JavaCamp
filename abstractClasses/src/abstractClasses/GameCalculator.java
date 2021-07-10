package abstractClasses;

public abstract class GameCalculator { // abstract class'lar asla new'lenmez
    public abstract void calculate();

    public final void gameOver(){
        System.out.println("Game Over!");
    }
}
