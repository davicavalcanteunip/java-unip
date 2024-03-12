import javax.swing.JOptionPane;

public class aula05 {
    
    public static void ex01() {
        String cursos[] = {"Ciência da Computação", "Odontologia", "Engenharia Civil", "Nutrição"};

        for (int c = 0; c < cursos.length; c++) {
            JOptionPane.showMessageDialog(null, cursos[c]);
        }
    }

    public static void ex02() {
        String nomes[] = new String[10];
        String cpfs[] = new String[10];
        float notas1[] = new float[10];
        float notas2[] = new float[10];
        float medias[] = new float[10];

        for (int c = 0; c < 10; c++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            String cpf = JOptionPane.showInputDialog("Digite o cpf do aluno");
            String nota1 = JOptionPane.showInputDialog("Digite a primeira nota");
            String nota2 = JOptionPane.showInputDialog("Digite a segunda nota");

            float numNota1 = Float.parseFloat(nota1);
            float numNota2 = Float.parseFloat(nota2);

            nomes[c] = nome;
            cpfs[c] = cpf;
            notas1[c] = numNota1;
            notas2[c] = numNota2;
            medias[c] = (numNota1 + numNota2) / 2;
        }

        for (int c = 0; c < 10; c++) {
            if (c == 1) {
                JOptionPane.showMessageDialog(null, medias[c]);
            }

            if (c == 3) {
                JOptionPane.showMessageDialog(null, nomes[c]);
            }

            if (c == 6) {
                JOptionPane.showMessageDialog(null, cpfs[c]);
            }
        }
    }

    public static void main(String[] args) {
        ex02();
    }
}