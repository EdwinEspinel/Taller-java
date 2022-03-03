package Taller2;

public class Venta {
    private String sabor;
    private int cantidad;
    private int fecha;

    public int getCantidad() {
        return cantidad;
    }

    public String getSabor() {
        return sabor;
    }

    public int getFecha() {
        return fecha;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "sabor=" + sabor + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }
      
}
