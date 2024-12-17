package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public Pais getPais() { return pais; }

    public static Fabricante fabricaMayorVentas() {
        int maxVentas = 0;
        Fabricante fabricaMayorVentas = null;
    
        // Recorremos la lista de fabricantes para comparar las ventas
        for (Vehiculo v1 : vehiculos) {
            int contador = 0;
    
            for (Vehiculo v2 : vehiculos) {
                if (v1.fabricante.equals(v2.fabricante)) {
                    contador++;
                }
            }
    
            if (contador > maxVentas) {
                maxVentas = contador;
                fabricaMayorVentas = v1.fabricante;
            }
        }
        return fabricaMayorVentas;
    }
    
}

