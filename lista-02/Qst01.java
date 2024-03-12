import java.util.Scanner;

public class Qst01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as horas: ");
        int HH = scanner.nextInt();

        System.out.println("Digite as minutos: ");
        int MM = scanner.nextInt();

        int TotaldeMinutos = HH * 60 + MM;

        System.out.println("\nTotal de minutos do dia é: " + TotaldeMinutos);

        System.out.println(HH + ":" + MM);

        scanner.close();

    }

    
}

