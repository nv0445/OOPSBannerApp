public class OOPSBannerApp {

    // Static method to generate letter O
    public static String[] getO() {
        return new String[] {
            "  OOOOO  ",
            " O     O ",
            " O     O ",
            " O     O ",
            "  OOOOO  "
        };
    }

    // Static method to generate letter P
    public static String[] getP() {
        return new String[] {
            " PPPPP   ",
            " P    P  ",
            " PPPPP   ",
            " P       ",
            " P       "
        };
    }

    // Static method to generate letter S
    public static String[] getS() {
        return new String[] {
            "  SSSSS  ",
            " S       ",
            "  SSSSS  ",
            "      S  ",
            " SSSSS   "
        };
    }

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        // Loop-based rendering
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}