package MaquinaExpendedora;

public class MaquinaExp {

    public int candy;
    public int ingresos;

    public String showOption() {
        switch(candy){
            case 1: {
                System.out.println("Usted ha escogido la Chocolatina");
                if (ingresos >= 10){
                    System.out.println("¡Disfrute de su chocolatina!");
                    System.out.println("Su cambio es: " + (ingresos - 10));
                    break;
                } else {
                    return "Sus ingresos no son suficientes";
                }
            }
            default: {
                return("La opción seleccionada no es válida");
            }
        }
        return null;
    }
}
