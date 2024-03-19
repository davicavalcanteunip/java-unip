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

        int diaria1;
        int diaria2;
    }

    public static void main(String[] args) {
        // ex01();
        ex02();
    }
}
