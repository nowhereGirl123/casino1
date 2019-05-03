import java.util.Random;
import java.util.Scanner;

public class Casino_777 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rng = new Random();
        boolean wheelee = true;
        boolean bool;
        int zustatek;
        int vyhra = 100;


        System.out.println("zadejte svůj zůstatek: ");
        zustatek=scn.nextInt();
        System.out.println("zůstatek: "+zustatek);


        while (wheelee == true) {
            System.out.println("zadejte svou sázku: ");
            vyhra = scn.nextInt();
            if(vyhra>zustatek){
                System.out.println("bohužel neůžete vsadit. zkuste znovu. ");
                vyhra=scn.nextInt();
            }
        int a = rng.nextInt(10);
        int b = rng.nextInt(10);
        int c = rng.nextInt(10);

            System.out.println(a + " " + b + " " + c);

            if(a==b&&b==c){
                zustatek = zustatek+vyhra;

                System.out.println("Vyhráli jste! Váš zůstatek je "+zustatek+" Přejete si pokračovat?");
                bool = scn.nextBoolean();
                if(bool == false){
                    System.out.println("Děkujeme, že jste hráli. Vaše výhra je: "+zustatek);
                    break;
                }
                else if(bool == true){
                    wheelee = true;
                }
            }
            else {
                zustatek=zustatek-vyhra;

                if(zustatek>0) {
                    System.out.println("Bohužel jste prohráli. Váš zůstatek je " + zustatek + ". Přejete si pokračovat?");
                    bool = scn.nextBoolean();
                    if (bool == false) {
                        System.out.println("Děkujeme, že jste hráli. Vaše výhra je: " + zustatek);
                        break;
                    } else if (bool == true) {
                        wheelee = true;
                    }
                }
                else{
                    System.out.println("bohužel už nemůžete hrát. ");
                    break;
                }
            }
        }


    }
}
