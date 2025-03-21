public class MainApp
{
    public static void main(String[] args)
    {
        if (args.length != 3)
        {
            System.out.println("Uso incorrecto. Debes proporcionar dos números y una operación.");
            System.out.println("Ejemplo: java MainApp 5 + 3");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        String operacion = args[1];
        int num2 = Integer.parseInt(args[2]);

        int resultado = 0;

        // Sentencia de control
        switch (operacion)
        {
            case "+":
                resultado = Calculadora.sumar(num1, num2);
                break;
            case "-":
                resultado = Calculadora.restar(num1, num2);
                break;
            case "x":
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case "/":
                resultado = Calculadora.dividir(num1, num2);
                break;
            default:
                System.err.println("Operación no válida. Las operaciones válidas son +, -, *, y /.");
                return;
        }

        System.out.println("Resultado: "+ resultado);
    }
}
