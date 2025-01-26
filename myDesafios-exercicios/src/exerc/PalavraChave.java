package exerc;

import java.util.Scanner;

//Faça um programa que recebe uma
//palavra-chave e uma frase e substitui a
//palavra-chave por *** (3 asteriscos).
//Entrada:
//segredo
//deixa eu contar-te um segredo bem segredo
//saída:
//deixa eu contar-te um *** bem ***
public class PalavraChave {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra-chave: ");
        String palavraChave = scanner.nextLine();

        System.out.print("Digite a frase: ");
        String frase = scanner.nextLine();

//        String[] palavras = frase.split(" ");
//
//        for (int i = 0; i < palavras.length; i++) {
//            if (palavras[i].equals(palavraChave)) {
//                palavras[i] = "***";
//            }
//        }

        // Junta as palavras novamente para formar a frase modificada
//        String resultado = String.join(" ", palavras);


        // Substitui todas as ocorrências da palavra-chave por ***
        String resultado = frase.replaceAll("\\b" + palavraChave + "\\b", "***");
        //replaceAll para substituir todas as ocorrências da palavra-chave na frase.
        // A expressão regular \\b é usada para garantir que a palavra-chave seja substituída apenas como uma palavra inteira, e não como parte de outra palavra.
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }


}
