package encapsulation;

public class MainHouse {
    public static void main(String[] args) {
        House house= new House();
        house.setDirección("calle 3 #21,52");
        house.setAlcobas(3);
        house.setPropietario("Juan");
        System.out.println(house.getDirección());
        System.out.println(house.getAlcobas());
        System.out.println(house.getPropietario());
    }
}
