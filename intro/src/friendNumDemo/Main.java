package friendNumDemo;

public class Main {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 280;
        int total1 = 0;
        int total2 = 0;

        for (int i = 1; i < num1; i++){
            if (num1 % i == 0){
                total1 += i;
            }
        }

        for (int j = 1; j < num2; j++){
            if (num2 % j == 0){
                total2 += j;
            }
        }

        if (total1 == num2 && total2 == num1){
            System.out.println("This numbers are friend numbers!");
        }
        else {
            System.out.println("This numbers are not friend numbers!");
        }

    }
}
