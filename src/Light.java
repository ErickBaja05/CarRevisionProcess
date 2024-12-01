public class Light {

    private int lightsId;
    private int lightStatus;
    private int lightIntensity;
    private String lightCoverStatus;

    public Light(int lightsId, int lightStatus, int lightIntensity, String lightCoverStatus){

        this.lightsId = lightsId;
        this.lightStatus = lightStatus;
        this.lightIntensity = lightIntensity;
        this.lightCoverStatus = lightCoverStatus;

    }

    public int getLightsId() {
        return lightsId;
    }

    public void setLightsId(int lightsId) {
        this.lightsId = lightsId;
    }

    public int getLightStatus() {
        return lightStatus;
    }

    public void setLightStatus(int lightStatus) {
        this.lightStatus = lightStatus;
    }

    public int getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(int lightIntensity) {
        this.lightIntensity = lightIntensity;
    }

    public String getLightCoverStatus() {
        return lightCoverStatus;
    }

    public void setLightCoverStatus(String lightCoverStatus) {
        this.lightCoverStatus = lightCoverStatus;
    }

}
