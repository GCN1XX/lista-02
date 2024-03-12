import java.util.Scanner;

public class Questão1 {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double valorPago;
        double troco;
        int QntCaneta;
        double valorUnidade;
        
        System.out.print("\nQuantidade de canetas: ");
        QntCaneta = scanner.nextInt();

        System.out.print("\nValor da nota usado no pagamento: ");
        valorPago = scanner.nextInt();

        System.out.print("Troco recebido: ");
        troco = scanner.nextInt();

        System.out.println("\n\nO valor de cada caneta em reais: ");
        scanner.close();
        valorUnidade = (valorPago - troco)/QntCaneta;

        System.out.println("Cada caneta custa: " + valorUnidade);



    }
}