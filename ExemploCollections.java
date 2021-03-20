import java.util.ArrayList;
import java.util.List;

public class ExemploCollections {
    public static void main (String[] args) {
        
        List <String> nomes = new ArrayList<String>();
        String nome1 = "João";
        String nome2 = "Lucas";
        nomes.add(nome1);
        nomes.add(nome2);
        System.out.println(nomes);
    }
}
