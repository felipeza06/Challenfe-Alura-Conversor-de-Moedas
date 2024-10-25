import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public static void exibeMenu(){
        System.out.println("***********************************************");
        System.out.println("Seja Bem vindo/a ao Conversor de Moedas");
        System.out.println("                                               ");
        System.out.println("1- Dólar ==> Pesos Argentinos");
        System.out.println("2- Pesos Argentinos ==> Dólar");
        System.out.println("3- Dólar ==> Real Brasileiro");
        System.out.println("4- Real Brasileiro ==> Dólar");
        System.out.println("5- Dólar ==> Peso Colombiano");
        System.out.println("6- Peso Colombiano ==> Dólar");
        System.out.println("7- Sair");
    }

    public static void rodaMenu() throws IOException, InterruptedException {

        boolean continuar = true;

        conversorDeMoedas conversorDeMoedas = new conversorDeMoedas();
        Scanner input = new Scanner(System.in);


        while (continuar) {

            Menu.exibeMenu();
            System.out.println("Digite a opção desejada");
            var valor = input.nextLine();

            double opcaoConvertida = Double.parseDouble(valor);

            if (opcaoConvertida == 1) {
                System.out.println("Digite o valor que deseja converter");
                var valor2 = input.nextLine();

                double valorConvertido = Double.parseDouble(valor2);

                Moedas moeda = conversorDeMoedas.converteMoedas("USD");
                System.out.println("Convertendo USD para ARS: " + moeda.getTaxasDeConversao().get("ARS") * valorConvertido);

            } else if (opcaoConvertida == 2) {
                System.out.println("Digite o valor que deseja converter");
                var valor2 = input.nextLine();

                double valorConvertido = Double.parseDouble(valor2);

                Moedas moeda = conversorDeMoedas.converteMoedas("ARS");
                System.out.println("Convertendo ARS para USD: " + moeda.getTaxasDeConversao().get("USD") / valorConvertido);
            } else if (opcaoConvertida == 3) {
                System.out.println("Digite o valor que deseja converter");
                var valor2 = input.nextLine();

                double valorConvertido = Double.parseDouble(valor2);

                Moedas moeda = conversorDeMoedas.converteMoedas("USD");
                System.out.println("Convertendo USD para BRL: " + moeda.getTaxasDeConversao().get("BRL") * valorConvertido);
            } else if (opcaoConvertida == 4) {
                System.out.println("Digite o valor que deseja converter");
                var valor2 = input.nextLine();

                double valorConvertido = Double.parseDouble(valor2);

                Moedas moeda = conversorDeMoedas.converteMoedas("BRL");
                System.out.println("Convertendo BRL para USD: " + moeda.getTaxasDeConversao().get("USD") * valorConvertido);
            } else if (opcaoConvertida == 5) {
                System.out.println("Digite o valor que deseja converter");
                var valor2 = input.nextLine();

                double valorConvertido = Double.parseDouble(valor2);

                Moedas moeda = conversorDeMoedas.converteMoedas("USD");
                System.out.println("Convertendo USD para COP: " + moeda.getTaxasDeConversao().get("COP") * valorConvertido);
            } else if (opcaoConvertida == 6) {
                System.out.println("Digite o valor que deseja converter");
                var valor2 = input.nextLine();

                double valorConvertido = Double.parseDouble(valor2);

                Moedas moeda = conversorDeMoedas.converteMoedas("COP");
                System.out.println("Convertendo COP para USD: " + moeda.getTaxasDeConversao().get("USD") * valorConvertido);
            } else if (opcaoConvertida == 7) {
                continuar = false;
            }

        }
    }
}
