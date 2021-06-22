package primeNumberDemo;

public class Main {
    public static void main(String[] args) {
        int number = 13;
        int remainder = number % 2;
        boolean flag = true;

        if(number == 1){
            System.out.println("The number is not prime.");
            return; // Bu sayede aşağıdaki kodlardan devam etmiycek
        }
        if (number< 1){
            System.out.println("Invalid Number");
        }

        for(int i = 2; i<number; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        if (flag == false){
            System.out.println("The number is not prime.");
        }
        else {
            System.out.println("The number is prime.");
        }

    }
}
