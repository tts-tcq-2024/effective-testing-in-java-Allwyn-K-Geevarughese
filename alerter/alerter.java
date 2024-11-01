public class alerter {
    static int alertFailureCount = 0;

    // Simulates network alert
    static int networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        // Return 500 if temperature is too high, else 200
        return (celcius > 200) ? 500 : 200;
    }

    // Converts Fahrenheit to Celsius and sends alert
    static void alertInCelcius(float fahrenheit) {
        float celcius = (fahrenheit - 32) * 5 / 9;
        int returnCode = networkAlertStub(celcius);
        // Track failures if return code is not 200
        if (returnCode != 200) {
            alertFailureCount++;
        }
    }

    public static void main(String[] args) {
        alertInCelcius(0); // First test case
        alertInCelcius(303.6f); // Second test case
        assert(alertFailureCount == 1) : "Expected 1 failure, but got " + alertFailureCount;
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
