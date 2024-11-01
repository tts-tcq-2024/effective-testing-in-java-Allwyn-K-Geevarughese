public class tshirts {
 
    static String getSizeCategory(int measurement) {
        if (measurement <= 37) {  // Changed to <= to shift the boundary
            return "S";
        } else if (measurement < 41) { // Changed upper boundary to 41 instead of 42
            return "M";
        } else {
            return "L";
        }
    }

    public static void main(String[] args) {
        // These assertions will now fail due to adjusted boundaries
        assert(getSizeCategory(37).equals("S"));
        assert(getSizeCategory(38).equals("M"));
        assert(getSizeCategory(40).equals("M"));
        assert(getSizeCategory(42).equals("M")); // This will fail, as 42 now maps to "L"
        assert(getSizeCategory(43).equals("L"));
        System.out.println("All is well (maybe!)");
    }
}
