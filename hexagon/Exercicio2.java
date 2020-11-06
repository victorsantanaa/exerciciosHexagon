package hexagon;

import java.util.Scanner;

public class Exercicio2 {
    public Exercicio2() {
    }
    public int scanNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a posição da sequência de Fibonacci");
        return in.nextInt();
    }

    public int fibonacci(int number){
        if(number == 1 || number ==2){
            return 1;
        }
        return fibonacci(number -1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        Exercicio2 exercicio2 = new Exercicio2();
        int number = exercicio2.scanNumber();
        System.out.println(exercicio2.fibonacci(number));
    }
}
