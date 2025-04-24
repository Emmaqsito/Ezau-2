import java.util.Scanner;

public class Examenes {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float cal [] = new float [5];
        float d=0;
        float sum = 0;
        int x=1;
        float prom = 0;
        for(int i=0; i<5; i++){
            System.out.println("Ingresa las calificaciones del alumno "+x+" :");
            d = read.nextFloat();
            if(d>=0 && d<=100){
                cal [i] = d;
                sum=sum+d;
                x=x+1;
            }else{
                System.out.println("Ingrese un numerp valido entre 0 y 100");
                i=i-1;
            }
        }
        prom=sum/5;
        System.out.println("Suma total: "+sum);
        System.out.println("Promedio del grupo: "+prom);
    }
    
}