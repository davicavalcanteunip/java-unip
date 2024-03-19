public class aula01 {

    public static void ex01() {
        System.out.println("Davi\n25/02/2005\nRua São João, 950\nGoiânia\n");
    }

    public static void ex02() {
        int somaIdades = 31 + 27 + 35 + 23 + 22;
        System.out.println("João: 31, Pedro: 27, Lucas: 35, Rodolfo: 23, Marina: 22");
        System.out.println("A soma das idades é:" + somaIdades + '\n');
    }

    public static void ex03() {
        float valorReal = 3657.38f;
        float cotacaoDolar = 2.35f;
        float valorDolar = valorReal * cotacaoDolar;
        System.out.println("O valor em dólar é:" + valorDolar);
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
    }
}