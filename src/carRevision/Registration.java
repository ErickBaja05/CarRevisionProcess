package carRevision;
import java.time.LocalDate;
public class Registration {
    private int registrationID;
    private final LocalDate emisionDate;
    private final LocalDate expirationDate;

    public Registration() {
        this.registrationID = 0;
        this.emisionDate = LocalDate.now();
        this.expirationDate = LocalDate.now().plusDays(50);
    }


    public int getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }


    public String getRegistrationInfo(Owner owner) {
        StringBuilder info = new StringBuilder();
        info.append("NUMERO DE MATRICULA: " + this.registrationID + "\n");
        info.append("PROPIETARIO: ").append(owner.getOwnerName()).append("\n");
        info.append("FECHA DE EXPEDICION DE MATRICULA: " + this.emisionDate.toString() + "\n");
        info.append("FECHA DE EXPIRACION DE MATRICULA: " + this.expirationDate.toString() + "\n");
        info.append("PLACAS DEL VEHICULO").append(owner.getOwnerCar().getCarPlate());
        return info.toString();

    }

}
