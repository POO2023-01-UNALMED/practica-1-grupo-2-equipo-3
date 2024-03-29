package gestorAplicacion.modelos;

/*Clase Empleado hereda de Persona los atributos nombre, identificacion y telefono*/

public class Empleado extends Persona{

    // ATRIBUTOS
    private String cargo;
    private double comision;
    private final int nomina=560000; // Valor prestablecido para cada uno de los empleados

    // METODOS

    /*
     * Metod sobreescrito de Persona que devuelve la impormacion mas importante el
     * empleado
     */
    @Override
    public String informacion() {
        return ("Nombre: " + this.getNombre() + "\n" +
                "Documento: " + this.getIdentificacion() + "\n" +
                "Cargo: " + this.getCargo() +"\n"+
                "Nomina: " + this.getNomina() + "\n");
    }

    /*
     * Metodo calcularComision se encarga de modificar la comision de cada empleado
     * en funcion de
     * sus ventas, cada que se realiza una factura a su nombre y recibe por paramtro
     * valor total de dicha factura
     */
    public void calcularComision(int valorPagado) {
        double x = 0.02 * valorPagado;
        this.comision = +x;
    }

    // CONSTRUCTOR
    public Empleado(String nombre, int identificacion, int telefono, String cargo) {
        super(nombre, identificacion, telefono);
        this.cargo = cargo;
        this.comision = 1000; //Valor inical para todos los empleados
    }

    //Este siguiente constructor alternativo fué creado en aras de facilitar masivamente 
    //la creación de empleados para la funcionalidad reserva de evento.
    //Esto pues en la contratación de empleados adicionales de la reserva de evento, tales 
    //como chefs, meseros, etc, no se requiere de un un telefono para cada uno de los
    //empleados contratados.
    
    /*
     * Constructor alternativo para la creacion de empleados, solo recibe nombre,
     * identificacion y cargo.
     */
    public Empleado(String nombre,int identificacion, String cargo){
        this(nombre,identificacion, 0, cargo);
    }

    // GETTERS AND SETTERS
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getNomina() {
        return nomina;
    }


}
