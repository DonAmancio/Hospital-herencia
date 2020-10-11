package Hospital;

final class Paciente {

    private String id;

    private String nombre;

    private String apellidos;

    private int edad;

    private String genero;

    private String CodVisita;

    public Paciente(String id, String nombre, String apellidos, int edad, String genero) {

        this.id = id;

        this.nombre = nombre;

        this.apellidos = apellidos;

        this.edad = edad;

        this.genero = genero;
    }

    public Paciente() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void mostrar() {

        System.out.println("===========================================");

        System.out.println("CI DEL PACIENTE: " + id);

        System.out.println("Nombre: " + nombre);

        System.out.println("Apellidos: " + apellidos);

        System.out.println("Edad: " + edad);

        System.out.println("Genero: " + genero);

        System.out.println("codigo de visita " + CodVisita);

        System.out.println("===========================================");

    }

    public void modificar() {


        System.out.println("===========================================");

        System.out.println("CI DEL PACIENTE: " + id);

        System.out.println("Nombre: " + nombre);

        System.out.println("Apellidos: " + apellidos);

        System.out.println("Edad: " + edad);

        System.out.println("Genero: " + genero);

        String ciudad = null;
        
        System.out.println("Ciudad: " + ciudad);

        System.out.println("===========================================");



    }

    public void setVisita() {



        System.out.println("===========================================");

        System.out.println("Codigo de visita: " + CodVisita);

        Paciente fechaHora = new Paciente();

        System.out.println("Fecha y hora: " + fechaHora);

        String hospital = "";
        System.out.println("Hospital: Los Olivos " + hospital);

        System.out.println("Medico: Doctor Chapatin " );

        System.out.println("Diagnostico: " + null);

        System.out.println("Ciudad: COCHABAMBA  ");

        System.out.println("Trtamientos: Paracetamol cada 8 horas " );

        System.out.println("Numero de cama: 12B" );

        String fechaSadlida = "";

        System.out.println("Fecha de salida" + fechaSadlida);

        System.out.println("Historial medico : Diabetes " );



        System.out.println("===========================================");



    }
}
