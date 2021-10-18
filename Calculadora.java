public class Calculadora {
  //Atributos
  private int a;
  private int b;
  private float result;
  
  //Construtor
  Calculadora(int new_a, int new_b){
      this.a = new_a;
      this.b = new_b;
  }
  //Gets e sets
  public int getA(){
      return this.a;
  }
  public void setA(int new_a){
      this.a = new_a;
  }
  
  public int getB(){
      return this.b;
  }
  public void setB(int new_b){
      this.b = new_b;
  }
  
  public float getResult(){
      return this.result;
  }
  public void setResult(float new_result){
      this.result = new_result;
  }
  
  //Metodos: soma, subtracao, multiplicacao, divisao
  //Encapsulamento
  public int soma(){
      int somar = 0;
      somar = this.getA() + this.getB();
      this.setResult(somar);
      //this.result = somar; nao esta respeitando o encapsulamento
      return somar;
  }
  
  public int subtracao(){
      int subt = 0;
      subt = this.getA() - this.getB();
      this.setResult(subt);
      return subt;
  }
  
  public float divisao(){
      float div = 0;
      div = this.getA() /  this.getB();
      this.setResult(div);
      return div;
  }
  
  public float multiplicacao(){
      float mult = 0;
      mult = this.getA() * this.getB();
      this.setResult(mult);
      this.imprime();
      return mult;
  }
  
  private void imprime(){
      System.out.printf("A: %d B: %d, Result: %.2f\n", this.a, this.b, this.result);
  }
  
}
