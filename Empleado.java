package poo_3;

public class Empleado extends Persona{
    public SueldoNeto sueldoBruto; 
    
    public Empleado(String n,int e, SueldoNeto s){
        super(n,e);
        this.sueldoBruto = s;
    }   

    public SueldoNeto getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(SueldoNeto sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("El nombre es: " + this.nombre + ", edad: " + this.edad);
        this.sueldoBruto.mostrarSueldo();
    }
}
