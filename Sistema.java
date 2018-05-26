public class Sistema {
    Prestamos autos;

    public Sistema(){
        autos=new Prestamos();
    }

    public void Sistema(){

        System.out.println("");
        System.out.println("    SISTEMA DE PRÉSTAMO DE AUTOS DE HERTZ");
        System.out.println("    =====================================");
        System.out.println("");
        autos.Rellenar_Cuadricula();
        autos.Prestar_Auto();

        int disponibles=0;
        for(int i=0; i<10; i++){
            if (autos.control[i].equalsIgnoreCase("Disponible")){
                disponibles++;
            }
        }

        while(disponibles>0){
            autos.Prestar_Auto();
            for(int i=0; i<10; i++){
                if (autos.control[i].equalsIgnoreCase("Disponible")){
                    disponibles++;
                }
            }
        }
    }
}
