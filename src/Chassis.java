public class Chassis {
    private String material;
    private double weight;
    private boolean hasRust;
    private boolean isAligned;
    private int SuspensionBounce;

    public Chassis() {
        this.material = "";
        this.weight = 0;
        this.hasRust = false;
        this.isAligned = false;
        this.SuspensionBounce = 0;
    }
    public Chassis(String material, double weight) {
        this.material = material;
        this.weight = weight;
        this.hasRust = false;
        this.isAligned = false;
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

    public boolean isHasRust() {
        return hasRust;
    }

    public void setHasRust(boolean hasRust) {
        this.hasRust = hasRust;
    }

    public boolean isAligned() {
        return isAligned;
    }

    public void setAligned(boolean aligned) {
        isAligned = aligned;
    }

    public int getSuspensionBounce() {
        return SuspensionBounce;
    }

    public void setSuspensionBounce(int suspensionBounce) {
        SuspensionBounce = suspensionBounce;
    }
}
