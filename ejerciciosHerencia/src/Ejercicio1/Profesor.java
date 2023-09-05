package Ejercicio1;

public class Profesor extends Persona{

    private String titulo;

    public Profesor(String titulo) {
        this.titulo = titulo;
    }

    public Profesor(String nombre, String apellido, int edad, String titulo) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void andar() {
        System.out.println(" Ando caminando ");
    }
}
