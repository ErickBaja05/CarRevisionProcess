import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;
public class Fine {
    private static int fineCounter = 1;
    private int fineId;
    private String typeFine;
    private double fineCost;
    private Date fineDate;

    public Fine() {
        this.fineId = fineCounter;
        this.typeFine = "No fine";
        this.fineCost = 0.0;
        this.fineDate = new Date();
        fineCounter++;
    }
    public void setTypeFine(Scanner sc)
    {
        System.out.println("Ingrese el tipo de multa:");
        this.typeFine = sc.nextLine();
    }
    public void setFineCost(int multa)
    {
        fineCost = multa;
    }

    public int getFineId() {
        return fineId;
    }
    public String getTypeFine() {
        return this.typeFine;
    }
    public double getFineCost() {
        return this.fineCost;
    }
    public String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(this.fineDate);
    }
    public void showFine(){
        System.out.printf("Multa N°: %d%nFecha: %s%nTipo de Multa: %s%nMonto a pagar: $%.2f%n",
                this.fineId, getDate(), this.typeFine, this.fineCost);
    }

    public static void main(String[] args) {

    }
}


