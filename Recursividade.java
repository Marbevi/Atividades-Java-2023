public class Recursividade {
    public static void main(String[] args) {
        int resultado1 = Somar(10);
        System.out.println(resultado1);

        int resultado2 = Soma(5, 10);
        System.out.println(resultado2);
    }


/*Quando a SOMAR() função é chamada, ela adiciona o parâmetro NUMERO_DE_SOMA à soma de todos os
números menores que NUMERO_DE_SOMA e retorna o resultado. Quando NUMERO_DE_SOMA se torna 0,
 a função retorna apenas 0. Ao executar, o programa segue os seguintes passos:
10 + soma(9)
10 + ( 9 + soma(8) )
10 + ( 9 + ( 8 + soma(7) ) ).........
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + soma(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
 */
    public static int Somar(int numero_de_soma) {
        if (numero_de_soma > 0) {
            return numero_de_soma + Somar(numero_de_soma - 1);
        } else {
            return 0;
        }//Como a função não chama a si mesma quando  NUMERO é 0,
        // o programa para aí e retorna o resultado.
    }

    public static int Soma(int inicio, int fim) {
        if (fim > inicio) {
            return fim + Soma(inicio, fim - 1);
        } else {
            return fim;
        }
    }
}