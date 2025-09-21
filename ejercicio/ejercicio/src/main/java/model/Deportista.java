package model;

public class Deportista {
    private int id;
    private String nombre; 
    private int edad;
    private String disciplina;
   

    public Deportista(String nombre, String disciplina, int edad, int id) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
