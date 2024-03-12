import javax.swing.JOptionPane;

public class aula04 {

    public static void ex01() {
        int c;
        int soma = 0;
        for (c = 1278; c >= 1256; c--) {
            soma += c;
        }

        JOptionPane.showMessageDialog(null, soma);
    }

    public static void ex02() {
        int c;
        int quadrado;

        for (c = 10; c <= 1; c--) {
            quadrado = c * c;
            JOptionPane.showMessageDialog(null, quadrado);
        }
    }

    public static void ex03() {
        String strPeriodo = JOptionPane.showInputDialog("Digite o período da aplicação");
        String strValor = JOptionPane.showInputDialog("Digite o valor da aplicação");
        float valor = Float.parseFloat(strValor);
        int periodo = Integer.parseInt(strPeriodo);
        int c;
        float soma = 0;

        for (c = 1; c <= periodo; c++) {
            soma = valor * 0.1f;
            valor += soma;
        }

        JOptionPane.showMessageDialog(null, valor);
    }

    public static void ex04() {
        int c;
        int passo = 2;
        int soma = 0;

        for (c = 160; c <= 190; c += passo) {
            soma += c;
        }

        JOptionPane.showMessageDialog(null, soma);
    }

    public static void ex05() {
        int c;
        float valor = 1000;

        for (c = 2; c <= 10; c++) {
            valor += (valor * 0.02);
        }

        JOptionPane.showMessageDialog(null, valor);
    }

    public static void ex06() {
        int c;
        int cubo = 0;
        int passo = 2;

        for (c = 1; c <= 20; c += passo) {
            cubo = c * c * c;
            JOptionPane.showMessageDialog(null, cubo);
        }
    }

    public static void main(String[] args) {
        ex06();
    }
}