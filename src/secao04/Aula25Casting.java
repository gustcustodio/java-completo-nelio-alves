package secao04;

public class Aula25Casting {
    public static void main(String[] args) {
        // exemplo 1 //
        int a, b;
        double resultado;
        // atribuição //
        a = 5;
        b = 2;
        // casting //
        resultado = (double) a / b;
        System.out.println(resultado);
        // exemplo 2 //
        double x;
        int y;

        x = 5.0;
        y = (int) x;

        System.out.println(y);
    }
}
