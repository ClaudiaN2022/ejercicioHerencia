package Ejercicio1;

public class Alumno extends Persona{

    private int legajo;

    public Alumno(int legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, String apellido, int edad, int legajo) {
        super(nombre, apellido, edad);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }


    @Override
    public void andar() {
        System.out.println(" Ando corriendo");
    }
}
