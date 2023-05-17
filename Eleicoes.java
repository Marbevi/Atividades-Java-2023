
/* 8. Escreva um algoritmo para ler o número total de eleitores de um município, o número
        de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
        representa em relação ao total de eleitores. */
public class Eleicoes {

    public float Percentual_Eleicoes(float total_eleitores,float votos_brancos,float votos_nulos){
        float votos_validos;

        votos_validos = total_eleitores - votos_brancos - votos_nulos;
        votos_validos = (votos_validos / total_eleitores) * 100 ;
        votos_brancos = (votos_brancos / total_eleitores) * 100;
        votos_nulos = (votos_nulos / total_eleitores) * 100;
        System.out.println("O Total de Votos validos foram " + votos_validos);
        System.out.println("À porcentagem de votos válidos  é : " + votos_validos + "%");
        System.out.println("À porcentagem de votos brancos é : " + votos_brancos + "%");
        System.out.println("À porcentagem de votos nulos é : " + votos_nulos + "%");
        return votos_validos;
    }

}
