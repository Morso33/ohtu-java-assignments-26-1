package dao;

import datasource.MariaDbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyDao {

    public double getExchangeRate(String currencyCode) throws SQLException {

        String sql = "SELECT exchange_rate_to_usd FROM currencies WHERE code = ?";

        try (Connection conn = MariaDbConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, currencyCode);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getDouble("exchange_rate_to_usd");
            } else {
                throw new SQLException("Currency not found: " + currencyCode);
            }
        }
    }
}