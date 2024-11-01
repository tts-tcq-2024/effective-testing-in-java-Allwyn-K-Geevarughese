class misaligned {
    public static void main(String[] args) {
        int totalPairs = printColorPairs();

        // Assert that we have the correct total number of color pairs
        assert(totalPairs == 25);

        // Expected color combinations for verification
        String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

        // Display expected combinations based on separate arrays
        for (String major : majorColors) {
            for (String minor : minorColors) {
                System.out.printf("Expected: %s | %s\n", major, minor);
            }
        }

        System.out.println("All is well (maybe!)");
    }

    // Method to print color pairs based on major and minor colors
    static int printColorPairs() {
        String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int pairCount = 0;

        // Generate color combinations from the major and minor color arrays
        for (int i = 0; i < majorColors.length; i++) {
            for (int j = 0; j < minorColors.length; j++) {
                // Display pair with current index, major, and minor colors
                System.out.printf("%d | %s | %s\n", pairCount, majorColors[i], minorColors[j]);
                pairCount++;
            }
        }
        return pairCount; // Return the count of generated pairs
    }
}
