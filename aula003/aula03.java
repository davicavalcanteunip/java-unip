import javax.swing.JOptionPane;

public class aula03 {
    public aula03() {
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
            }
        }
        media = somaNum / contador;
        JOptionPane.showMessageDialog(null, media);
    }

    public static void ex03() {
        String nota1 = JOptionPane.showInputDialog("Digite a sua nota da NP1");
        String nota2 = JOptionPane.showInputDialog("Digita a sua nota da NP2");
        String institucional = JOptionPane.showInputDialog("Digite a sua nota da Institucional");

        float numNota1 = Float.parseFloat(nota1);
        float numNota2 = Float.parseFloat(nota2);
        float numInstitucional = Float.parseFloat(institucional);

        float media = ((numNota1 * 3) + (numInstitucional * 4) + (numNota2 * 3)) / 10;
        float mediaFinal;
        if (media < 7) {
            String notaExame = JOptionPane.showInputDialog("Digite a sua média do exame");
            float numNotaExame = Float.parseFloat(notaExame);
            mediaFinal = (media + numNotaExame) / 2;
            JOptionPane.showMessageDialog(null, mediaFinal);
        }
    }

    public static void ex04() {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String cpf = JOptionPane.showInputDialog("Digite o seu cpf");
        String identidade = JOptionPane.showInputDialog("Digite o número do seu RG");
        String endereco = JOptionPane.showInputDialog("Digite o seu enderço");
        String salario = JOptionPane.showInputDialog("Digite o seu salário");

        float numSalario = Float.parseFloat(salario);
        float aumento = 0;
        int contador = 1;

        while (contador <= 6) {
            aumento = numSalario * 0.07f;
            numSalario = numSalario + aumento;
            contador++;
        }

        JOptionPane.showMessageDialog(null, "NOME:" + nome + "\nCPF:" + cpf + "\nRG:" + identidade + "\nENDERECO:" + endereco + "\nSALÁRIO INICIAL:" + salario + "\nSALÁRIO APÓS AUMENTO DE 7% AO MÊS:" + numSalario);
    }

    public static void ex05() {
        String modeloCarro = JOptionPane.showInputDialog("Digite o modelo do carro dos seus sonhos:");
        String precoVenda = JOptionPane.showInputDialog("Digite o preço de venda desse carro:");
        float numPrecoVenda = Float.parseFloat(precoVenda);

        float precoParcelas = (numPrecoVenda / 48);
        float precoParcelasJuros = precoParcelas + (precoParcelas * 0.15f);
        float precoFinalParcelado = precoParcelasJuros * 48;
        float diferencaPreco = precoFinalParcelado - numPrecoVenda;
        
        JOptionPane.showMessageDialog(null, 
        "O modelo do carro é: " + modeloCarro + "\n" +
        "O preço a vista é: " + precoVenda + "\n" +
        "O preço final com juros é: " + precoFinalParcelado + "\n" +
        "A diferença entre o preço a vista e o preço final é de: " + diferencaPreco);
    }

    public static void main(String[] args) {
        ex05();
    }
}
