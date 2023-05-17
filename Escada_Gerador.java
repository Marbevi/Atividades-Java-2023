import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Escada_Gerador {
    public static void main(String[] args) {
        Escada_Gerador teste = new Escada_Gerador();
        teste.Gerador_Degraus();
    }

    public void Gerador_Degraus() {
        Scanner entrada = new Scanner(System.in);
        List<String> total_de_degraus = new ArrayList<>();
        System.out.print("Digite quantos degraus você quer :");
        int quantidade_de_degraus = entrada.nextInt();

        for (int i = 0; i < quantidade_de_degraus; ++i) {
            String espaco_vazio = " ".repeat(quantidade_de_degraus - i);

            total_de_degraus.add(espaco_vazio + "N".repeat(i + 1));
        }

        for (String simbolo_do_degrau : total_de_degraus) {
            System.out.println(simbolo_do_degrau);
        }
    }

}
