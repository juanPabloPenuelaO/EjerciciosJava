package encapsulation;


import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("ingrese la dirección: "));
        agency.setAgentName(JOptionPane.showInputDialog("Ingrese el nombre de la agencia: "));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("el precio es: ")));
        JOptionPane.showMessageDialog(null, agency.getAdress());
        JOptionPane.showMessageDialog(null, agency.getAgentName());
        JOptionPane.showMessageDialog(null, agency.getPrice());
    }
}
