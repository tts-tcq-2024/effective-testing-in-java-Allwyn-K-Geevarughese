public class TShirts {
    static String size(int cms) {
        if (cms < 38) {
            return "S"; // Small size for measurements less than 38 cm
        } else if (cms >= 38 && cms < 42) { // Medium size for measurements 38 to 41 cm
            return "M";
        } else {
            return "L"; // Large size for measurements 42 cm or above
        }
    }

    public static void main(String[] args) {
        // Test cases for size determination
        assert(size(37).equals("S"));
        assert(size(38).equals("M"));
        assert(size(40).equals("M"));
        assert(size(42).equals("L")); // Corrected: 42 should return "L"
        assert(size(43).equals("L"));
        System.out.println("All is well (maybe!)");
    }
}
