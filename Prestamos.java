import java.util.Scanner;
public class Prestamos {
    Vehiculo[] cuadricula;
    Scanner leer_modelo;
    Scanner leer_seleccionado;
    String modelo;
    int seleccionado;
    String[]control;

    public Prestamos(){
        cuadricula=new Vehiculo[10];
        control = new String[10];
        leer_modelo=new Scanner(System.in);
        leer_seleccionado=new Scanner(System.in);
    }

    public int Rellenar_Cuadricula(){
        int kilometraje=0;
        for (int i=0; i<10; i++){
            cuadricula[i]=new Vehiculo();
            control[i]=new String();
            control[i]= "Disponible";
            System.out.println("Ingrese el marca del vehiculo : ");
            modelo=leer_modelo.next();
            if(modelo.equalsIgnoreCase("Peugeot")){
                cuadricula[i].setModelo("Peugeot 207");
                cuadricula[i].setCapacidad_de_tanque(40);
                kilometraje=(int)(Math.random()*2000);
                cuadricula[i].setKilometraje(kilometraje);
            }
            if(modelo.equalsIgnoreCase("Mazda")){
                cuadricula[i].setModelo("Mazda 2");
                cuadricula[i].setCapacidad_de_tanque(20);
                kilometraje=(int)(Math.random()*2000);
                cuadricula[i].setKilometraje(kilometraje);

            }
            if(modelo.equalsIgnoreCase("Jeep")){
                cuadricula[i].setModelo("Jeep Full");
                cuadricula[i].setCapacidad_de_tanque(60);
                kilometraje=(int)(Math.random()*2000);
                cuadricula[i].setKilometraje(kilometraje);

            }
            System.out.println(cuadricula[i].getModelo());
        }
        return 0;
    }

    public int Prestar_Auto(){
        System.out.println("Ingrese el numero de estacionamiento del vehiculo a prestar : ");
        System.out.println("");
        seleccionado=leer_seleccionado.nextInt();

        if(control[seleccionado].equalsIgnoreCase("Prestado")){
            System.out.println("El vehículo no se encuentra disponible para préstamo. Por favor escoja otro");
        }

        if(control[seleccionado].equalsIgnoreCase("Disponible")) {
            System.out.println("Usted ha arrendado el automovil marca " + cuadricula[seleccionado - 1].getModelo() + ", con capacidad de combustible" +
                    " de : " + cuadricula[seleccionado - 1].getCapacidad_de_tanque() + " litros; con " + cuadricula[seleccionado - 1].getKilometraje() + "" +
                    " kilometraje. Por favor, al finalizar su jornada, devolver el automovil al lugar " + (seleccionado) + " .");
            control[seleccionado]="Prestado";
        }
        return 0;
    }
}
