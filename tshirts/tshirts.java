public class tshirts {
    static String size(int cms) {
        if (cms < 38) {
            return "S";
        } else if (cms >= 38 && cms < 42) { // Adjusted to include 38 in "M"
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) { 
        assert(size(37).equals("S"));
        assert(size(38).equals("M"));
        assert(size(40).equals("M"));
        assert(size(42).equals("M")); // Added test for 42 to ensure it's "M"
        assert(size(43).equals("L"));
        System.out.println("All is well (maybe!)");
    }
}
