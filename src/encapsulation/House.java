package encapsulation;

public class House {
    private String dirección;
    private int alcobas;
    private String propietario;

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getAlcobas() {
        return alcobas;
    }

    public void setAlcobas(int alcobas) {
        this.alcobas = alcobas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
