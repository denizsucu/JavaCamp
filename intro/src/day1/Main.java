package day1;

public class Main {
    public static void main(String[] args) {
        String button = "Siteye Gir";
        int vade = 36;
        boolean is_low = true;
        double dolarBugun = 8.20;
        double dolarDun = 8.20;

        System.out.println(button);
        System.out.println(vade);
        System.out.println(is_low);

        System.out.println("***************************************************************");


        if (dolarDun<dolarBugun){
            System.out.println("Dolar Yükseldi!");
        }
        else if (dolarDun == dolarBugun){
            System.out.println("Değer değişmedi");
        }
        else {
            System.out.println("Dolar Düştü.");
        }

        System.out.println("***************************************************************");

        String[] krediler = {
                "Hızlı Kredi",
                "Emeklilik Kredisi",
                "Konut Kredisi",
                "Çiftçi Kredisi",
                "Msb Kredisi",
                "Meb Kredisi"
        };

        // Java - foreach (for ile)
        for (String kredi: krediler){
            System.out.println(kredi);
        }

        System.out.println("***************************************************************");

        for (int i = 0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }

        System.out.println("***************************************************************");

        int num1 = 10; // Referansla değil değerle alıyor bunlar
        int num2 = 20;
        num1 = num2;
        System.out.println(num1);

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {10, 20, 30, 40,50};
        arr1 = arr2;    // referans ile adresleri eşitlendi, 2'deki değişiklikler 1'i de etkiler
        arr2[0] = 100;
        System.out.println(arr1[0]);

        String city1 = "Ankara";    // String referans tipinde olsa da istisna olarak, diğerindeki değişiklik ilkini etkilemez
        String city2 = "Istanbul";
        city1 = city2;
        city2 = "Izmir";
        System.out.println(city1);

    }
}
