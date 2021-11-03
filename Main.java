public class Main {
    public static void main(String[] args) {
        int x = 8, y = 9, z = 10;
        Calculadora operate = new Calculadora(x, y, z);
        System.out.printf("Soma: %d\n", operate.soma());
        System.out.printf("Subtracao: %d\n", operate.subtracao());
        System.out.printf("Divisao: %f\n", operate.divisao());
        System.out.printf("Multiplicacao: %f\n", operate.multiplicacao());
        operate.bascara();
        // operate.imprime();
        // rodar o sistema
        // javac Main.java
        // java Main
    }
}
