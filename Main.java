public class Main {
    public static void main(String[] args) {
        int x=8, y=9;
        Calculadora operate = new Calculadora(x, y);
        System.out.printf("Soma: %d\n", operate.soma());
        System.out.printf("Subtracao: %d\n", operate.subtracao());
        System.out.printf("Divisao: %f\n", operate.divisao());
        System.out.printf("Multiplicacao: %f\n", operate.multiplicacao());
        //operate.imprime();
    }
}
