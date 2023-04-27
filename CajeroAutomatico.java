import javax.swing.*;

public class CajeroAutomatico {

    public static void main(String[] args) {
    final int saldo_inicial = 1000;
    int opcion;
    float ingreso, saldo_actual, retiro, saldoActual ;

    opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático\n " +
            "1. Ingresar dinero a la cuenta\n" +
            "2. Retirar dinero de la cuenta\n" +
            "3. Salir"));
    switch (opcion){
        case 1: ingreso = Integer.parseInt(JOptionPane.showInputDialog
                ("diga la cantidad que desea ingresar en la cuenta: "));
                saldo_actual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta" + saldo_actual);
                break;

        case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Diga la cantidad que desea retirar: "));
            if (retiro > saldo_inicial){
                JOptionPane.showMessageDialog(null, "No tienes suficiente presuesto");
            }
            else {
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                break;
            }
        case 3: break;
        default: JOptionPane.showMessageDialog(null, "Se equivoco de menu");
            break;
        }
    }
}
