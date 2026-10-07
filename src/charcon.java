import java.util.*;

public class charcon {
    public void CharConverter() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.println("====CHAR=CONVERTER====\n");
        System.out.println("TYPE A CHARACTER: ");

        try {
            char d = scan.next().charAt(0);
            int n = d;
            System.out.println("DECIMAL: " + n);
        } catch (Exception e){
            System.err.println("ENTER ONLY (1) CHARACTER");
            Thread.sleep(2000);
            CharConverter();
        } 
    }
}