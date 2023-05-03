
package poo_3;

public class Persona {
    public int edad;
    public String nombre;
    public Persona(String n,int e){
        
        this.edad = e;
        this.nombre = n;
        
    }   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   public void mostrarDatos(){
    System.out.println("El nombre es: "+ this.nombre + ", edad: " + this.edad);
 }
}