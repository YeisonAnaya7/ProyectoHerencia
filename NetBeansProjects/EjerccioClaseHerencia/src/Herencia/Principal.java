
package Herencia;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
    String menu = JOptionPane.showInputDialog("Menu\n"+
                  "1.Empleado \n"+
                  "2.Cliente\n"+
                  "3.Salir\n");
    int opciones = Integer.parseInt(menu);
                 
    switch (opciones) {
        case 1:
           String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre");
           int edadEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
           double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario"));
           Empleado empleado = new Empleado(salario,nombreEmpleado,edadEmpleado);
           empleado.mostrarEmpleado();
        break;
        case 2:
           String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre");
           int edadCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
           String direccion = JOptionPane.showInputDialog("Ingrese el direccion");
           Cliente cliente = new Cliente(direccion,nombreCliente,edadCliente);
           cliente.mostrarCliente();
        break;
        case 3:
        break;
    }
}
}