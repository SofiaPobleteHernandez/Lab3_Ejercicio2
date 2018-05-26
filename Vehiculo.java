public class Vehiculo {
    private String modelo;
    private int capacidad_de_tanque;
    private int kilometraje;

    public Vehiculo(){
        this.modelo=modelo;
        this.capacidad_de_tanque=capacidad_de_tanque;
        this.kilometraje=kilometraje;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getCapacidad_de_tanque(){
        return this.capacidad_de_tanque;
    }

    public int getKilometraje(){
        return this.kilometraje;
    }

    public String setModelo(String modelo){
        this.modelo=modelo;
        return this.modelo;
    }

    public int setCapacidad_de_tanque(int capacidad_de_tanque){
        this.capacidad_de_tanque=capacidad_de_tanque;
        return this.capacidad_de_tanque;
    }

    public int setKilometraje(int kilometraje){
        this.kilometraje=kilometraje;
        return this.kilometraje;
    }
}
