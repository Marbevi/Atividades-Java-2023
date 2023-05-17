/* Crie um algoritmo que leia um número diferente de zero e diga se este número é
        positivo ou negativo.
 */
public class Negativo_ou_Positivo {
    public String Negativo_Positivo(int numero){
        String resposta = "" ;
        if (numero == 0) {
            resposta = "Numero neutro";
        }
        else if (numero <= -1) {
            resposta = "Negativo";
        }
        else {
            resposta = "Positivo";}

        return resposta;
    }
}
