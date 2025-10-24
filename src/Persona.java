public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private String telefono;

    public Persona() {}

    public Persona(String nombre, String apellido, int edad, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
    }

    /*
     * TODO: Crea el constructor de la clase Persona que reciba como parámetro una cadena
     * de caracteres con los valores separados por comas (,)
     * Ejemplo de cadena: "Ana,Perez,25,ana.perez@example.com,+34911111111"
     *
     * El constructor debe:
     * 1. Separar los valores usando split(",").
     * 2. Asignar los valores a los atributos correspondientes.
     * 3. Convertir el tercer valor (edad) a entero.
     * 4. No lanzar excepciones. Si algo falla, asigna valores por defecto.
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
