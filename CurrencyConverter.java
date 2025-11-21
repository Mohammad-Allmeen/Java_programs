import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    // Exchange rates from 1 USD to others (July 2025 rates — example only)
    static Map<String, Double> usdRates = new HashMap<>();

    static {
        usdRates.put("USD", 1.0);
        usdRates.put("INR", 83.10);
        usdRates.put("GBP", 0.78);
        usdRates.put("SAR", 3.75);
        usdRates.put("CNY", 7.25);
    }

    public static double convertCurrency(String from, String to, double amount) {
        if (!usdRates.containsKey(from) || !usdRates.containsKey(to)) {
            throw new IllegalArgumentException("Invalid currency code.");
        }

        double amountInUSD = amount / usdRates.get(from); // Convert to USD first
        return amountInUSD * usdRates.get(to);            // Convert to target currency
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available currencies: USD, GBP, INR, SAR, CNY");
        System.out.print("Enter FROM currency: ");
        String from = scanner.nextLine().toUpperCase();

        System.out.print("Enter TO currency: ");
        String to = scanner.nextLine().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            double convertedAmount = convertCurrency(from, to, amount);
            System.out.printf("%.2f %s = %.2f %s\n", amount, from, convertedAmount, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
