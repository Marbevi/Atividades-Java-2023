public class Frase_Com_Chaves_Fechadas {
    // "A frase { ola mundo } (ola mundo )[ ola mundo  ] está aberta ou fechada { ola mundo } "
    public boolean Frases(String frase) {
        int conta_chave = 0; int conta_parentese = 0; int conta_colchete = 0;
        boolean resultado = true;
        boolean chave_aberta = false ;
        String caractere;

        for (int i = 0; i < frase.length(); i++) {
            caractere = String.valueOf(frase.charAt(i));

            if (caractere.equals("{")) {
                conta_chave++; chave_aberta = true;
            } else if (caractere.equals("}")) {
                conta_chave--; chave_aberta = false ;
            } else if (caractere.equals("(")) {
                conta_parentese++;chave_aberta = true;
            } else if (caractere.equals(")")) {
                conta_parentese--;chave_aberta = false ;
            } else if (caractere.equals("[")) {
                conta_colchete++;chave_aberta = true;
            } else if (caractere.equals("]")) {
                conta_colchete--;chave_aberta = false ;
            }

            if (conta_chave == 0 && !chave_aberta || conta_colchete == 0 && !chave_aberta || conta_parentese == 0 && !chave_aberta) {
                resultado = true;
            }else {
                resultado = false ;
            }
        }
        if (resultado && conta_chave == 0) {
            System.out.println("Texto Correto");
        }else {
            resultado = false ;
            System.out.println("Erro de digitação");
        }
        System.out.println(resultado);
        System.out.println(conta_chave);
        System.out.println(conta_colchete);
        System.out.println(conta_parentese);
        return resultado;
    }

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//A frase { ola mundo } (ola mundo )[ ola mundo  ] tem algum erro de digitação ? {([])} { ola mundo }
    public boolean Letras(String frase) {
        boolean resposta; boolean chave_aberta = true;
        int contador = 0;
        int espaco = 0 ;

        for (char caracteres : frase.toCharArray()) {

            switch (caracteres) {
                case '{', '(', '[' -> {
                    contador++;
                    chave_aberta = true;
                }
                case '}', ')', ']' -> {
                    contador--;
                    chave_aberta = false;
                }
                case ' ' -> {  espaco = 0 ; }
                case 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s',
                        't','u','w','x','y','z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z' -> {espaco++ ; }
            }

        }

        if (contador == 0 && !chave_aberta && espaco == 0) {
            System.out.println("Texto correto");
            resposta = true;
        } else {
            System.out.println("Erro de digitação");
            resposta = false;
        }
        System.out.println(resposta);
        return resposta;
    }
    //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    public boolean EncontraErrosnoTexto(String frase) {
        boolean resposta; boolean chave_aberta = true;
        int contador = 0;
        String abre_chaves =  "";
        String fecha_chaves = "";
        String auxiliar ;

       for ( int i = 0 ; i < frase.length() ; i++){
           auxiliar = String.valueOf(frase.charAt(i));

       }
        if (contador == 0 && !chave_aberta) {
            System.out.println("Texto correto");
            resposta = true;
        } else {
            System.out.println("Erro de digitação");
            resposta = false;
        }
        return resposta;
    }
}
