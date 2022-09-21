package strings;
public class Strings {
    public static void main(String[] args) {
        //Mauisculas e minusculas
        
        String texto = "TEXTO TESTE     ";
        
        String minuscula = texto.toLowerCase();
        System.out.println(minuscula+"-");
        
        String maiuscula = minuscula.toUpperCase();
        System.out.println(maiuscula+"-");
        
        //Elimina o espacamento em branco da String
        String espaco = texto.trim();
        System.out.println(espaco+"-");
        
        //Inicia a String a partir da (2°) posição
        String selecao = texto.substring(2);
        System.out.println(selecao);
        
        String selecao2 = texto.substring(2, 7);
        System.out.println(selecao2);
        
        String trocar = texto.replace("E", "a");
        System.out.println(trocar);
        
        int posicao = texto.indexOf("TE");
        int posicao2 = texto.lastIndexOf("TE");
        System.out.println(posicao);
        System.out.println(posicao2);
        
        String nome = "Higor Zenaide Almeida";
        String[] vec = nome.split(" ");
        System.out.println(vec[0]);
        System.out.println(vec[1]);
        System.out.println(vec[3]);
                
    }
    
}
