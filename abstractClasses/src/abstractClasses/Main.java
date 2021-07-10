package abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

//        GameCalculator gameCalculator = new GameCalculator() {   // abstract class'ı new'lemek için bu kullanılır ama güzel bir yöntem değil.
//            @Override
//            public void calculate() {
//
//            }
//        };

        GameCalculator gameCalculator = new KidsGameCalculator(); // farklı bir class ile new'leniyor
        gameCalculator.calculate();
        gameCalculator.gameOver();
    }
}
