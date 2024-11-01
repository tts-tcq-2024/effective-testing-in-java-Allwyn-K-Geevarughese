public class alerter {
    interface NetworkAlert {
        int sendAlert(float celcius);
    }

    // Stub for network alert
    static class NetworkAlertStub implements NetworkAlert {
        @Override
        public int sendAlert(float celcius) {
            System.out.println("ALERT: Temperature is " + celcius + " celcius");
            return (celcius > 200) ? 500 : 200;
        }
    }

    static class alerter {
        static int alertFailureCount = 0;
        static NetworkAlert networkAlert = new NetworkAlertStub();

        // Convert Fahrenheit to Celsius
        static void alertInCelcius(float fahrenheit) {
            float celcius = (fahrenheit - 32) * 5 / 9;
            int returnCode = networkAlert.sendAlert(celcius);
            // Check for alert failure
            if (returnCode != 200) {
                alertFailureCount++;
            }
        }
    }

    public static void main(String[] args) {
        alerter.alertInCelcius(400.5f);
        alerter.alertInCelcius(303.6f);
        assert alerter.alertFailureCount == 1 : "Expected 1 failure, but got " + alerter.alertFailureCount;
        System.out.printf("%d alerts failed.\n", alerter.alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
