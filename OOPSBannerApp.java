import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    private static final Map<Character, String[]> patterns = new HashMap<>();

    static {
        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {
        render("OOPS");
    }

    public static void render(String word) {
        word = word.toUpperCase();

        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = patterns.get(ch);
                System.out.print(pattern != null ? pattern[row] + "  " : "     ");
            }
            System.out.println();
        }
    }
}