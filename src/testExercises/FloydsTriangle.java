package testExercises;

// Escreva um programa que leia um número inteiro positivo n e em seguida imprima n
//linhas do chamado Triangulo de Floyd. Para n = 6, temos:
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19 20 21

public class FloydsTriangle {
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }


    }
}
