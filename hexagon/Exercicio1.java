package hexagon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

    public Exercicio1() {
    }

    Scanner in = new Scanner(System.in);

    public String defineBuzzFizz(int buzz, int fizz, int number){

        if(number % buzz == 0 && number % fizz ==0){
            return "FizzBuzz";
        } else if(number % buzz == 0){
            return "Buzz";
        } else if(number % fizz == 0){
            return "Fizz";
        }
        return String.valueOf(number);
    }

    public int scanNumber(String frase){
        System.out.println(frase);
        return in.nextInt();
    }

    public static void main(String[] args) {

        Exercicio1 exercicio1 = new Exercicio1();
        int tam = exercicio1.scanNumber("Digite o tamanho do vetor");
        int fizz = exercicio1.scanNumber("Digite o valor de X");
        int buzz = exercicio1.scanNumber("Digite o valor Y");

        int[] vetor = new int[tam+1];
        String[] result = new String[tam+1];

        for(int count = 0; count < vetor.length; count ++){
            vetor[count] = count + 1;
        }

        for (int count = 0; count < vetor.length; count ++){
            result[count] = exercicio1.defineBuzzFizz(buzz, fizz, vetor[count]);
        }

        System.out.println(Arrays.toString(result));

    }
}
