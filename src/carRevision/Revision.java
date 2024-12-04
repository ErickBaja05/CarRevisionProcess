package carRevision;

public class Revision {
    private int revisionId;
    private Owner revisionOwner;
    private Inspector revisionInspector;
    int mistakesCounter;
    private StringBuilder revisionObservation;

    public Revision(int revisionId, Owner revisionOwner, Inspector revisionInspector) {
        this.revisionId = revisionId;
        this.revisionOwner = revisionOwner;
        this.revisionInspector = revisionInspector;
        this.revisionObservation = new StringBuilder();
        this.mistakesCounter = 0;
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


    public String getRevisionObservation() {
        return revisionObservation.toString();
    }

    public void setRevisionObservation(String revisionObservation) {
        this.revisionObservation.append(revisionObservation).append("\n");
    }
    public void addMistake(){
        this.mistakesCounter++;
    }

    public int getMistakesCounter() {
        return this.mistakesCounter;
    }

    public String getResults(){
        Ant ant = new Ant(this.revisionOwner,this);
        StringBuilder results = new StringBuilder();
        results.append("RESULTADOS DE LA REVISION").append("\n");
        results.append("NOMBRE DEL PROPIETARIO").append('\n').append(this.revisionOwner.getOwnerName()).append("\n");
        results.append("INFORMACION DEL VEHICULO REVISADO").append("\n").append(this.revisionOwner.getOwnerCar().showCarInformation()).append("\n");
        if(this.mistakesCounter == 0){
            results.append("RESULTADO: APROBADO").append("\n");
            results.append("NO HAY MULTAS").append("\n");
        }else{
            results.append("RESULTADO: NO APROBADO").append("\n");
            results.append("NUMERO DE ERRORES: ").append(this.mistakesCounter).append("\n");
            results.append("LA ANT GENERO UNA MULTA POR NO APROBAR LA REVISION").append("\n");
            ant.generateFine(this.revisionOwner);
            results.append(this.revisionOwner.getOwnerFine().showFine());

        }
        results.append("OBSERVACIONES: ").append("\n").append(this.revisionObservation).append("\n");

        return results.toString();

    }
}
