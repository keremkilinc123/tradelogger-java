import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TradeLogger {

    private static final int MAX_SIZE = 10000;
    private static List<String> sessionHistory = new ArrayList<>();

    public void logTrade(String tradeId, String details) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("trades.log", true))) {
            writer.write("ID: " + tradeId + " - " + details);
            writer.newLine();
        }

        if (sessionHistory.size() >= MAX_SIZE) {
            sessionHistory.remove(0);
        }

        sessionHistory.add(tradeId);
    }
}