public class Engine {
    private String engineType;
    private double displacement;
    private int horsepower;
    private int mileage;
    private boolean isOperational;


    public Engine() {
        this.engineType = "";
        this.displacement = 0;
        this.horsepower = 0;
        this.mileage = 0;
        this.isOperational = true;
    }
    public Engine(String type, double displacement, int horsepower, int mileage) {
        this.engineType = type;
        this.displacement = displacement;
        this.horsepower = horsepower;
        this.mileage = mileage;
        this.isOperational = true;

    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }
}
