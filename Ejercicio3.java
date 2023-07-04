package Recu2Programacion;

public class Ejercicio3 {
    public static void main(String[] args) {
    int[] numeros = {10,5,20,8,15,25,30,40};
    int numeromaximo = numeros[0];

    for(int i=0;i<numeros.length;i++){
        if (numeros[i]>numeromaximo){
            numeromaximo=numeros[i];
        }
    }
      System.out.println("El numero maximo es: "+numeromaximo);
    }
}