public class Tire {

    private int tiredId;
    private int tireTreading;
    private double tirePresion;
    public Tire(){
        this.tiredId = 0;
        this.tireTreading = 0;
        this.tirePresion = 0;
    }
    public Tire(int tiredId, int tireTreading, int tirePresion){

        this.tiredId = tiredId;
        this.tireTreading = tireTreading;
        this.tirePresion = tirePresion;

    }

    public int getTiredId() {
        return tiredId;
    }

    public void setTiredId(int tiredId) {
        this.tiredId = tiredId;
    }

    public int getTireTreading() {
        return tireTreading;
    }

    public void setTireTreading(int tireTreading) {
        this.tireTreading = tireTreading;
    }

    public double getTirePresion() {
        return tirePresion;
    }

    public void setTirePresion(double tirePresion) {
        this.tirePresion = tirePresion;
    }

}
