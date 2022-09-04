package exercicios;

import java.util.Scanner;

public class Ex34 {

    //Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
    //a. Infantil A = 5 - 7 anos;
    //b. Infantil B = 8 - 10 anos;
    //c. Juvenil A = 11- 13 anos;
    //d. Juvenil B = 14 - 17 anos;
    //e. Sênior = 18 - 25 anos.
    //Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int idade;
        int infantilA;
        int infantilB;
        int juvenilA;
        int juvenilB;
        int senior;

        System.out.println("=== Classificação ===");

        System.out.println("Digite a idade");
        idade = scanner.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Juvenil A");
        }else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Sênior");
        } else {
            System.out.println("Idade fora da faixa etária");
        }

    }
}