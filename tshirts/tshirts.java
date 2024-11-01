public class tshirts {
    // Determine size by cms
    static String size(int cms) {
        // Simplified conditions for size
        return cms < 38 ? "S" : (cms <= 42 ? "M" : "L");
    }

    public static void main(String[] args) { 
        assert(size(37) == "S");
        assert(size(38) == "M");
        assert(size(40) == "M");
        assert(size(43) == "L");
        assert(size(49) == "L");
        System.out.println("All is well (maybe!)");
    }
}
