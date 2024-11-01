public class tshirts {

    // Determine shirt size based on cms
    static String size(int cms) {
        return (cms < 38) ? "S" : (cms <= 42 ? "M" : "L");
    }

    public static void main(String[] args) { 
        // Modified test cases to check size accurately
        assert(size(37) == "S");
        assert(size(50) == "L");
        assert(size(38) == "M");
        assert(size(40) == "M");
        assert(size(43) == "L");
        System.out.println("All is well (maybe!)");
    }
}
