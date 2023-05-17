/*5. Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse número e
        mostra o resultado.
        // Para calcular o fatorial de um número, basta encontrar o produto da multiplicação feita
        // entre esse número e os seus antecessores maiores que zero.
        // exemplo fatorial de 6 é : 6 * 5 * 4 * 3 * 2 * 1 = 720
        */
public class Calcular_fatorial {
    public int Calcular_Fatorial(int fatorial ) {

        int resultado = 1;

        for (int i = 1; i <= fatorial; i++) {
            resultado = i * resultado;
        }
        System.out.println("O fatorial de " + fatorial + " é : " + resultado);

        return resultado;
    }
}