public class alerter {
    static int alertFailureCounter = 0;
    static boolean isNetworkDown = false; // Toggle for network simulation

    static int simulateNetworkAlert(float temperature) {
        System.out.println("ALERT: Temperature is " + temperature + " celcius");
        // Return 500 if network is down; otherwise, return 200
        return isNetworkDown ? 500 : 200;
    }

    static void triggerAlertInCelcius(float temperatureFahrenheit) {
        float temperatureCelcius = (temperatureFahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius
        int responseCode = simulateNetworkAlert(temperatureCelcius);
        if (responseCode != 200) {
            alertFailureCounter++; // Increment count on non-OK response
        }
    }

    public static void main(String[] args) {
        // Testing alerts with network up
        triggerAlertInCelcius(400.5f);
        triggerAlertInCelcius(303.6f);
        System.out.printf("%d alerts failed.\n", alertFailureCounter);

        // Toggle network down and retest alerts
        isNetworkDown = true;
        triggerAlertInCelcius(400.5f);
        triggerAlertInCelcius(303.6f);
        System.out.printf("%d alerts failed after simulation.\n", alertFailureCounter);

        System.out.println("All is well (maybe!)");
    }
}
