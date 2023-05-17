import java.util.Arrays;
// Crie um algoritmo que receba 3 números e informe qual o maior entre eles.
public class Maior_ou_Menor {
    public long Numero_Maior_Menor(long numero1,long numero2,long numero3){

        long[] listanumeros;
        long numero_maior = 0;

        listanumeros = new long[]{numero1,numero2,numero3};
        System.out.println("Os numeros digitados foram : " + Arrays.toString(Arrays.stream(listanumeros).toArray()));

        for (Long index : listanumeros) {
            if (index > numero_maior) {
                numero_maior = index;
            }
        }
        System.out.println("O numero maior da lista é : " + numero_maior);

        return numero_maior;
    }
}

