package secao3.fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro salário: ");
        String salario1 = scanner.nextLine().replace(",", ".");;

        System.out.print("Digite o segundo salário: ");
        String salario2 = scanner.nextLine().replace(",", ".");

        System.out.print("Digite o terceiro salário: ");
        String salario3 = scanner.nextLine().replace(",", ".");;

//        if(salario1.contains(",")){
//            salario1 = salario1.replace(",", ".");
//        }
//        if(salario2.contains(",")){
//            salario2 = salario2.replace(",", ".");
//        }
//        if(salario3.contains(",")){
//           salario3 = salario3.replace(",", ".");
//        }

        double media = (Double.parseDouble(salario1) +
                Double.parseDouble(salario2) +
                Double.parseDouble(salario3)) / 3;

        System.out.println("A média dos salários é: " + media);
        System.out.println(String.format("A média dos salários é: %.2f", media));
        /*O método printf utiliza especificadores de formato como %d para inteiros, %f para números de ponto flutuante, %s para strings, etc.. - %n é pula linha*/
        System.out.printf("A média dos salários é: %.2f%n", media);

        scanner.close();
    }
}
