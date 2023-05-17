public class Atividades_2023 {

    public static void main(String[] args) {

        Elemento_Sem_Par atual = new Elemento_Sem_Par();


        /*
        System.out.println(atual.Elemento_Sozinho(new int[]{7, 9, 3, 9, 5,  3, 9, 3 , 7}));
        System.out.println(atual.Elemento_Sozinho(new int[]{9, 9, 9, 3, 9, 3, 7}));
        System.out.println(atual.Elemento_Sozinho(new int[]{9, 7, 9, 3, 9, 3, 9}));
        System.out.println(atual.Elemento_Sozinho(new int[]{9, 3, 9, 3, 7, 9, 9}));
        System.out.println(atual.Elemento_Sozinho(new int[]{1, 2, 5, 2, 1}));

        */

        //System.out.println(atual.Elemento_So(new int[]{7, 9, 3, 9, 3, 9, 3}));
        //System.out.println(atual.Elemento_So(new int[]{9, 9, 9, 3, 9, 3, 7}));
        //System.out.println(atual.Elemento_So(new int[]{9, 7, 9, 3, 9, 3, 9}));
        //System.out.println(atual.Elemento_So(new int[]{9, 3, 9, 3, 7, 9, 9}));
        //System.out.println(atual.Elemento_So(new int[]{9, 3, 9, 3, 9, 7, 9}));

        /*
        System.out.println(atual.Index_Sem_Par(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(atual.Index_Sem_Par(new int[]{3, 3, 7, 9, 9, 9, 9}));
        System.out.println(atual.Index_Sem_Par(new int[]{7, 3, 9, 3, 9, 9, 9}));
        System.out.println(atual.Index_Sem_Par(new int[]{9, 3, 7, 3, 9, 9, 9}));
        System.out.println(atual.Index_Sem_Par(new int[]{9, 3, 9, 7, 9, 3, 9}));
        System.out.println(atual.Index_Sem_Par(new int[]{1, 2, 5, 2, 1}));
        System.out.println(atual.Index_Sem_Par(new int[]{2, 5, 1, 1, 2}));

         */

        //System.out.println(atual.Ordenar(new int[]{7, 9, 9, 3, 9, 3, 9})); // refeito funciona

        /* usando break corrigido
        System.out.println(atual.Numeros_sem_pares(new int[]{2, 5, 1, 1, 2}));
        System.out.println(atual.Numeros_sem_pares(new int[]{1, 2, 5, 2, 1}));
        System.out.println(atual.Numeros_sem_pares(new int[]{3, 3, 7, 9, 9, 9, 9}));
        System.out.println(atual.Numeros_sem_pares(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(atual.Numeros_sem_pares(new int[]{7, 9, 9, 3, 9, 3, 9}));
        System.out.println(atual.Numeros_sem_pares(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(atual.Numeros_sem_pares(new int[]{9, 9, 9, 3, 9, 3, 7}));

         */

        //atual.Numero_Sem_Par(new int[]{9, 3, 9, 3, 9, 7, 9});
        //atual.Numero_Sem_Par(new int[]{2, 5, 1, 1, 2});

        //atual.Hash_Sozinho(new int[]{9, 3, 9, 10, 3, 9, 7, 9, 7, 9, 9, 3, 3, 8, 8}); // novo 25/04/2023 modelo william
        //atual.Hash_Sozinho(new int[]{9, 3, 9, 3, 9, 7, 9});

        //atual.NumeroSem_Par(new int[]{9, 3, 9, 10, 3, 9, 7, 9, 7, 9, 9, 8, 8});// novo 26/04 modelo  marcelo

        HashMap_Exemplo nova = new HashMap_Exemplo();
        //nova.Valor_Hash(3);
        // nova.Exemplo_Hashset();

        //System.out.println(nova.Nome_cidade(1));


        Divisao_De_Array novo1 = new Divisao_De_Array();
       /*

        novo1.Diferenca_Menor_Valor(new int[]{3, 1, 2, 4, 3}); // resultado = 1
        novo1.Diferenca_Menor_Valor(new int[]{7, 1, 2, 4, 4}); // resultado = 2
        novo1.Diferenca_Menor_Valor(new int[]{9, 1, 2, 4, 5}); // resultado = 1
        novo1.Diferenca_Menor_Valor(new int[]{8, 1, 2, 4, 3}); // resultado = 0

        */
        //novo1.Diferenca_Menor_Valor(new int[]{3, 1, 2, 4, 3, 5}); // resultado = 2


        //novo1.Menor_valor(new int[]{3, 1, 2, 4, 3});// resultado = 1
        //novo1.Menor_valor(new int[]{7, 1, 2, 4, 4});// resultado = 2
        //novo1.Menor_valor(new int[]{9, 1, 2, 4, 5});// resultado = 1
        //novo1.Menor_valor(new int[]{8, 1, 2, 4, 3});// resultado = 0
        //novo1.Menor_valor(new int[]{3, 1, 2, 4, 3, 5});// resultado = 2
        //novo1.Menor_valor(new int[]{3, 1, 2, 4, 3, 5, 4, 6, 2, 7});// resultado = 1

        Frase_Com_Chaves_Fechadas nova1 = new Frase_Com_Chaves_Fechadas();
        //nova1.Frases("A chave { ola mundo } (ola mundo )[ ola mundo  ] está aberta ou fechada { ola mundo } ");
        //nova1.Frases("{}");

        //nova1.Letras(" }{");

        /*nova1.Letras("A frase { ola mundo } (ola mund}{o )[ ola mundo  ] tem algum erro de digitação ? " +
                "{([])} { ola mundo } {} ");*/
        nova1.Letras("{ palavra }");

        /*nova1.Letras("Quando há uma palavra ou frase entre parênteses ( dentro de uma frase )já entre parênteses," +
                " em português e no inglês americano usam-se colchetes ([]); entretanto, parênteses dentro de" +
                " parênteses (()) são usados tanto no inglês britânico quanto em documentos jurídicos " +
                "americanos.Hoje preciso comprar sabão em pó, ração animal e laticínios " +
                "{leite, queijo, iogurte}.Existem regras muito específicas sobre o uso de parênteses nessa " +
                "disciplina; essas regras raramente são alteradas, e a sequência de uso — {[()]}.  " );

         */
        //nova1.EncontraErrosnoTexto("A chave { ola mundo } (ola mundo )[ ola mundo  ] está aberta ou fechada { ola mundo }");
        //nova1.EncontraErrosnoTexto("{}");

        Calcula_Media_Aritimetica calcular_media = new Calcula_Media_Aritimetica();
        //calcular_media.Media_Aritimetica(new int[]{2,2,2});

        Atividade_exemplo atividades_diversas = new Atividade_exemplo();
        //atividades_diversas.Retorna_Numero_Sete(new int[]{2, 5, 4, 8, 7, 10, 9, 12, 15, 62, 7, 14});
        //atividades_diversas.Retorna_Numero_Do_Indice(new int[]{2, 7, 4, 8, 7, 10, 7, 12, 15, 62, 7, 14});
        //atividades_diversas.Ordenacao_De_Array(new int[]{10, 5, 8, 2, 7, 3});
        //atividades_diversas.Ordenacao_Sort(new int[]{10, 5, 8, 2, 7, 3});
        //atividades_diversas.Retorna_True(new int[]{1, 2, 10, 20, 3});
        //atividades_diversas.Diferenca_Absoluta(new int[]{0, -1, 5, 12, -7});
        //atividades_diversas.Ordem_Decrescente(new int[]{10, 5, 2, 8, 3, 9, 1});

    }
}
