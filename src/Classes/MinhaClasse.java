package Classes;
public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = ("Alberto");
        String segundoNome = ("Fernandes Filho");

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

               
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome + (" ") + segundoNome;

        

    }
    
}
