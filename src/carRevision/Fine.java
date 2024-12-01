package carRevision;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Fine {
    private static int fineCounter = 1;
    private final int fineId;
    private String typeFine;
    private double fineCost;
    private final LocalDate fineDate;

    public Fine() {
        this.fineId = fineCounter;
        this.typeFine = "No fine";
        this.fineCost = 0.0;
        this.fineDate = LocalDate.now();
        fineCounter++;
    }
    public void setTypeFine(Scanner sc)
    {
        System.out.println("Ingrese el tipo de multa:");
        this.typeFine = sc.nextLine();
    }
    public void setFineCost(double penalty)
    {
        fineCost = penalty;
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
        //This object and method will set the date in the right format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.fineDate.format(formatter);
    }
    public void showFine(){
        System.out.printf("Multa N°: %d%nFecha: %s%nTipo de Multa: %s%nMonto a pagar: $%.2f%n",
                this.fineId, getDate(), this.typeFine, this.fineCost);
    }
}


