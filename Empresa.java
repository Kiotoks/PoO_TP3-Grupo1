package poo_3;

public class Empresa {
    private Empleado[] empleados;
    private Cliente[] clientes;
    
    public Empresa(Empleado[] e, Cliente[] c){
        this.empleados = e;
        this.clientes = c;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    public void mostrarEmpresa(){
        for(int x = 0; x < empleados.length; x++){
            System.out.println("Datos del empleado: ");
            empleados[x].mostrarDatos();
            System.out.println(" ");
        }
        for(int i = 0; i < clientes.length; i++){
            System.out.println("Datos del cliente: ");
            clientes[i].mostrarDatos();
            System.out.println(" ");
        }
    }
}
