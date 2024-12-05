package carRevision;

public class Ant {
    private Revision revisionData;
    private Owner carOwner;

    public Ant(Owner carOwner, Revision revisionData) {
        this.carOwner = carOwner;
        this.revisionData = revisionData;
    }

    // RECEIVES A OWNER WHOSE FINE VALUE IS MODIFIED
    public void generateFine(Owner carOwner) {

        Fine fine = new Fine();
        if (this.revisionData.getMistakesCounter() > 0){
            fine.setFineCost(50);
            fine.setTypeFine();
        }
        carOwner.setOwnerFine(fine);
    }
}