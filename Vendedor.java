package poo_3;

public class Vendedor extends Empleado{
    private int cantVentas;
    
    public Vendedor(String n, int e, SueldoNeto s, int cant){
        super(n, e, s);
        this.cantVentas = cant;
        super.sueldoBruto.anadirComision(cantVentas);
    }

    public double getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cant) {
        this.cantVentas = cant;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El sueldo mas la comision es: " + super.sueldoBruto.sueldoBasico + (super.sueldoBruto.sueldoBasico/100*2)*cantVentas);
    }
}