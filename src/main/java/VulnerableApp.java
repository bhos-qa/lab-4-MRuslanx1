
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableApp {

    // SQL Injection vulnerability in the login method
    public boolean vulnerableLogin(String username, String password) {
        try {
            // Simulating a database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "pass");
            Statement stmt = conn.createStatement();

            // Vulnerable to SQL injection
            String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(query);

            return rs.next(); // Returns true if a user with the given credentials is found
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Cross-Site Scripting (XSS) vulnerability in displaying comments
    public String displayComment(String comment) {
        // Vulnerable to XSS, as user input is directly inserted into HTML without escaping
        return "<div>User Comment: " + comment + "</div>";
    }
}
