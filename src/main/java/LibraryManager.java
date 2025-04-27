import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibraryManager {

    public static void main(String[] args) {
        System.out.println("✅ Library Management System started successfully!");
    }

    public void addBook(String title, String author) {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "INSERT INTO books (title, author, isAvailable) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, title);
            stmt.setString(2, author);
            stmt.setBoolean(3, true);
            stmt.executeUpdate();
            System.out.println("Book added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listBooks() {
        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM books";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Title: " + rs.getString("title") +
                    ", Author: " + rs.getString("author") +
                    ", Available: " + rs.getBoolean("isAvailable")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}