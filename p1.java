import javax.swing.*;
import java.awt.event.*;

class CurrencyConverter extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField amountField;
    private JButton convertButton;
    private JComboBox<String> currencyDropdown;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        label1 = new JLabel("Currency Converter");
        label1.setBounds(100, 10, 150, 20);
        panel.add(label1);

        label2 = new JLabel("Enter Amount in INR:");
        label2.setBounds(20, 40, 150, 20);
        panel.add(label2);

        amountField = new JTextField();
        amountField.setBounds(170, 40, 100, 20);
        panel.add(amountField);

        String[] currencies = {"USD", "EUR", "GBP", "JPY", "CAD", "AUD", "CHF", "CNY", "HKD", "KRW", "NZD", "SGD", "THB", "SEK", "NOK"};
        currencyDropdown = new JComboBox<>(currencies);
        currencyDropdown.setBounds(80, 80, 150, 20);
        panel.add(currencyDropdown);

        convertButton = new JButton("Convert");
        convertButton.setBounds(120, 120, 100, 30);
        convertButton.addActionListener(this);
        panel.add(convertButton);

        label3 = new JLabel();
        label3.setBounds(20, 160, 300, 50);
        panel.add(label3);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            try {
                double amountINR = Double.parseDouble(amountField.getText());
                String selectedCurrency = (String) currencyDropdown.getSelectedItem();
                double convertedAmount = convertToCurrency(amountINR, selectedCurrency);
                label3.setText("Equivalent Amount in " + selectedCurrency + ": " + convertedAmount);
            } catch (NumberFormatException ex) {
                label3.setText("Invalid input! Please enter a number.");
            }
        }
    }

   private double convertToCurrency(double amountINR, String currency) {
    double exchangeRate;
    switch (currency) {
        case "USD":
            exchangeRate = 1.0 / 83.0; // 1 USD = 83 INR
            break;
        case "EUR":
            exchangeRate = 0.93 * (1.0 / 83.0); // 1 EUR = 0.93 USD
            break;
        case "GBP":
            exchangeRate = 0.79 * (1.0 / 83.0); // 1 GBP = 0.79 USD
            break;
        case "JPY":
            exchangeRate = 150.87 * (1.0 / 83.0); // 1 JPY = 150.87 USD
            break;
        case "CAD":
            exchangeRate = 1.38 * (1.0 / 83.0); // 1 CAD = 1.38 USD
            break;
        case "AUD":
            exchangeRate = 1.54 * (1.0 / 83.0); // 1 AUD = 1.54 USD
            break;
        case "CHF":
            exchangeRate = 0.88 * (1.0 / 83.0); // 1 CHF = 0.88 USD
            break;
        case "CNY":
            exchangeRate = 7.09 * (1.0 / 83.0); // 1 CNY = 7.09 USD
            break;
        case "NOK":
            exchangeRate = 10.60 * (1.0 / 83.0); // 1 NOK = 10.60 USD
            break;
        case "HKD":
            exchangeRate = 7.83 * (1.0 / 83.0); // 1 HKD = 7.83 USD
            break;
        case "KRW":
            exchangeRate = 1336.33 * (1.0 / 83.0); // 1 KRW = 1336.33 USD
            break;
        case "NZD":
            exchangeRate = 1.64 * (1.0 / 83.0); // 1 NZD = 1.64 USD
            break;
        case "SGD":
            exchangeRate = 1.35 * (1.0 / 83.0); // 1 SGD = 1.35 USD
            break;
        case "THB":
            exchangeRate = 36.08 * (1.0 / 83.0); // 1 THB = 36.08 USD
            break;
        case "SEK":
            exchangeRate = 10.36 * (1.0 / 83.0); // 1 SEK = 10.36 USD
            break;
        default:
            exchangeRate = 0.0; // Return 0 for unknown currency
    }
    return amountINR * exchangeRate;
}


    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
