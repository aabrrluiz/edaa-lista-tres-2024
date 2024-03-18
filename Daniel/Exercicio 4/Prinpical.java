import java.util.Scanner;

public class Prinpical {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ordenador ordenador = new Ordenador();
    Util util = new Util();

    System.out.println("Digite a quantidade de nome: ");
    int quantidade = scanner.nextInt();
    scanner.nextLine();

    String[] nomes = new String[quantidade];

    for (int n = 0; n < quantidade; n++){
        System.out.println("Digite o " + (n+1) + "° " + "nome:");
     nomes[n] = scanner.nextLine();
    }


    ordenador.selectionSort(nomes);

    System.out.println("\nNomes ordenados pelo tamanho:");
    util.imprimirArrayNomesOrdenados(nomes);
    
    scanner.close();

}
}