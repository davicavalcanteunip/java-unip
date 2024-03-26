import javax.swing.JOptionPane;

public class extras {

    public static void ex01a() {
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                for (int c = 1; c <= 3; c++) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c + "\n");
                }
            }
        }
    }

    public static void ex01b() {
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {
                for (int c = 1; c <= 4; c++) {
                    for (int d = 1; d <= 4; d++) {
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d + "\n");
                    }
                }
            }
        }
    }

    public static void ex01c() {
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                for (int c = 1; c <= 5; c++) {
                    for (int d =1; d <= 5; d++) {
                        for (int e = 1; e <= 5; e++) {
                            System.out.println(a);
                            System.out.println(b);
                            System.out.println(c);
                            System.out.println(d);
                            System.out.println(e + "\n");
                        }
                    }
                }
            }
        }
    }

    public static void ex01d() {
        for (int a = 1; a <= 6; a++) {
            for (int b = 1; b <= 6; b++) {
                for (int c = 1; c <= 6; c++) {
                    for (int d =1; d <= 6; d++) {
                        for (int e = 1; e <= 6; e++) {
                            for (int f = 1; f <= 6; f++) {
                                System.out.println(a);
                                System.out.println(b);
                                System.out.println(c);
                                System.out.println(d);
                                System.out.println(e);
                                System.out.println(f + "\n");
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ex01e() {
        for (int a = 1; a <= 7; a++) {
            for (int b = 1; b <= 7; b++) {
                for (int c = 1; c <= 7; c++) {
                    for (int d =1; d <= 7; d++) {
                        for (int e = 1; e <= 7; e++) {
                            for (int f = 1; f <= 7; f++) {
                                for (int g = 1; g <= 7; g++) {
                                    System.out.println(a);
                                    System.out.println(b);
                                    System.out.println(c);
                                    System.out.println(d);
                                    System.out.println(e);
                                    System.out.println(f);
                                    System.out.println(g + "\n");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void ex01() {
        ex01a();
        ex01b();
        ex01c();
        ex01d();
        ex01e();
    }

    public static void ex02() {
        int valorHora = 18;
        int valorFixoSemana = 50;
        int valorDia = valorHora * 4;
        int valorSemana = (valorDia * 5) + valorFixoSemana;
        System.out.println("O estagiário ganha: " + valorSemana);
    }

    public static void ex03() {
        int fid1 = 220;
        int fid2 = 173;

        int diaria1 = 129;
        int diaria2 = 162;

        String strDiarias = JOptionPane.showInputDialog("Quantas diárias você deseja reservar");
        int diarias = Integer.parseInt(strDiarias);

        float orcamento1 = fid1 + (diarias * diaria1);
        float orcamento2 = fid2 + (diarias * diaria2);
        
        if (orcamento1 < orcamento2) {
            JOptionPane.showMessageDialog(null, "O orçamento 1 ficará mais barato no valor de: " + orcamento1);
        } else if (orcamento1 == orcamento2) {
            JOptionPane.showMessageDialog(null, "Os dois orçamentos saem pelo mesmo valor de: " + orcamento1);
        } else {
            JOptionPane.showMessageDialog(null, "O orçamento 2 ficará mais barato no valor de: " + orcamento2);
        }
    }

    public static void ex04() {
        float valorConta = 134.00f;

        int mes;
        boolean ultrapassou = false;
        float jurosPorMes = 0.03f;

        for (mes = 1; mes <= 40; mes++) {
            valorConta += valorConta * jurosPorMes;

            if (mes == 1) JOptionPane.showMessageDialog(null, "O valor após 1° mês de juros ficará: " + valorConta);

            if (mes == 3) JOptionPane.showMessageDialog(null, "O valor após 3 meses de juros ficará: " + valorConta);

            if (valorConta > 160 && !ultrapassou) {
                JOptionPane.showMessageDialog(null, "O valor ultrapassou os 160 reais no " + mes + "° mês");
                ultrapassou = true;
            }

            if (valorConta >= 268) {
                JOptionPane.showMessageDialog(null, "O valor dobrou no: " + mes + "° mês");
                break;
            }
        }
    }

    public static void ex05() {
        String strNumeroQualquer = JOptionPane.showInputDialog("Digite um número qualquer");

        float numeroQualquer = Float.parseFloat(strNumeroQualquer);

        int multiplica;

        for (multiplica = 2; multiplica <= 5; multiplica++) {
            JOptionPane.showMessageDialog(null, numeroQualquer * multiplica + " esse é um número qualquer multiplicado por: " + multiplica);
        }
    }

    public static void ex06() {
        float valorComDesconto1 = 0;
        float valorComDesconto2 = 0;
        float valorComDesconto3 = 0;
        float valorComDesconto4 = 0;
        float valorComDesconto5 = 0;
        float valorComDesconto6 = 0;

        for (int produtos = 1; produtos <= 6; produtos++) {
            String strValorProduto = JOptionPane.showInputDialog("Digite o valor do " + produtos + "° produto que você deseja comprar");

            float valorProduto = Float.parseFloat(strValorProduto);

            if (produtos == 1) valorComDesconto1 = valorProduto - (valorProduto * 0.03f);
            if (produtos == 2) valorComDesconto2 = valorProduto - (valorProduto * 0.035f);
            if (produtos == 3) valorComDesconto3 = valorProduto - (valorProduto * 0.042f);
            if (produtos == 4) valorComDesconto4 = valorProduto - (valorProduto * 0.0475f);
            if (produtos == 5) valorComDesconto5 = valorProduto - (valorProduto * 0.0512f);
            if (produtos == 6) valorComDesconto6 = valorProduto - (valorProduto * 0.0523f);
        }

        JOptionPane.showMessageDialog(null, "Os valores dos produtos com desconto são: \n" + valorComDesconto1 + "\n" + valorComDesconto2 + "\n" + valorComDesconto3 + "\n" + valorComDesconto4 + "\n" + valorComDesconto5 + "\n" + valorComDesconto6);
    }

    public static void ex07() {
        int ano = 2023;

        while (true) {
            String nome = JOptionPane.showInputDialog("Digite o seu nome ou '0000' para sair: ");
            int verificaSaida = Integer.parseInt(nome);

            if (verificaSaida == 0000) break;

            String strAnoNascimento = JOptionPane.showInputDialog("Digite o ano de nascimento de: " + nome);

            int anoNascimento = Integer.parseInt(strAnoNascimento);

            int idade = ano - anoNascimento;


            if (idade < 18) {
                JOptionPane.showMessageDialog(null, nome + " Tem menos que 18 anos. Tem: " + idade);
            } else if (idade <= 30) {
                JOptionPane.showMessageDialog(null, nome + " Tem 30 ou menos anos. Tem: " + idade);
            } else if (idade < 50) {
                JOptionPane.showMessageDialog(null, nome + " Tem menos que 50 anos. Tem: " + idade);
            } else if (idade < 80) {
                JOptionPane.showMessageDialog(null, nome + " Tem menos que 80 anos. Tem: " + idade);
            } else {
                JOptionPane.showMessageDialog(null, nome + " Tem mais que 80 anos. Tem: " + idade);
            }
        }
    }

    public static void ex08() {
        int numArray[] = new int[9];
        int soma = 0;
        int c;

        for (c = 2; c <= 9; c++) numArray[c - 1] = c;

        for (c = 1; c <= 9; c++) {
            if (c - 1 == 8) break;

            if (c % 2 == 0) {
                soma = soma - numArray[c - 1];
            } else {
                soma = soma + numArray[c - 1];
            }
        }

        JOptionPane.showMessageDialog(null, soma);
    }

    public static void ex09() {
        int[] numArray = new int[10];

        for (int c = 0; c < 10; c++) numArray[c] = c + 1;

        int resultado = 0;

        for (int c = 0; c < 10; c++) {
            if (c % 2 == 0) {
                resultado -= (1 / numArray[c]);
            } else {
                resultado += + (1 / numArray[c]);
            }
        }

        JOptionPane.showMessageDialog(null, "Resultado da operação: " + resultado);
    }

    public static void ex10() {
        int[] numArray = new int[10];

        for (int c = 0; c < 10; c++) numArray[c] = c + 1;

        int resultado = 0;

        for (int c = 0; c < 10; c++) {
            if (c % 2 == 0) {
                resultado -= (c + 1) / numArray[9 - c];
            } else {
                resultado += (c + 1) / numArray[9 - c];
            }
        }

        JOptionPane.showMessageDialog(null, "Resultado da operação: " + resultado);
    }

    public static void ex11() {
        String usuarios[] = new String[2];
        String senhas[] = new String[2];

        for (int c = 0; c < 2; c++) {
            String novoUsuario = JOptionPane.showInputDialog("Digite o seu usuário");
            String novaSenha = JOptionPane.showInputDialog("Digite a sua senha de administrador");
            usuarios[c] = novoUsuario;
            senhas[c] = novaSenha;
        }

        String logar = JOptionPane.showInputDialog("Deseja realizar login: [SIM | NÃO]");

        String usuarioLogin = "";
        String senhaLogin = "";

        if (logar.equals("SIM")) {
            usuarioLogin = JOptionPane.showInputDialog("Digite o seu nome de usuário!");
            senhaLogin = JOptionPane.showInputDialog("Digite a senha");
            for (int c = 0; c < 2; c++) {
                if (usuarios[c].equals(usuarioLogin) && senhas[c].equals(senhaLogin)) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    break;
                }
            }

            JOptionPane.showInputDialog("Usuário ou senha incorreto!");
        }
    }

    public static void main(String[] args) {
        // ex01();
        // ex02();
        ex11();
    }
}
