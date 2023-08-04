package classe;

public class Calculadora {
    
    public static double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

        public static double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

        public static double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

        public static double dividir(double numeroUm, double numeroDois) {
        if(numeroDois == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return numeroUm / numeroDois;
    }

        public static double modulo(double numeroUm, double numeroDois) {
            return numeroUm % numeroDois;
    }
}
