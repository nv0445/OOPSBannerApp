public class BannerApp {

    private static final Map<Character, CharacterPattern> map = new HashMap<>();

    static {
        map.put('O', new CharacterPattern(new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        map.put('P', new CharacterPattern(new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        map.put('S', new CharacterPattern(new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    public static void main(String[] args) {
        printBanner("OOPS");
    }

    private static void printBanner(String text) {
        for (int i = 0; i < 5; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : text.toCharArray()) {
                CharacterPattern cp = map.get(ch);
                if (cp != null)
                    line.append(cp.getPattern()[i]).append("  ");
            }
            System.out.println(line);
        }
    }

    static class CharacterPattern {
        private String[] pattern;

        CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }
}