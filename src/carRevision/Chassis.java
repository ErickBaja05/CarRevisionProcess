package carRevision;

public class Chassis {
    private String material;
    private double weight;
    private double chassisCorrosion;
    private double chassisAlignment;
    private int SuspensionBounce;

    public Chassis() {
        this.material = "";
        this.weight = 0;
        this.chassisCorrosion = 0;
        this.chassisAlignment = 0;
        this.SuspensionBounce = 0;
    }
    public Chassis(String material, double weight) {
        this.material = material;
        this.weight = weight;
        this.chassisCorrosion = 0;
        this.chassisAlignment = 0;
        this.SuspensionBounce = 0;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getChassisCorrosion() {
        return chassisCorrosion;
    }

    public void setChassisCorrosion(double chassisCorrosion) {
        this.chassisCorrosion = chassisCorrosion;
    }

    public double getChassisAlignment() {
        return chassisAlignment;
    }

    public void setChassisAlignmentLevel(double alignment) {
        chassisAlignment = alignment;
    }

    public int getSuspensionBounce() {
        return SuspensionBounce;
    }

    public void setSuspensionBounce(int suspensionBounce) {
        SuspensionBounce = suspensionBounce;
    }
}
