package swich1;

public class Swich1 {
    public int option;

    public String showOption() {
        switch (option) {
            case 1: {
                return "su premio es un celular :3";
            }
            case 2: {
                return "su premio es una chocolatina :3";
            }
            default: {
                return "opcion incorrecta";
            }
        }
    }
}
