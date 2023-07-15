package swich1;

import java.util.Scanner;

public class MainSwich {
    public static void main(String[] args) {
        Swich1 s=new Swich1();
        Swich1 a=new Swich1();
        Scanner lector= new Scanner(System.in);
        System.out.println("ingrese una opcion");
        a.option= lector.nextInt();
        System.out.println(s.showOption());
    }
}
