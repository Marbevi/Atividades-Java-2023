import java.util.Arrays;

public class Contar_Palavras_ETC {

    public static void main(String[] args) {
        Contar_Palavras_ETC atual = new Contar_Palavras_ETC();
        atual.Contar_Palavras("Um Dois Três Quatro Cinco ");
        atual.Inverter_Texto("Holla Mundo !! , Hello World !! ");

    }
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    // Contar palavras em um texto comum.
    public void Contar_Palavras(String texto) {

        String palavras = texto;
        int contar_palavras = palavras.split(" ").length;
        System.out.println(contar_palavras);
        String[] palavras_separadas = texto.split(" ");
        System.out.println(Arrays.toString(palavras_separadas));
    }
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    public void Inverter_Texto(String texto) {
        String palavra_invertida = "";

        for (int i = 0; i < texto.length(); i++) {
            palavra_invertida = texto.charAt(i) + palavra_invertida;
        }

        System.out.println("Á palavra invertida fica assim : " + palavra_invertida);
    }
}
