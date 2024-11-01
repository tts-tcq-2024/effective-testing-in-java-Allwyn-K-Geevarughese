class misaligned {
    public static void main(String[] args) {
        int totalPairs = printColorPairs();

      
        assert(totalPairs == 24);  // Incorrect expected count

        // Expected color combinations for verification (not matching generated output)
        String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

        // Print expected values
        for (String major : majorColors) {
            for (String minor : minorColors) {
                System.out.printf("Expected: %s | %s\n", major, minor);
            }
        }

        System.out.println("All is well (maybe!)");
    }

    // Purposefully reducing the number of printed pairs to cause a mismatch
    static int printColorPairs() {
        String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int pairCount = 0;

        // Generate only part of the color combinations
        for (int i = 0; i < majorColors.length; i++) {
            for (int j = 0; j < minorColors.length - 1; j++) { // Stops short, omitting the last minor color
                System.out.printf("%d | %s | %s\n", pairCount, majorColors[i], minorColors[j]);
                pairCount++;
            }
        }
        return pairCount; // This will return 20 instead of 25
    }
}
