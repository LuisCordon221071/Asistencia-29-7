import java.util.Scanner;
public class Ciclo{
    public static void main(String[] args){
        Semestre ciclo = new Semestre{};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Beinvenido a mi programa");
        String nombre = "";
        float nota = 0;
        for (int i = 1; i<5; i++){
            System.out.println("ASIGNATURA"+i);
            System.out.println("-------------------");
            System.out.println("Ingrese el nombre del curso:");
            nombre = teclado.nextLine();
            System.out.println("Nota:");
            nota = teclado.nextFloat();
            System.out.println("-------------------");  
        }
    }
}