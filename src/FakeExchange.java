public class FakeExchange implements Exchange {
    @Override
    public float rate(String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("USD") && toCurrency.equals("Euro")) {
            return 0.85f;
        }
        return 1.0f;
    }
}
