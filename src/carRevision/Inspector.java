package carRevision;


public class Inspector {
    private int inspectorId;
    private String inspectorName;


    // Constructor
    public Inspector(int id, String name){
        this.inspectorId = id;
        this.inspectorName = name;
    }
    // TODO: Evaluar cada elemento
    // Metodos
    // Funciones que el inspector realiza durante la revision:
    // Respecto a frenos, el inspector revisa el estado de las pastillas, la temperatura y la eficiencia de frenado
    public boolean checkBrakeStatus(Car car){

        int padsStatusRev = car.getCarBrakes().getBrakePadsStatus();
        int brakeHeatingRev = car.getCarBrakes().getBrakeHeating();

        //The following code assigns the brake pads' status based on the grade received.
        if (padsStatusRev >= 5 && brakeHeatingRev <= 600)
            {
                if (padsStatusRev >= 7 && brakeHeatingRev <= 350){
                    car.getCarBrakes().setBrakeOverallStatus("Bueno"); //Everything is alright
                } else{
                    car.getCarBrakes().setBrakeOverallStatus("Regular");
                    if (padsStatusRev < 7){
                        //here we can add in the observations that the driver should  be weary of the brakes status.
                        System.out.println("Pastillas Regular");
                    }
                    if(brakeHeatingRev > 350){
                        System.out.println("Calentamiento en rango tolerable");
                        //here we can say that the brakes are overheating a bit but it shouldn't be an issue.
                    }

                }
        } else {
            car.getCarBrakes().setBrakeOverallStatus("Deficiente");
            if ((padsStatusRev < 7) && (padsStatusRev >= 5)) {
                //here we can add in the observations that the driver should  be weary of the brakes status.
                System.out.println("Pastillas Regular");
            } else if (padsStatusRev < 5) {
                System.out.println("Pastillas Deficientes");
                //Here wwe say that the brakes  pads are faulty
            }
            if((brakeHeatingRev > 350) && (brakeHeatingRev <= 600)){
                System.out.println("Calentamiento en rango tolerable");
                //here we can say that the brakes are overheating a bit but it shouldn't be an issue.

            }else if(brakeHeatingRev > 600){
                    System.out.println("Sobrecalentamiento excesivo");
                    //here we say the brakes are overheating over the tolerated range.
                }
            }
        //Once the overall status is set, the following code will set the boolean stauts to true if the brake passes, or false if they don't.
        if(car.getCarBrakes().getBrakeOverallStatus().equals("Bueno") || car.getCarBrakes().getBrakeOverallStatus().equals("Regular"))
        {
            return true;
        } else{
            return false;
        }
    }

    public boolean checkChassisStatus(Car car){
         int chassisCorrosionRev = car.getCarChassis().getChassisCorrosion();
         int chassisAlignmentRev = car.getCarChassis().getChassisAlignment();
         int chassisSuspensionBounceRev = car.getCarChassis().getSuspensionBounce();

        //The following code assigns the brake pads' status based on the grade received.
        if (chassisAlignmentRev >= 5 && chassisCorrosionRev >= 5 && chassisSuspensionBounceRev >= 5)
        {
            if (chassisAlignmentRev >= 7 && chassisCorrosionRev >= 7 && chassisSuspensionBounceRev >=7){
                car.getCarChassis().setChassisOverallStatus("Bueno"); //Everything is alright
            } else{
                car.getCarChassis().setChassisOverallStatus("Regular");
                if (chassisAlignmentRev < 7){
                    //here we can add in the observations that the driver should  be weary of.
                    System.out.println("Desalinemiento en rango tolerable");
                }
                if(chassisCorrosionRev < 7)
                {
                    System.out.println("Corrosion en rango tolerable");
                    //here we can add in the observations that the driver should  be weary of.
                }
                if (chassisSuspensionBounceRev < 7)
                {
                    System.out.println("Se debe revisar la suspension del auto");
                    //here we can add in the observations that the driver should  be weary of.
                }

            }
        } else {
            car.getCarChassis().setChassisOverallStatus("Deficiente");
            if ((chassisAlignmentRev < 7) && (chassisAlignmentRev >= 5)) {
                //here we can add in the observations that the driver should  be weary of the brakes status.
                System.out.println("Desalinemiento en rango tolerable");
            } else if (chassisAlignmentRev < 5) {
                System.out.println("Desalinamiento Intolerable");
                //Here wwe say that the brakes  pads are faulty
            }
            if((chassisCorrosionRev < 7) && (chassisCorrosionRev >= 5)){
                System.out.println("Corrosion en rango tolerable");
                //here we can say that the brakes are overheating a bit but it shouldn't be an issue.

            }else if(chassisCorrosionRev < 5){
                System.out.println("Corrosion Intolerable");
                //here we say the brakes are overheating over the tolerated range.
            }
            if((chassisSuspensionBounceRev < 7) && (chassisSuspensionBounceRev >= 5)){
                System.out.println("Ajustar la suspension");
                //here we can say that the brakes are overheating a bit but it shouldn't be an issue.

            }else if(chassisSuspensionBounceRev < 5){
                System.out.println("La suspension no funciona correctamente");
                //here we say the brakes are overheating over the tolerated range.
            }

        }
        //Once the overall status is set, the following code will set the boolean stauts to true if the brake passes, or false if they don't.
        if(car.getCarChassis().getChassisOverallStatus().equals("Bueno") || car.getCarChassis().getChassisOverallStatus().equals("Regular"))
        {
            return true;
        } else{
            return false;
        }
    }
//    // Mediante esta funcion, el inspector puede revisar el cilindraje y filtracion del motor
//    public boolean checkEngineStatus(Car car){
//        double engineCylinderRev = car.getCarEngine().getEngineCylinder();
//        boolean engineLeakageRev = car.getCarEngine().isEngineLeakage();
//        // String engineStatus = car.getCarEngine().getEngineStatus();
//    }
//    // Esta funcion permite al inspector revisar el nivel de sonido del tubo de escape, asi
//    // el porcentaje de emision de CO2
//    public boolean checkExhaustPipeStatus(Car car){
//        int soundLevelRev = car.getExhaustPipe().getSoundLevel();
//        double co2EmisionRev = car.getExhaustPipe().getCo2Emision();
//
//    }

