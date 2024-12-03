package carRevision;

public class Revision {
    private int revisionId;
    private Owner revisionOwner;
    private Inspector revisionInspector;
    private String revisionResult;
    private String revisionObservation;

    public Revision(int revisionId, Owner revisionOwner, Inspector revisionInspector) {
        this.revisionId = revisionId;
        this.revisionOwner = revisionOwner;
        this.revisionInspector = revisionInspector;
        this.revisionResult = "";
        this.revisionObservation = "";
    }

    public int getRevisionId() {
        return revisionId;
    }

    public void setRevisionId(int revisionId) {
        this.revisionId = revisionId;
    }

    public Owner getRevisionOwner() {
        return revisionOwner;
    }

    public void setRevisionOwner(Owner revisionOwner) {
        this.revisionOwner = revisionOwner;
    }

    public Inspector getRevisionInspector() {
        return revisionInspector;
    }

    public void setRevisionInspector(Inspector revisionInspector) {
        this.revisionInspector = revisionInspector;
    }

    public String getRevisionResult() {
        return revisionResult;
    }

    public void setRevisionResult(String revisionResult) {
        this.revisionResult = revisionResult;
    }

    public String getRevisionObservation() {
        return revisionObservation;
    }

    public void setRevisionObservation(String revisionObservation) {
        StringBuilder observation = new StringBuilder();
        observation.append(revisionObservation).append("\n");
        this.revisionObservation = observation.toString();
    }
}
