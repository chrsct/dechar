import java.util.*;
import converters.Charcon;

// Credits to: chrsct | Christian Talurong 
// source: https://github.com/chrsct/dechar

public class App {
    Scanner scan = new Scanner(System.in);

    static void Header() {
        System.out.print("\033[H\033[2J");
        System.out.println("=============================");
        System.out.println("DECHAR - CHARACTER TO DECIMAL");
        System.out.println("=============================");
        System.out.println("\n");
    }

    static void MainMechanics() {
        Charcon n = new Charcon();
        App a = new App();
        Header();
        System.out.println("Choose a program:");
        System.out.println("1. CHARACTER -> DECIMAL");
        System.out.println("2. DECIMAL -> CHARACTER");
        System.out.println("3. EXIT");
        String q1 = a.scan.nextLine();

        switch (q1) {
            case "1":
                try {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    boolean _trigger = false;
                    if (!_trigger) {
                         n.CharConverter();
                    }
                } catch(Exception e) {}
                break;
            case "2":
                System.out.println("Selected Decimal Converter:");
                break;
            case "3":
                System.out.println("Closing...");
                a.scan.close();
                break;
            default:
            try {
                System.out.println("Please refer to the choices");
                Thread.sleep(2000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                MainMechanics();
            } catch(Exception e) {}
        }
    }

    void main() {
        MainMechanics();
    }
}