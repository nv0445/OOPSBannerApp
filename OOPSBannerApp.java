public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store all banner lines in an array
        String[] banner = {

                String.join(" ",
                        " *****  ",
                        " *****  ",
                        " *****  ",
                        " *****  "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*      "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        " *****  ",
                        " *****  "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*       ",
                        "      * "),

                String.join(" ",
                        "*     * ",
                        "*     * ",
                        "*       ",
                        "      * "),

                String.join(" ",
                        " *****  ",
                        " *****  ",
                        "*       ",
                        " *****  ")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
