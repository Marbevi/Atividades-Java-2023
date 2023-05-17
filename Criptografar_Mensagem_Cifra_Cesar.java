import java.util.Scanner;
public class Criptografar_Mensagem_Cifra_Cesar {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Digite uma mensagem: ");
            String mensagem = input.nextLine();

            System.out.print("Digite a chave de criptografia (deslocamento): ");
            int chave = input.nextInt();

            String mensagemCriptografada = criptografar(mensagem, chave);
            System.out.println("Mensagem criptografada: " + mensagemCriptografada);
        }

        public static String criptografar(String mensagem, int chave) {
            String mensagemCriptografada = "";
            for (int i = 0; i < mensagem.length(); i++) {
                char caractere = mensagem.charAt(i);
                if (caractere >= 'a' && caractere <= 'z') {
                    caractere = (char) (caractere + chave);
                    if (caractere > 'z') {
                        caractere = (char) (caractere - 26);
                    }
                } else if (caractere >= 'A' && caractere <= 'Z') {
                    caractere = (char) (caractere + chave);
                    if (caractere > 'Z') {
                        caractere = (char) (caractere - 26);
                    }
                }
                mensagemCriptografada += caractere;
            }
            return mensagemCriptografada;
        }
    }
