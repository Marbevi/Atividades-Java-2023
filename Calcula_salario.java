

//5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$1320,00)
public class Calcula_salario {
    int resultado;
    public float Calcula_Salario(float salario_minimo , float salario_usuario) {

        resultado = (int) (salario_usuario / salario_minimo);
        if (resultado >= 1) {
            return resultado;
        }
        return resultado;
    }
}
