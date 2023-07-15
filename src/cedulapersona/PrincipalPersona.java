package cedulapersona;

public class PrincipalPersona {
    public static void main(String[] args) {
        persona Persona=new persona();
        Persona.cedula="1090272903|";
        Persona.nombre="Pablo";
        Persona.kilos=60.5f;
        Persona.mail="jpenuela2229";
        Persona.edad=18;
        System.out.println(Persona.mostrarDatos());
    }
}