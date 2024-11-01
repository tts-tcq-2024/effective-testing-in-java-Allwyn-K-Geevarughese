class misaligned {
    public static void main(String[] args) {
        int combinationsCount = generateColorPairs();

        // Check that the expected number of color combinations is met
        assert(combinationsCount == 25);

        // Expected color pairs for cross-verification
        String[][] colorPairReference = {
            {"White", "Blue"}, {"White", "Orange"}, {"White", "Green"}, {"White", "Brown"}, {"White", "Slate"},
            {"Red", "Blue"}, {"Red", "Orange"}, {"Red", "Green"}, {"Red", "Brown"}, {"Red", "Slate"},
            {"Black", "Blue"}, {"Black", "Orange"}, {"Black", "Green"}, {"Black", "Brown"}, {"Black", "Slate"},
            {"Yellow", "Blue"}, {"Yellow", "Orange"}, {"Yellow", "Green"}, {"Yellow", "Brown"}, {"Yellow", "Slate"},
            {"Violet", "Blue"}, {"Violet", "Orange"}, {"Violet", "Green"}, {"Violet", "Brown"}, {"Violet", "Slate"}
        };

        // Display each expected color combination for reference
        for (String[] pair : colorPairReference) {
            System.out.printf("Expected: %s | %s\n", pair[0], pair[1]);
        }

        System.out.println("All is well (maybe!)");
    }

    // Method to print color pairs and return the count of pairs
    static int generateColorPairs() {
        String[] mainColors = {"White", "Red", "Black", "Yellow", "Violet"};
        String[] accentColors = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int pairIndex = 0;

        // Display each color pair with unique index
        for (String main : mainColors) {
            for (String accent : accentColors) {
                System.out.printf("%d | %s | %s\n", pairIndex, main, accent);
                pairIndex++;
            }
        }
        return pairIndex;
    }
}
