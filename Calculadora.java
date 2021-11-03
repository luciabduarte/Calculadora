import static java.lang.Math.*;

public class Calculadora {
    // Atributos
    private int a;
    private int b;
    private int c;
    private double result;

    // Construtor
    Calculadora(int new_a, int new_b, int new_c) {
        this.a = new_a;
        this.b = new_b;
        this.c = new_c;
    }

    // Gets e sets
    public int getA() {
        return this.a;
    }

    public void setA(int new_a) {
        this.a = new_a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int new_b) {
        this.b = new_b;
    }

    public int getC() {
        return this.c;
    }

    public void setC(int new_c) {
        this.c = new_c;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double new_result) {
        this.result = new_result;
    }

    // Metodos: soma, subtracao, multiplicacao, divisao
    // Encapsulamento
    public int soma() {
        int somar = 0;
        somar = this.getA() + this.getB();
        this.setResult(somar);
        // this.result = somar; nao esta respeitando o encapsulamento
        return somar;
    }

    public int subtracao() {
        int subt = 0;
        subt = this.getA() - this.getB();
        this.setResult(subt);
        return subt;
    }

    public float divisao() {
        float div = 0;
        div = this.getA() / this.getB();
        this.setResult(div);
        return div;
    }

    public float multiplicacao() {
        float mult = 0;
        mult = this.getA() * this.getB();
        this.setResult(mult);
        this.imprime();
        return mult;
    }

    public double bascara() {
        double basc_x1 = 0;
        double basc_x2 = 0;
        double basc_d = 0;
        basc_d = (this.getB() * this.getB()) - 4 * this.getA() * this.getC();
        basc_x1 = (-this.getB() + sqrt(basc_d)) / this.getA() * 2;
        basc_x2 = (-this.getB() - sqrt(basc_d)) / this.getA() * 2;
        this.setResult(basc_x2);
        // System.out.printf("a raiz x1 da formula de bascara é %f e a raiz x2 da
        // formula de bascara é %f", basc_x1,
        // basc_x2);
        System.out.println(basc_x1);
        return basc_x2;

    }

    public float resto() {
        float resto = 0;
        resto = this.getA() % this.getB();
        this.setResult(resto);
        this.imprime();
        return resto;
    }

    private void imprime() {
        System.out.printf("A: %d B: %d, Result: %.2f\n", this.a, this.b, this.result);
    }

}
