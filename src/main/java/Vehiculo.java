package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;
    public static int cantidadVehiculos = 0;
    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();


    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        vehiculos.add(this);
    }

    // Getters y Setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getPuertas() {return puertas;}
    public void setPuertas(int puertas) {this.puertas = puertas;}

    public int getVelocidadMaxima() {return velocidadMaxima;}
    public void setVelocidadMaxima(int velocidadMaxima) {this.velocidadMaxima = velocidadMaxima;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public String getTraccion() {return traccion;}
    public void setTraccion(String traccion) {this.traccion = traccion;}

    public Fabricante getFabricante() {return fabricante;}
    public void setFabricante(Fabricante fabricante) {this.fabricante = fabricante;}

    public static int getCantidadVehiculos() {return cantidadVehiculos;}
    public void setCantidadVehiculos(int cantidadVehiculos) {this.cantidadVehiculos=cantidadVehiculos;}

    public static String vehiculosPorTipo() {
        return "Automoviles: " + Automovil.cantidadAutomoviles + "\n" +
               "Camionetas: " + Camioneta.cantidadCamionetas + "\n" +
               "Camiones: " + Camion.cantidadCamiones;
    }
}
