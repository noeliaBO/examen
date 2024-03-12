package examen;

public class Coche {
    public String marca;
    public String modelo;
    public double precio;
    public int km;

    private static int kmTotales = 0;
    public Coche(String marca, String modelo, double precio, int km) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.km = km;
    }
    public static int getKmTotales() 
    {
        return Coche.kmTotales;
    } 
    public double precioConIva(boolean ivareducido) 
    {
        /* si el impuesto es reducido, el precio con iva es el precio del coche incrementado un 10%
           si no es reducido, el precio con iva es el precio del coche incrementado un 21%
        */
        if (ivareducido){
            return precio * 1.10;
        }else {
            return precio* 1.21;
        }
    }
    public void aplicarDescuento() 
    {
        /*si el precio del coche es menor a 10.000€ se aplica un descuento del 15%
          sino se aplica un descuento del 7%
        */
        if (precio<10000){
            this.precio = precio * 0.85;
        }else {
            this.precio = precio * 0.93;
        }
    }
    public void recorrerKm(int km) {
        this.km += km;
        Coche.kmTotales += km;
  }
}

