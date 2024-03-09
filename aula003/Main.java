package aulas.aula003;
import javax.swing.JOptionPane;

public class Main {
    public Main() {
    }

    public static void ex01() {
        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
        String quantProdutos = JOptionPane.showInputDialog("Digite a quantidade de produtos comprados");
        String valorProduto = JOptionPane.showInputDialog("Digite o valor do produto");

        int numQuantProdutos = Integer.parseInt(quantProdutos);
        float numValorProdutos = Float.parseFloat(valorProduto);
        float valorCompra = numValorProdutos * numQuantProdutos;

        JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + " Valor do produto: " + numValorProdutos + " Quantidade de produtos: " + quantProdutos + " Valor da compra: " + valorCompra);
    }

    public static void ex02() {
        int contador = 0;
        float currentNumber = 0;
        float somaNum = 0;
        float media = 0;
        while (currentNumber != 9999) {
            String num = JOptionPane.showInputDialog("Digite um número para somar ou 9999 para sair");
            currentNumber = Float.parseFloat(num);
            if (currentNumber != 9999) {
                contador++;
                somaNum = somaNum + currentNumber;
                media = somaNum / contador;   
            }
        } 
    }

    public static void main() {
        ex02();
    }
}
