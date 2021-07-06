package interfaces;

public class Utils { // Dış bir class'ı static yapamıyoruz Java'da (class içinde inner class'ı yapabiliriz.)
    public static void runLoggers(Logger[] loggers, String message){ // static olunca her defasında class'ı new'lemeye gerek kalmıyor.
        for(Logger logger: loggers){
            logger.log(message);
        }
    }
}
