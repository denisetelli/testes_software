import java.util.Scanner;

public class Continuidade {

    public Continuidade() {
    }

    public boolean continua(int decisao) {
       
        if (decisao < 1 || decisao > 2) {
            Scanner in = new Scanner(System.in);
            System.out.println("\nnovo calculo (1-sim 2-nao) ");
            decisao = in.nextInt();
            continua(decisao);
            return true;
        }   
        return false;      
    }
}
