public class ExhaustPipe {

    private int ExhaustPipeId;
    private int soundLevel;
    private double co2Emision;
    private boolean gasEmisionValue;

    public ExhaustPipe(int ExhaustPipeId, int soundLevel, double co2Emision, boolean gasEmissionValue){

        this.ExhaustPipeId = ExhaustPipeId;
        this.soundLevel = soundLevel;
        this.co2Emision = co2Emision;
        this.gasEmisionValue = gasEmissionValue;

    }

    public int getExhaustPipeId() {
        return this.ExhaustPipeId;
    }

    public void setExhaustPipeId(int ExhaustPipeId) {
        this.ExhaustPipeId = ExhaustPipeId;
    }

    public int getSoundLevel() {
        return this.soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    public double getCo2Emision() {
        return this.co2Emision;
    }

    public void setCo2Emision(double co2Emision) {
        this.co2Emision = co2Emision;
    }

    public boolean isGasEmisionValue() {
        return this.gasEmisionValue;
    }

    public void setGasEmisionValue(boolean gasEmisionValue) {
        this.gasEmisionValue = gasEmisionValue;
    }

}
