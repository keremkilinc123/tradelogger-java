public class Main {
    public static void main(String[] args) {
        TradeLogger logger = new TradeLogger();

        try {
            logger.logTrade("T1", "Sample trade");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}