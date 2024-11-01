public class misaligned {

    // Prints color map and returns total entries
    static int printColorMap() {
        String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int colorPairCount = 0;

        for (int i = 0; i < majorColors.length; i++) {
            for (int j = 0; j < minorColors.length; j++) {
                System.out.printf("%d | %s | %s\n", colorPairCount++, majorColors[i], minorColors[j]);
            }
        }
        return colorPairCount; // Return actual count
    }

    public static void main(String[] args) { 
        int result = printColorMap();
        // Corrected expected result to match count of color pairs
        assert(result == 25) : "Expected 25 pairs, but got " + result;
        System.out.println("All is well (maybe!)");
    }
}
