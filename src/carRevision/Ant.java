package carRevision;

public class Ant {
    private Revision revisionData;
    private Owner carOwner;

    // Constructor
    public Ant(Owner carOwner, Revision revisionData) {
        this.carOwner = carOwner;
        this.revisionData = revisionData;
    }

    public void generateFine(Owner carOwner) {

        Fine fine = new Fine();
        if (this.revisionData.getMistakesCounter() > 0){
            fine.setFineCost(270);
            fine.setTypeFine();
        }
        carOwner.setOwnerFine(fine);
    }
}