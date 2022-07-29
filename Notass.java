import java.util.Scanner;
public class Notass{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float nota1;
        System.out.print("Física: ");
        nota1 = teclado.nextFloat();
        if (nota1 < 10){
            System.out.println("tienes que mejorar tu promedio");
        }
        if (nota1 > 90){
            System.out.println("¡Muy bien! sigue así :D");
        }
        float nota2;
        System.out.print("Química: ");
        nota2 = teclado.nextFloat();
        if (nota2 < 10){
            System.out.println("tienes que mejorar tu promedio");
        }
        if (nota2 > 90){
            System.out.println("¡Muy bien! sigue así :D");
        }
        float nota3;
        System.out.print("Cálculo: ");
        nota3 = teclado.nextFloat();
        if (nota3 < 10){
            System.out.println("tienes que mejorar tu promedio");
        }
        if (nota3 > 90){
            System.out.println("¡Muy bien! sigue así :D");
        }
        float nota4;
        System.out.print("Estadística: ");
        nota4 = teclado.nextFloat();
        if (nota4 < 10){
            System.out.println("tienes que mejorar tu promedio");
        }
        if (nota4 > 90){
            System.out.println("¡Muy bien! sigue así :D");
        }
        float nota5;
        System.out.print("POO: ");
        nota5 = teclado.nextFloat();
        if (nota5 < 10){
            System.out.println("tienes que mejorar tu promedio");
        }
        if (nota5 > 90){
            System.out.println("¡Muy bien! sigue así :D");
        }
        float nota6;
        System.out.print("Ciudadanía global: ");
        nota6 = teclado.nextFloat();
        if (nota6 < 10){
            System.out.println("tienes que mejorar tu promedio");
        }
        if (nota6 > 90){
            System.out.println("¡Muy bien! sigue así :D");
        }
        float suma;
        suma = nota1+nota2+nota3+nota4+nota5+nota6;
        float promedio;
        promedio = suma/6;
        System.out.println("Tu promedio general es de: "+promedio);
        if (nota1 > nota2){
        System.out.println("Esta fue tu mejor nota: "+nota1);
        }
    }
}