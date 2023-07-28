package encapsulation;

import javax.swing.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("placa: "));
        car.setColor(JOptionPane.showInputDialog("color: "));
        car.setModelo(Integer.parseInt(JOptionPane.showInputDialog("modelo: ")));
        JOptionPane.showMessageDialog(null,car.getPlate());
        JOptionPane.showMessageDialog(null,car.getColor());
        JOptionPane.showMessageDialog(null,car.getModelo());
    }
}
