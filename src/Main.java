import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as seguintes informações do carro...");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        Carro meuCarro = new Carro(marca, modelo, ano);

        meuCarro.exibirInformacoes();
    }
}