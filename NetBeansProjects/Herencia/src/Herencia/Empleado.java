package Herencia;
public class Empleado extends Persona{
    
private double sueldo;

public Empleado(String nombre,String apellido,String documento, double sueldo){
    super(nombre,apellido,documento);
    this.sueldo= sueldo;
}
public String mostrarEmpleado(){
    return getNombre()+"Apellido/n"+getApellido()+"Documento/n"+getDocumento()+"sueldo"+sueldo;
}
}