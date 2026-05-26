package Calculadora;

public class Model {

    public long calcular(long primerNumero, long segundoNumero, String operador) {
        switch (operador) {
            case "+":
                return primerNumero + segundoNumero;
            case "-":
                return primerNumero - segundoNumero;
            case "*":
                return primerNumero * segundoNumero;
            case "/":
                if (segundoNumero == 0)
                    return 0;

                return primerNumero / segundoNumero;
        }

        System.out.println("Operador desconocido - " + operador);
        return 0;
    }
}