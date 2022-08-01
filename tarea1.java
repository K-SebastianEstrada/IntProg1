import java.util.Scanner;

public class tarea1{

    static void suma(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int c = sc.nextInt();
        System.out.println("El resultado de la suma es: ");
        suma(a,b,c);
        sc.close();
    }
}

