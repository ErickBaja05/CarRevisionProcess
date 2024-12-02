package carRevision;

public class Brake {
    private String brakeType;
    private int brakeHeating;
    private int brakePadsStatus;
    private int brakeMaxVelocitySupported;
    private String brakeOverallStatus;

    public Brake(){
        this.brakeType = "";
        this.brakeHeating = 0;
        this.brakePadsStatus = 0;
        this.brakeMaxVelocitySupported = 0;
        this.brakeOverallStatus = "";
    }
    public Brake(String brakeType, int brakeHeating, int brakeMaxVelocitySupported){
        this.brakeType = brakeType;
        this.brakeHeating = brakeHeating;
        this.brakeMaxVelocitySupported = brakeMaxVelocitySupported;
        this.brakeOverallStatus = "";
        this.brakePadsStatus = 0;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }

    public int getBrakeHeating() {
        return brakeHeating;
    }

    public void setBrakeHeating(int brakeHeating) {
        this.brakeHeating = brakeHeating;
    }

    public int getBrakePadsStatus() {
        return brakePadsStatus;
    }

    public void setBrakePadsStatus(int brakePadsStatus) {
        this.brakePadsStatus = brakePadsStatus;
    }

    public int getBrakeMaxVelocitySupported() {
        return brakeMaxVelocitySupported;
    }

    public void setBrakeMaxVelocitySupported(int brakeMaxVelocitySupported) {
        this.brakeMaxVelocitySupported = brakeMaxVelocitySupported;
    }

    public String getBrakeOverallStatus() {
        return brakeOverallStatus;
    }

    public void setBrakeOverallStatus(String brakeOverallStatus) {
        this.brakeOverallStatus = brakeOverallStatus;
    }
}
