package carRevision;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Fine {
    private static int fineCounter = 1;
    private final int fineId;
    private double fineCost;
    private final LocalDate fineDate;


    private String typeFine;
    public Fine() {
        this.fineId = fineCounter;
        this.typeFine = "SIN MULTAS";
        this.fineCost = 0.0;
        this.fineDate = LocalDate.now();
        fineCounter++;
    }
    public void setTypeFine()
    {

        this.typeFine = "MULTA POR NO APROBACION DEL PROCESO DE REVISION";
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
    public String showFine(){
        StringBuilder fine = new StringBuilder();
        fine.append("Multa N ").append(this.fineId).append("\n");
        fine.append("Fecha emision: ").append(this.getDate()).append("\n");
        fine.append("Tipo de Multa: ").append(this.getTypeFine()).append("\n");
        fine.append("Valor a Pagar: ").append(this.getFineCost()).append("\n");

        return fine.toString();
    }
}


