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

    static class Alerter {
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
        Alerter.alertInCelcius(400.5f);
        Alerter.alertInCelcius(303.6f);
        assert Alerter.alertFailureCount == 1 : "Expected 1 failure, but got " + Alerter.alertFailureCount;
        System.out.printf("%d alerts failed.\n", Alerter.alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
