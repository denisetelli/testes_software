import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Continuidade continuidade = new Continuidade();

        Scanner in = new Scanner(System.in);
        int maxNotas = 2;
        int countNotas = 0;
        double nota = 0.0;
        double tempNota = 0.0;
        int decisao = 1;

        while (countNotas < 2) {
            System.out.println("digite uma nota: ");
            nota = in.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                countNotas++;
                if (countNotas == 1) {
                    tempNota = nota;
                }
                if (countNotas == maxNotas) {
                    calculadora.calculaMedia(tempNota, nota);
                    System.out.println("\nnovo calculo (1-sim 2-nao) ");
                    decisao = in.nextInt();
                    if (continuidade.continua(decisao)) {
                    } else {
                        if (decisao == 1) {
                            countNotas = 0;
                        }
                        if (decisao == 2) {
                            in.close();
                        }
                    }
                }
            }
        }
    }
}
