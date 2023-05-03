package poo_3;

public class Cliente extends Persona{
    private int telefono;
    
    public Cliente(String n, int e, int t){
        super(n, e);
        this.telefono = t;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El telefono es:" + this.telefono);
       
    }
}
