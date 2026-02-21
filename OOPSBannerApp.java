public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in an array
        String[] banner = {
                " OOOOO   OOOOO   PPPPP   SSSSS ",
                "O     O O     O  P    P S      ",
                "O     O O     O  PPPPP   SSSSS ",
                "O     O O     O  P            S",
                " OOOOO   OOOOO   P       SSSSS "
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}