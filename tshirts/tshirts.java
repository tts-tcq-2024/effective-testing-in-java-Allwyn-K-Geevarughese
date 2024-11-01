public class tshirts {
    // Determine T-shirt size based on chest measurement
    static String getSizeCategory(int measurement) {
        if (measurement < 38) {
            return "S"; // Return 'S' for measurements below 38 cm
        } else if (measurement < 42) {
            return "M"; // Return 'M' for measurements between 38 and 41 cm
        } else {
            return "L"; // Return 'L' for measurements 42 cm or more
        }
    }

    public static void main(String[] args) {
        // Verify the T-shirt size categories with various inputs
        assert(getSizeCategory(37).equals("S"));
        assert(getSizeCategory(38).equals("M"));
        assert(getSizeCategory(40).equals("M"));
        assert(getSizeCategory(42).equals("L"));
        assert(getSizeCategory(43).equals("L"));
        System.out.println("All is well (maybe!)");
    }
}
