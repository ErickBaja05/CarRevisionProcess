package carRevision;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void createLoadingSecuence(char type, int length, String message){
        for(int i = 0; i <= length; i++){
            int porcetaje = (i * 100)/length;
            StringBuilder barra = new StringBuilder("[");
            for(int j = 0; j < length; j++){
                if(j < i){
                    barra.append(type);
                }else{
                    barra.append(" ");
                }
            }
            barra.append("] ");
            System.out.print("\r" + barra + porcetaje + "%");
            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n" + message);
    }
    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static String printMainMenu(){
        StringBuilder menu = new StringBuilder();
        menu.append("*******SISTEMA DE REVISION VEHICULAR 2024-B ***************").append("\n");
        menu.append("1. INGRESAR INFORMACION DEL USUARIO").append("\n");
        menu.append("2. INGRESAR INFORMACION DEL VEHICULO DEL USUARIO").append("\n");
        menu.append("3. COMENZAR CON EL PROCESO DE REVISION").append("\n");
        menu.append("4. MOSTRAR RESULTADOS DE REVISION Y ENVIAR LA INFORMACION AL DUEÑO DEL VEHICULO").append("\n");
        menu.append("5. SALIR").append("\n");
        menu.append("INGRESA LO QUE DESEAS REALIZAR EL DIA DE HOY: ");
        return menu.toString();
    }

    public static int mainMenuOption(Scanner sc){
        int op = 0;
        do{
            try{
                System.out.println(App.printMainMenu());
                op = sc.nextInt();
                sc.nextLine();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("SOLO SE PERMITEN VALORES ENTEROS");
            }
            if(op <= 0 || op > 5){
                System.out.println("OPCION INVALIDA");
            }
        }while(op <= 0 || op > 5);
        return op;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Inspector inspector = new Inspector(1,"Erick");
        Owner owner = new Owner();
        Car car = new Car();
        Revision revision = new Revision(1,owner,inspector);
        boolean isOwnerFilled = false;
        boolean isCarFilled = false;
        boolean isRevisionDone = false;
        boolean isProcessCompleted = false;
        boolean isStillInProcess = true;

        while(isStillInProcess){

            int op = mainMenuOption(sc);
            switch(op){
                case 1:
                    App.clearConsole();
                    System.out.println("A continuación debera llenar la información del propietario del vehiculo");
                    System.out.println("Cargando: ");App.createLoadingSecuence('|', 20, "Carga completada");
                    revision.getRevisionInspector().setOwnerInformation(revision.getRevisionOwner(),sc);
                    isOwnerFilled = true;
                    break;
                case 2:
                    App.clearConsole();
                    if(isOwnerFilled){
                        System.out.println("A continuación debera llenar la información del vehiculo del propietario ");
                        System.out.println("Cargando");App.createLoadingSecuence('|', 20, "Carga completada");
                        revision.getRevisionInspector().setCarInformation(revision.getRevisionOwner(),car,sc);
                        isCarFilled = true;
                    }else{
                        System.out.println("PRIMERO DEBE INGRESAR LOS DATOS DEL PROPIETARIO DEL VEHICULO");
                    }
                    break;
                case 3:
                    App.clearConsole();
                    if(isOwnerFilled && isCarFilled){
                        App.createLoadingSecuence('|', 10, "COMENZANSO EL PROCESO DE REVISION");
                        System.out.println("REVISANDO FRENOS...");
                        revision.getRevisionInspector().checkBrakeStatus(revision.getRevisionOwner().getOwnerCar(), revision);
                        App.createLoadingSecuence('|', 10, "Frenos Revisados!!");
                        System.out.println("REVISANDO MOTOR...");
                        revision.getRevisionInspector().checkEngine(revision.getRevisionOwner().getOwnerCar(),revision);
                        App.createLoadingSecuence('|', 10, "Motor Revisado!!");
                        System.out.println("REVISANDO CHASIS...");
                        revision.getRevisionInspector().checkChassisStatus(revision.getRevisionOwner().getOwnerCar(),revision);
                        App.createLoadingSecuence('|', 10, "Chasis Revisado!!");
                        System.out.println("REVISANDO TUBO DE ESCAPE...");
                        revision.getRevisionInspector().checkExhaustPipeStatus(revision.getRevisionOwner().getOwnerCar(),revision);
                        App.createLoadingSecuence('|', 10, "Tubo de escape Revisado!!");
                        System.out.println("REVISANDO LUCES...");
                        revision.getRevisionInspector().checkLightStatus(revision.getRevisionOwner().getOwnerCar(),revision);
                        App.createLoadingSecuence('|', 10, "Luces revisadas!!");
                        System.out.println("REVISANDO LLANTAS...");
                        revision.getRevisionInspector().checkTireStatus(revision.getRevisionOwner().getOwnerCar(),revision);
                        App.createLoadingSecuence('|', 10, "Llantas revisadas!!");
                        System.out.println("REVISANDO IMPLEMENTOS ADICIONALES...");
                        revision.getRevisionInspector().chechAditional(revision.getRevisionOwner().getOwnerCar(),revision);
                        App.createLoadingSecuence('|', 10, "Implementos adicionales revisados!!");
                        System.out.println("CALCULANDO RESULTADOS DE LA REVISION");
                        App.createLoadingSecuence('|', 25, "Proceso de revision terminada");
                        isRevisionDone = true;
                        System.out.println("PUEDE VER LOS RESULTADOS DE LA REVISION EN LA OPCION \"4. MOSTRAR RESULTADOS \"");
                        isProcessCompleted =true;
                    }else{
                        System.out.println("TANTO LOS DATOS DEL PROPIETARIO DEL VEHICULO COMO DEL VEHICULO DEBEN" +
                                " INGRESARSE PREVIAMENTE PARA REALIZAR LA REVISION");
                    }
                    break;
                case 4:
                    App.clearConsole();
                    if(isRevisionDone){
                        String results = revision.getResults();
                        System.out.println(results);
                    }else{
                        System.out.println("NO SE HAN REALIZADO PROCESOS DE REVISION");
                    }
                    break;
                case 5:
                    System.out.println("HASTA LUEGO");
                    isStillInProcess = false;



            }
        }




        }
    }

