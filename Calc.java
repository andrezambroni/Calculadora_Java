
import java.util.Scanner;

public class Calc {

    static public void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Num n1 = new Num();
        Num n2 = new Num();
        Num res = new Num();
        String opc = "s";

        while ("s".equals(opc) || "S".equals(opc)) {
            System.out.printf("%nDigite o valor 1: ");
            n1.setValor(scan.nextInt());

            System.out.printf("%nDigite o valor 2: ");
            n2.setValor(scan.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.err.printf("%nA some de %d com %d eh igual a %d", n1.getValor(), n2.getValor(), res.getValor());

            System.err.printf("%nDeseja soma outro valor?");
            opc=scan.next();
            System.out.printf("%n %n %n  ");

        }
    }

}