public class Usando_Switch_Case {
    public void Dia_da_Semana(int numero) {

        switch (numero) {
            case 1 -> System.out.println("É Domingo");
            case 7 -> System.out.println("É Sábado");
            case 2, 3, 4, 5, 6 -> System.out.println(" é um dia da semana");
            default -> System.out.println("Numero não permitido , digite um numero entre 1 e 7");
        }
    }

    public void Vogal_ou_Consoante(String palavra) {
        String[] array_letras = palavra.split("");

        for (int i = 0; i < array_letras.length; i++) {
            switch (array_letras[i]) {
                case "a", "A", "e", "E", "i", "I", "o", "O", "u", "U" -> System.out.println("vogal");
                default -> System.out.println("Consoante");

            }
        }
    }

    public void Contar_String(String numeros) {
        String[] array = numeros.split("");
        int contar_0 = 0;
        int contar_1 = 0;

        for (int i = 0; i < array.length; i++) {

            switch (array[i]) {
                case "1":
                    contar_1++;
                    break;
                case "0":
                    contar_0++;
                    break;
            }
        }
        System.out.println("temos " + contar_1 + " numeros 1 e " + contar_0 + " numeros 0");
    }

    public String Transformar_Num_em_Binario(int numero) {
        String transformar = Integer.toBinaryString(numero);
        System.out.println("O número : " + numero + " transformado em número binário é: " + transformar);

        return transformar;
    }

    public void Contar_Binario(int numeros) {

        String numero_em_binario = Integer.toBinaryString(numeros);
        int contar_0 = 0, contar_1 = 0, auxiliar = 0;
        boolean liga_desliga = false;

        for (int i = 0; i < numero_em_binario.length(); i++) {
            if (numero_em_binario.charAt(i) == '1') {

            }

        }
        System.out.println("O numero " + numeros + " em binário é : " + numero_em_binario);
        System.out.println("O maior numero de zeros entre os numeros 1 no binario "
                + numero_em_binario + " é: " + auxiliar + " numeros zeros");
    }

    public int Contar_Binario_Meu_Codigo(int numeros) {

        String numero_em_binario = Integer.toBinaryString(numeros);// trasnforma um numero inteiro para binario em string
        int count = 0, resultado = 0;

        for (int i = 0; i < numero_em_binario.length(); i++) {
            if (numero_em_binario.charAt(i) == '1') {
                if (count > resultado) {
                    resultado = count;
                }
                count = 0;
            } else {
                count++;
            }
        }
        System.out.println("O numero " + numeros + " em binário é : " + numero_em_binario);
        System.out.println("O maior numero de zeros entre os numeros 1 no binario "
                + numero_em_binario + " é: " + resultado + " numeros zeros");
        return resultado;
    }

//  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX      CODIGO ABAIXO DA INTERNET 19/03/2023    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    public int Contar_Zeros_Binario(int numero) {

        String convert_numero = Integer.toBinaryString(numero);
        int contar_zeros = 0;
        int auxiliar = 0;
        boolean ligado = false;

        for (int i = 0; i < convert_numero.length(); i++) {
            if (convert_numero.charAt(i) == '1') {
                if (ligado && auxiliar > contar_zeros) {
                    contar_zeros = auxiliar;
                }
                auxiliar = 0;
                ligado = true;
            } else {
                if (ligado) {
                    auxiliar++;
                }
            }
        }
        System.out.println("O numero " + numero + " em binário é : " + convert_numero);
        System.out.println("Entre numeros 1 contem " + contar_zeros + " zeros");
        return contar_zeros;
    }
}
        
