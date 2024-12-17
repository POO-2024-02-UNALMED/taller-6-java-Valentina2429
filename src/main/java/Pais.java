package vehiculos;

public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public static Pais paisMasVendedor() {
        int maxVentas = 0;
        Pais paisMasVendedor = null;
    
        for (Vehiculo v1 : Vehiculo.vehiculos) {
            int contador = 0;
    
            for (Vehiculo v2 : Vehiculo.vehiculos) {
                if (v1.fabricante.getPais().equals(v2.fabricante.getPais())) {
                    contador++;
                }
            }
    
            if (contador > maxVentas) {
                maxVentas = contador;
                paisMasVendedor = v1.fabricante.getPais();
            }
        }
        return paisMasVendedor;
    }
    
}
