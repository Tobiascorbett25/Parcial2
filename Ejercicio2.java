package Recu2Programacion;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
        int inpar =0;
        int par=0;

        for(int i=0;i<numeros.length;i++){

            if (numeros[i]%2==0){
                par++;
            }else{
                inpar++;
            }
        }
        System.out.println("Numeros total de pares: "+par);
        System.out.println("Numeros total de inpares: "+inpar);
}
}
