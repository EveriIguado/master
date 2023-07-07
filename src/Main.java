import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static List<Integer> listaFinal(List<Integer> lista1, List<Integer> lista2) {
            return Stream.concat(
                            lista1.stream().filter(num -> !lista2.contains(num)),
                            lista2.stream().filter(num -> !lista1.contains(num))
                    )
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
        }

    public static void main(String[] args) {
        List<Integer>  lista1 = Arrays.asList(3,1,7,6,4,9);
        List<Integer>  lista2 = Arrays.asList(13,1,7,19,4,2,3,6);
        listaFinal(lista1,lista2).forEach(System.out::println);
    }
}