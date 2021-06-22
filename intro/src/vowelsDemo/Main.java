package vowelsDemo;

public class Main {
    public static void main(String[] args) {
        char letter = 'E';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf!");
            default:
                System.out.println("İnce Sesli Harf!");
        }


    }
}
