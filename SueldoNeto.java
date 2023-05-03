package poo_3;
public class SueldoNeto {
    private int obraSocial = 3;
    private int jubilacion = 11;
    private int presentismo = 10;
    double sueldoNeto = 0;
    double sueldoBasico;
    
    public SueldoNeto(double s){
        this.sueldoBasico = s;
    }

    public int getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(int obraSocial) {
        this.obraSocial = obraSocial;
    }

    public int getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(int jubilacion) {
        this.jubilacion = jubilacion;
    }

    public int getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(int presentismo) {
        this.presentismo = presentismo;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public void anadirComision(int cant){
        this.sueldoNeto = sueldoBasico + (this.sueldoBasico/100*2)*cant;
    }
    
    public double calcularSueldo(){
        
        sueldoNeto = sueldoBasico-(3*sueldoBasico/100);
        sueldoNeto = sueldoBasico - (11*sueldoBasico/100);
        sueldoNeto = sueldoBasico + (10*sueldoBasico/100);
        
        return sueldoNeto;
    }

    public void mostrarSueldo(){
        System.out.println("El sueldo es: " + calcularSueldo());
    }
     
}