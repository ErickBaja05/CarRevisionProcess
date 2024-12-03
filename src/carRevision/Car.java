package carRevision;


public class Car {
    private int carId;
    private String carColor;
    private String carBrand;
    private String carModel;
    private String carPlate;
    private Brake carBrakes;
    private Engine carEngine;
    private boolean seatBelt;
    private boolean firstAidKit;
    private Tire carTire;
    private boolean emergencyTire;
    private Light carLights;
    private Chassis carChassis;
    private Owner owner;
    private Registration carRegistration;
    private String carType;
    private int carYear;
    private ExhaustPipe exhaustPipe;

    // Constructor
    public Car(int carId, String carColor, String carBrand, String carModel, String carPlate, boolean seatBelt, boolean firstAidKit, boolean emergencyTire, String carType, int carYear, Owner carOwner, Registration carRegistration){
        this.carId = carId;
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPlate = carPlate;
        this.seatBelt = seatBelt;
        this.firstAidKit = firstAidKit;
        this.emergencyTire = emergencyTire;
        this.carType = carType;
        this.carYear = carYear;
        this.carBrakes = new Brake();
        this.carEngine = new Engine();
        this.carTire = new Tire();
        this.carLights = new Light();
        this.carChassis = new Chassis();
        this.owner = carOwner;
        this.carRegistration = carRegistration;
        this.exhaustPipe = new ExhaustPipe();
    }
    // Constructor por defecto for testing
    public Car(){
        this.carBrakes = new Brake();
        this.carChassis = new Chassis();
    }

    // Metodos
    public void showCarInformation(){
        StringBuilder stringC = new StringBuilder();
        stringC.append("Características del Vehículo:\n");
        stringC.append("Id: ").append(this.carId).append('\n');
        stringC.append("Tipo de vehículo: ").append(this.carType).append('\n');
        stringC.append("Modelo: ").append(this.carBrakes).append('\n');
        stringC.append("Año: ").append(this.carYear).append('\n');
    }

    // Getters

    public Brake getCarBrakes() {
        return this.carBrakes;
    }

    public Engine getCarEngine() {
        return this.carEngine;
    }

    public boolean isSeatBelt() {
        return this.seatBelt;
    }

    public boolean isFirstAidKit() {
        return this.firstAidKit;
    }

    public Tire getCarTire(){
        return this.carTire;
    }

    public boolean isEmergencyTire() {
        return this.emergencyTire;
    }

    public Light getCarLights() {
        return this.carLights;
    }

    public Chassis getCarChassis() {
        return this.carChassis;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public Registration getCarRegistration() {
        return this.carRegistration;
    }

    public ExhaustPipe getExhaustPipe() {
        return this.exhaustPipe;
    }

    public String getCarPlate(){
        return this.carPlate;
    }




}
