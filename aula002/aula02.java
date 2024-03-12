import javax.swing.JOptionPane;

public class aula02 {
    
    public static void ex01a() {
        int quantIrmaos = 3;
        if (quantIrmaos >= 2) {
            System.out.println("Você terá um desconto de 10%\n");
        } else {
            System.out.println("Você não terá desconto!\n");
        }
    }

    public static void ex01b() {
        int quantAlunos = 32;
        if (quantAlunos > 30) {
            System.out.println("Passagem para Cancun\n");
        } else if (quantAlunos == 30) {
            System.out.println("Passagem para Fortaleza\n");
        } else {
            System.out.println("Passagem para Caldas Novas\n");
        }
    }

    public static void ex01c() {
        float valorCompra = 637.78f;
        float valorDesconto;
        float valorPagar;
        if (valorCompra > 150) {
            valorDesconto = 0.1f;
            valorPagar = valorCompra - (valorCompra * valorDesconto);
            System.out.println("Você deverá pagar" + valorPagar + "\n");
        } else if (valorCompra == 150) {
            valorDesconto = 0.07f;
            valorPagar = valorCompra - (valorCompra * valorDesconto);
            System.out.println("Você deverá pagar" + valorPagar + "\n");
        } else {
            valorDesconto = 0.04f;
            valorPagar = valorCompra - (valorCompra * valorDesconto);
            System.out.println("Você deverá pagar" + valorPagar + "\n");
        }
    }

    public static void ex01d() {
        int quantPontos = 5;
        if (quantPontos < 5) {
            System.out.println("Apesar da multa você é um bom motorista!\n");
        } else if (quantPontos == 5) {
            System.out.println("Apesar de ser um bom condutor, tome cuidado!\n");
        } else {
            System.out.println("Você é uma pessoa legal, mas preste mais atenção no trânsito!\n");
        }
    }

    public static void ex01e() {
        int quantAmigos = 7;
        if (quantAmigos < 5) {
            System.out.println("Você é uma pessoa tranquila!\n");
        } else if (quantAmigos == 5) {
            System.out.println("Você é uma pessoa normal\n");
        } else {
            System.out.println("TU TA ANIMADO!\n");
        }
    }

    public static void ex02() {
        System.out.println("Java é uma linguagem de programação e plataforma de computação liberada pela primeira vez pela Sun Microsystems em 1995. De um início humilde, ela evoluiu para uma grande participação no mundo digital dos dias atuais, oferecendo a plataforma confiável na qual muitos serviços e aplicativos são desenvolvidos.\n");
    }

    public static void ex03() {
        System.out.println("A estrutura sequencial segue uma lógica top down, ou seja, a execução do programa é feito da primeira linha até a última.\n");
    }

    public static void ex04() {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
        String valor3 = JOptionPane.showInputDialog("Digite o terceiro valor");
        String valor4 = JOptionPane.showInputDialog("Digite o quarto valor");

        float num1 = Float.parseFloat(valor1);
        float num2 = Float.parseFloat(valor2);
        float num3 = Float.parseFloat(valor3);
        float num4 = Float.parseFloat(valor4);

        float media = (num1 + num2 + num3 + num4) / 4;
        JOptionPane.showMessageDialog(null, "A média dos valores é:" + media);
    }

    public static void ex05() {
        System.out.println("Eu estudo no bloco D e farei a prova de LPOO em: DD/MM/AAAA\n");
    }

    public static void ex06() {
        System.out.println("A estrutura condicional passa por um teste lógico para tomada de decisão. Esse teste lógico caso seja verdadeiro irá executar um bloco de comando e caso seja falso executará outro ou não executará nada\n");
    }

    public static void ex07() {
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");
        String endereco = JOptionPane.showInputDialog("Digite o seu endereço");
        String numeroCasa = JOptionPane.showInputDialog("Digite o número da sua casa");
        int numNumeroCasa = Integer.parseInt(numeroCasa);

        if (numNumeroCasa < 65) {
            JOptionPane.showMessageDialog(null, "O morador: " + nome + " do endereço " + endereco + " Pagará o IPTU parcelado em 3 vezes!");
        } else if (numNumeroCasa == 65) {
            JOptionPane.showMessageDialog(null, "O morador: " + nome + " do endereço " + endereco + " Pagará o IPTU parcelado em 2 vezes!");
        } else {
            JOptionPane.showMessageDialog(null, "O morador: " + nome + " do endereço " + endereco + " Pagará o IPTU à vista!");
        }
    }

    public static void ex01() {
        ex01a();
        ex01b();
        ex01c();
        ex01d();
        ex01e();
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
    }
}
