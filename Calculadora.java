

import java.util.Scanner;

class Calculadora {
  private int num1;
  private int num2;
  private int total;

  public Calculadora(){
    
  }
  
  Scanner ler = new Scanner(System.in);

  public void soma(){
    Scanner n = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    int total;
    
    System.out.println("Calculadora soma\n\nInsira o 1º número: ");
    calc.setNum1(n.nextInt());
    System.out.println("Insira o 2º número: ");
    calc.setNum2(n.nextInt());
    total = calc.getNum1() + calc.getNum2();
    System.out.println("A soma dos números é "+ total);

  }

public int getNum1() {
	return num1;
}

public void setNum1(int num1) {
	this.num1 = num1;
}

public int getNum2() {
	return num2;
}

public void setNum2(int num2) {
	this.num2 = num2;
}

public int getTotal() {
	return total;
}

public void setTotal(int total) {
	this.total = total;
}
  

}
/*
git config --global user.name "Miguel Faria"
git config --global user.email miguelcontacto2015@gmail.com
*/