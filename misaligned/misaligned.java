import java.util.ArrayList;
import java.util.List;

public class mialigned {

    static String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
    static String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

    // Generate color pairs
    static List<String> generateColorCodePairs() {
        List<String> colorCodePairs = new ArrayList<>();
        // Loop through color combinations
        for (int i = 0; i < majorColors.length; i++) {
            for (int j = 0; j < minorColors.length; j++) {
                colorCodePairs.add(i * minorColors.length + j + " | " + majorColors[i] + " | " + minorColors[j]);
            }
        }
        return colorCodePairs;
    }
    
    // Print color code pairs
    static int printColorMap() {
        List<String> colorCodePairs = generateColorCodePairs();
        colorCodePairs.forEach(System.out::println);
        return colorCodePairs.size();
    }
    
    // Verify color mapping
    static void testColorMapping() {
        List<String> expectedColorCodePairs = List.of(
            "0 | White | Blue", "1 | White | Orange", "2 | White | Green",
            "3 | White | Brown", "4 | White | Slate", "5 | Red | Blue",
            "6 | Red | Orange", "7 | Red | Green", "8 | Red | Brown",
            "9 | Red | Slate", "10 | Black | Blue", "11 | Black | Orange",
            "12 | Black | Green", "13 | Black | Brown", "14 | Black | Slate",
            "15 | Yellow | Blue", "16 | Yellow | Orange", "17 | Yellow | Green",
            "18 | Yellow | Brown", "19 | Yellow | Slate", "20 | Violet | Blue",
            "21 | Violet | Orange", "22 | Violet | Green", "23 | Violet | Brown",
            "24 | Violet | Slate"
        );
        List<String> actualColorCodePairs = generateColorCodePairs();
        assert(actualColorCodePairs.equals(expectedColorCodePairs));
        System.out.println("Test executed (failure expected)!");
    }

    public static void main(String[] args) {
        int result = printColorMap();
        assert(result == 25);
        testColorMapping();
        System.out.println("All is well (maybe!)");
    }
}