    // This feature allows the inspector to check the intensity and status of the lights.
    public boolean checkLightStatus(Car car) {
        int lightStatusRev = car.getCarLights().getLightStatus();
        int lightIntensityRev = car.getCarLights().getLightIntensity();

        // Evaluate the general condition of the lights
        if (lightStatusRev == 1 && lightIntensityRev <= 4) {
            car.getCarLights().setLightOverallStatus("Bueno"); // The lights are in good condition
            System.out.println("Luces en buen estado.");
        } else if (lightStatusRev == 1 && lightIntensityRev <= 7) {
            car.getCarLights().setLightOverallStatus("Regular"); // The lights are functional, but with low intensity
            System.out.println("Luces en estado regular. Revise la intensidad.");
        } else {
            car.getCarLights().setLightOverallStatus("Malo"); // The lights are burned out or very low intensity
            if (lightStatusRev == 0) {
                System.out.println("Luces quemadas. Es necesario reemplazarlas.");
            }
            if (lightIntensityRev > 7) {
                System.out.println("Intensidad de las luces es deficiente.");
            }
        }
        // Evaluate if the lights pass the inspection
        if (car.getCarLights().getLightOverallStatus().equals("Bueno") || car.getCarLights().getLightOverallStatus().equals("Regular")) {
            return true; // Approved
        } else {
            return false; // Not approved
        }
    }
    }
  // Using this feature, the inspector can check the condition and pressure of the tires.
    public boolean checkTireStatus(Car car){
        double tireTreadingRev = car.getCarTire().getTireTreading();
        double tirePresionRev = car.getCarTire().getTirePresion();

        // Evaluate the general condition of the tires
        if (tireTreadingRev >= 1.66 && tirePresionRev >= 30 && tirePresionRev <= 40) {
            car.getCarTire().setTireOverallStatus("Bueno"); // Tires in good condition
            System.out.println("Llantas en buen estado.");
        } else if (tireTreadingRev >= 1.66 && (tirePresionRev < 30 || tirePresionRev > 40)) {
            car.getCarTire().setTireOverallStatus("Regular"); // Functional tires but with pressure outside the optimal range
            System.out.println("Llantas en estado regular. Revise la presión.");
        } else {
            car.getCarTire().setTireOverallStatus("Malo"); // Tires in poor condition
            if (tireTreadingRev < 1.66) {
                System.out.println("Banda de rodadura insuficiente. Es necesario reemplazar las llantas.");
            }
            if (tirePresionRev < 20) {
                System.out.println("Presión extremadamente baja. Infle las llantas inmediatamente.");
            } else if (tirePresionRev > 70) {
                System.out.println("Presión extremadamente alta. Ajuste la presión para evitar daños.");
            }
        }

        if (car.getCarTire().getTireOverallStatus().equals("Bueno") || car.getCarTire().getTireOverallStatus().equals("Regular")) {
            return true; // Approved
        } else {
            return false; // Not approved
        }
    }
}
