import java.util.*;

public class ExchangingCards {
    static String str;
    static Scanner teclado = new Scanner(System.in);
    static int numeroCartasA;
    static int numeroCartasB;
    public static void main(String[] args) {
        while (true) {
            defineQtdCartas();
            if(numeroCartasA == 0 && numeroCartasB == 0) {
                break;
            }
            Set<String> cartasA = defineCartas("Alice");
            Set<String> cartasB = defineCartas("Betty");

            Set<String> auxiliar;
            if (cartasA.size() < cartasB.size()){
                auxiliar = cartasA;
                cartasA = cartasB;
            } else {
                auxiliar = cartasB;
            }

            int count = 0;
            for (String x : auxiliar){
                if (!cartasA.contains(x)) count++;
            }
            System.out.printf("%d cartas serão trocadas entre as jogadoras",count);
        }
    }
    public static void defineQtdCartas(){
        System.out.println();
        System.out.println("Quando for desejado sair do programa, escrever: SAIR");
        System.out.println("Escreva a quantidade de cartas de cada pessoa");
        str = teclado.nextLine();
        if(str.equalsIgnoreCase("SAIR")){
            System.exit(0);
        }
        List<String> itens = Arrays.asList(str.split("\\s* \\s*"));
        numeroCartasA = Integer.parseInt(itens.get(0));
        numeroCartasB = Integer.parseInt(itens.get(1));
    }

    public static HashSet defineCartas(String pessoa) {
        System.out.printf("Escreva as cartas de: %s",pessoa);
        System.out.println();
        str = teclado.nextLine();
        return new HashSet(Arrays.asList(str.split("\\s* \\s*")));
    }

}