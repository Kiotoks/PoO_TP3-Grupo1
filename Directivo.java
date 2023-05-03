package poo_3;

public class Directivo extends Empleado{
    private Empleado[] subordinados;
    private String categoria;
    
    public Directivo(String n, int e, SueldoNeto sueldo, Empleado[] s, String c){
        super(n, e, sueldo);
        this.subordinados = s;
        this.categoria = c;
    }

    public Empleado[] getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(Empleado[] subordinados) {
        this.subordinados = subordinados;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Su categoria es: " + this.categoria);
        System.out.println("Sus subordinados son: ");
        
        for(int x = 0; x < subordinados.length; x++){
            this.subordinados[x].mostrarDatos();
        
    }
    
    }
    
}
