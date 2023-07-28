package encapsulation;

public class Car {
    private String Plate;
    private String Color;
    private int modelo;

    public String getPlate() {
        return Plate;
    }

    public void setPlate(String plate) {
        Plate = plate;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
