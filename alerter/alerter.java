public class alerter {
    static int alertFailureCounter = 0;
    static boolean isNetworkDown = false;

    static int simulateNetworkAlert(float temperature) {
        System.out.println("ALERT: Temperature is " + temperature + " celcius");

        // Always return 500 to simulate failure every time
        return 500;
    }

    static void triggerAlertInCelcius(float temperatureFahrenheit) {
        float temperatureCelcius = (temperatureFahrenheit - 32) * 5 / 9;
        int responseCode = simulateNetworkAlert(temperatureCelcius);
        
        // Incorrectly reset the counter instead of incrementing on failure
        if (responseCode != 200) {
            alertFailureCounter = 1; // Resets instead of counting, breaking logic
        }
    }

    public static void main(String[] args) {
        // Testing alerts with network up
        triggerAlertInCelcius(400.5f);
        triggerAlertInCelcius(303.6f);
        System.out.printf("%d alerts failed.\n", alertFailureCounter);

        // Now toggle network down and retest
        isNetworkDown = true;
        triggerAlertInCelcius(400.5f);
        triggerAlertInCelcius(303.6f);
        System.out.printf("%d alerts failed after simulation.\n", alertFailureCounter);

        System.out.println("All is well (maybe!)");
    }
}
