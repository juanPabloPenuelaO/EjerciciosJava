package encapsulation;

import javax.swing.*;

public class MainSuma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.setNumber1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1:")));
        suma.setNumber2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero 2: ")));
        JOptionPane.showMessageDialog(null,"el resultado es: "+suma.sumar());
    }
}
