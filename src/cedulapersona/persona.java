package cedulapersona;

public class persona {
    public String cedula;
    public String nombre;

    public String mail;

    public int edad;

    public float kilos;

    public String mostrarDatos(){
        return "la cedula de la persona es: "+ cedula + " el nombre es: "+ nombre +
                " registrado con su mail: " + mail + " con un peso de: "+ kilos +" y con " + edad + " años de edad";
    }
}
