import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // AULA 01/06 (CONCEITOS DE HERANÇA)
    // Pessoa p = new Pessoa();
    // p.nome = "yan";

    // //COMISSAO NÃO EXISTE EM PESSOA, MAS SIM EM VENDEDOR
    // //p.comissao = 8.6;

    // //VENDEDOR HERDA NOME DA CLASSE PESSOA, MESMO NAO TENDO NA CLASSE VENDEDOR
    // Vendedor v = new Vendedor();
    // v.nome = "Lais";
    // v.comissao = 8.6;

    // AULA 02/06 (COMPOSIÇÃO)
    // Pedido p = new Pedido();

    // AULA 03/06 (CLASSES ABSTRATAS)
    // Conta cp = new Poupanca();
    // cp.setSaldo(5000);
    // cp.imprimeExtrato();

    // AULA 04/06 (INTERFACES)
    // Conta2 cp2 = new Poupanca2();
    // cp2.depositar(700);
    // cp2.sacar(300);
    // cp2.getSaldo();

    // AULA 05/06 (TRATAMENTO DE EXCEÇÕES)
    // Scanner s = new Scanner(System.in);
    // try {
    //   System.out.println("Digite um valor: ");
    //   int n1 = s.nextInt();

    //   System.out.println(n1);
    // } catch (Exception ex) {
    //   System.out.println("ERRO -  Valor não é um numero.");
    // }

    // AULA 06/06 (EXEMPLO PRÁTICO COM HERANÇA)
    Cachorro c = new Cachorro();
    c.setNome("Bidu");
    Gato g = new Gato();
    g.setNome("Lola");

    c.mostrar();
    g.mostrar();

    
    
  }
}