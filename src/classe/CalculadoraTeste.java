package classe;
 
import java.util.Scanner;

public class CalculadoraTeste {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Adição: ");
        System.out.println("2 - Subtração: ");
        System.out.println("3 - Multiplicação: ");
        System.out.println("4 - Divisão: ");
        System.out.println("5 - Módulo da operação: ");

        int escolha = entrada.nextInt();

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double segundoNumero = entrada.nextDouble();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = Calculadora.somar(primeiroNumero, segundoNumero);
                break;
            case 2:
                resultado = Calculadora.subtrair(primeiroNumero, segundoNumero);
                break;
            case 3:
                resultado = Calculadora.multiplicar(primeiroNumero, segundoNumero);
                break;
            case 4:
                resultado = Calculadora.dividir(primeiroNumero, segundoNumero);
                break;
            case 5:
                resultado = Calculadora.modulo(primeiroNumero, segundoNumero);
                break;
            default:
            System.out.println("Operação Inválida.");

            entrada.close();

            return;
        }

        if(resultado % 2 == 0) {
            System.out.printf("O seu resultado é: %.2f sendo um número PAR", resultado);
        } else {
            System.out.printf("O seu resultado é: %.2f sendo um número ÍMPAR", resultado);
        }
    }
}
