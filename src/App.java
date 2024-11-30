import java.util.Scanner;
import java.util.Locale;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        /*Fine testFine = new Fine();
        testFine.setTypeFine(sc);
        testFine.setFineCost(sc);
        testFine.showFine();*/
        Owner owner = new Owner();
        owner.setOwnerId(sc);
        owner.setOwnerName(sc);
        owner.setOwnerEmail(sc);
        owner.setOwnerPhone(sc);
        owner.printOwner();
        sc.close();
    }
}
