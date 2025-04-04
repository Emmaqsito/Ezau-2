
import java.util.Scanner;

public class Obreros {
    public static void main(String[] args) {
        //los obreros pueden laborar en 3 turnos    
        Scanner read = new Scanner(System.in);
        float a,b = 0,c =0,d=0,e=0;
        String x;
        System.out.println("Turno:");
        System.out.println("(m) Matutino");
        System.out.println("(v) Vespertino");
        System.out.println("(n) nocturno:");
        x = read.nextLine();
        System.out.println("Horas trabajadas:");
        a = read.nextInt();
        if (a>40){
            b=a-40;
            a=40;
        }
        switch (x) {
            case "m":
            c = a*150;
            
                break;
            case "v":
            c = a*170;
            
                break;
            case "n":
            c = a*200;
            
                break;
            default:
                System.out.println("Turno equivocado");
        }
        d = b*100;
        e=c+d;
        System.out.println("Horas regulares a pagar: "+c);
        System.out.println("Horas extras a pagar: "+d);
        System.out.println("Total a pagar: "+e);

    }
}
