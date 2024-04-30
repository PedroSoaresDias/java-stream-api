import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "C", "C++", "C#", "JavaScript", "Python", "Go", "Rust",
        "Ruby", "TypeScript", "ASP.NET", "Spring", "Flask", "Django", "Node.JS", "Express.JS", "Ruby n' Rails", "Docker", "Bun", "Deno");
        
        Predicate<String> maisCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream().filter(maisCincoCaracteres).forEach(System.out::println);
    }
}
