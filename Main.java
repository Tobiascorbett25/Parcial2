import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if(numero>0){
         System.out.println("El numero es positivo: ");
        }else if (numero<0){
     System.out.println("El numero es negativo: ");
        }else{
            System.out.println("El numero es 0: ");
        }
}
}