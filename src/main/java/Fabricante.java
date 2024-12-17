package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre){this.nombre=nombre; }

    public Pais getPais() { return pais; }
    public void setPais(Pais pais){this.pais=pais; }

    public static Fabricante fabricaMayorVentas() {
        int maxVentas = 0;
        Fabricante fabricaMayorVentas = null;
    
        for (Vehiculo v1 : Vehiculo.vehiculos) {
            int contador = 0;
    
            for (Vehiculo v2 : Vehiculo.vehiculos) {
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

