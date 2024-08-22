// Alejandro Ailón  | 5090-23-1070
// --------------------------------------------- PERSONA ------------------------------------------------
class Persona{
    private String nombre;
    private String direccion;

    Persona(){

    }

    Persona(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    String getNombre(){
        return this.nombre;
    }

    String getDireccion(){
        return this.direccion;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setDireccion(String direccion){
        this.direccion = direccion;
    }

    void Imprimir(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
    }
}

// -------------------------------------------- ESTUDIANTE ------------------------------------------
class Estudiante extends Persona{
    private String carrera;
    private int semestre;


    Estudiante(String carrera, int semestre){
        super();
        this.carrera = carrera;
        this.semestre = semestre;
    }


    Estudiante(String nombre, String direccion, String carrera, int semestre){
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    String getCarrera(){
        return this.carrera;
    }

    int getSesmestre(){
        return this.semestre;
    }

    void setCarrera(String carrera){
        this.carrera = carrera;
    }

    void setSemestre(int semestre){
        this.semestre = semestre;
    }

    @Override
    void Imprimir(){
        super.Imprimir();
        System.out.println("Carrera: " + this.carrera);
        System.out.println("Semestre: " + this.semestre);
    }
}

// -------------------------------------------- Profesor --------------------------------------------
class Profesor extends Persona{
    private String departamento;
    private String categoria;

    Profesor(String departamento, String categoria){
        this.departamento = departamento;
        this.categoria = categoria;
    }

    Profesor(String nombre, String direccion, String departamento, String categoria){
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    String getDepartamento(){
        return this.departamento;
    }

    String getCategoria(){
        return this.categoria;
    }

    void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    void setCategoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    void Imprimir(){
        super.Imprimir();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Categoria: " + this.categoria);
    }
}


//  ---------------------------------------------- MAIN -----------------------------------------------
public class Main {
    public static void main(String[] args) {
        // ------ Datos para imprimir de Persona
        System.out.println("---------------------------------------------------------------------");
        System.out.println("PERSONA:");
        Persona miPersona = new Persona("Alejandro", "Villa Nueva");
        miPersona.Imprimir();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("PERSONA: ");
        Persona tuPersona = new Persona();
        tuPersona.Imprimir();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("ESTUDIANTE:");
        Estudiante miEstudiante = new Estudiante("Ingenieria en Sistemas", 4);
        miEstudiante.Imprimir();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("ESTUDIANTE:");
        Estudiante tuEstudiante = new Estudiante("Arquitectura", 7);
        tuEstudiante.setNombre("Javier");
        tuEstudiante.setDireccion("San Miguel Petapa");
        tuEstudiante.Imprimir();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("PROFESOR:");
        Profesor miProfesor = new Profesor("Matematicas","Calculo II");
        miProfesor.Imprimir();

        System.out.println("---------------------------------------------------------------------");
        System.out.println("PROFESOR:");
        Profesor tuProfesor = new Profesor("Efrain", "Monterrico", "Informatica", "Programacion");
        tuProfesor.Imprimir();
    }
}













