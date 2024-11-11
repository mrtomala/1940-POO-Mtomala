
package main;

public class Frutas {
    
    public String Nombre;
    public String Color;
    public float Precio;
    
    public Frutas(String Nombre, String Color, float precio){
        this.Nombre=Nombre;
        this.Color=Color;
        this.Precio=precio;
    }
    public void informacion() {
        System.out.println("El nombre es " + Nombre + ", su color es: " + Color + ", y cuesta " + Precio + "$.");
    }
}