package poo_3;

public class Poo_3 {

    public static void main(String[] args) {        
        SueldoNeto sueldo1 = new SueldoNeto(1000);
        Empleado e = new Empleado("Pedro", 18, sueldo1);
        SueldoNeto sueldo2 = new SueldoNeto(1000);
        Empleado v = new Vendedor("Jesus", 19, sueldo2, 1);
        Cliente c = new Cliente("Miguel", 34, 1200);
        
        
        Empleado[] subordinados = new Empleado[] {e, v};

        SueldoNeto sueldo3 = new SueldoNeto(545);
        Empleado d = new Directivo("Josue", 25, sueldo3, subordinados, "S");
        Empleado[] empleados = new Empleado[] {e, v, d};
        Cliente[] clientes = new Cliente[] {c};
        
        Empresa emp = new Empresa(empleados, clientes);
        
        emp.mostrarEmpresa();
    }
    
}
