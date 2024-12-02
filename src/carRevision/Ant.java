package carRevision;

public class Ant {
    private Revision revisionData;
    private Owner carOwner;

    // Constructor
    public void Revision(Owner carOwner, Revision revisionData) {
        this.carOwner = carOwner;
        this.revisionData = revisionData;
    }
}