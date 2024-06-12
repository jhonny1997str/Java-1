import java.util.Scanner;

public class Ejericio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Ingresa un numero entero");
        a = scanner.nextInt();

        if(a <= 0){
            System.out.println("Error el valor debe ser apartir de uno.");
        }else {
            System.out.println("Los numeros pares son : ");

            for(int i = 1; i <= a; i++ ){
                if(i % 2 ==0){
                    System.out.print(i + " ,");

                }
            }

            for(int i = 1; i <= a; i++ ){
                if(i % 2 ==1){
                    System.out.print(i + " ,");
                    System.out.println("\nLos numeros impares sonn : ");
                }
            }
        }
    }

}



