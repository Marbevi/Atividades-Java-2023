import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Exemplo {
    String resposta_positiva = "Encontrado a combinação de texto";
    String resposta_negativa = "Não Encontrado a combinação de texto ";
    String resposta = "" ;
    // REGEX significa expressões regulares
    // As expressões regulares podem ser usadas para executar todos
    // os tipos de pesquisa de texto e operações de substituição de texto
    public String Exemplo_Regex(){
        //Pattern Classe - Define um padrão (para ser usado em uma pesquisa)
        //Matcher Classe - Usado para procurar o padrão
        //PatternSyntaxException Classe - Indica erro de sintaxe em um padrão de expressão regular

        Pattern pattern = Pattern.compile("Olá Mundo !", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Começando um programa digite Olá Mundo !");
        boolean matchFound = matcher.find();
        if(matchFound) {
           resposta = resposta_positiva ;

        } else {
            resposta = resposta_negativa ;
        }
        System.out.println(resposta);

        return resposta ;

        //Neste exemplo, a palavra "Olá Mundo !" está sendo procurada em uma frase.

        //Primeiro, o padrão é criado usando o Pattern.compile()método.
        // O primeiro parâmetro indica qual padrão está sendo pesquisado
        // e o segundo parâmetro tem um sinalizador para indicar que a pesquisa não
        // deve diferenciar maiúsculas de minúsculas. O segundo parâmetro é opcional.

        //O matcher()método é usado para procurar o padrão em uma string.
        // Ele retorna um objeto Matcher que contém informações sobre a pesquisa realizada.

        //O find()método retorna true se o padrão foi encontrado na string e false se
        // não foi encontrado.
    }
}
