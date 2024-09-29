import java.util.HashMap;
import java.util.Map;

public class VulnerableApp {

    // Simulated database for users and their passwords (insecure)
    private static final Map<String, String> userDatabase = new HashMap<>();

    static {
        // Hardcoded credentials (bad practice)
        userDatabase.put("admin", "password123");
        userDatabase.put("user", "userpass");
    }

    // 1. SQL Injection vulnerability
    public String getUserData(String username) {
        // Vulnerable to SQL injection
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        // Simulated execution of query...
        return "Query executed: " + query; // Return simulated output
    }

    // 2. Cross-Site Scripting (XSS) vulnerability
    public String displayComment(String comment) {
        // No escaping of user input, allowing for XSS
        return "<div>" + comment + "</div>";
    }

    // 3. Insecure Direct Object References (IDOR) vulnerability
    public String getUserDocument(String userId) {
        // No access control checks, potentially exposing sensitive documents
        return "Retrieving document for user ID: " + userId; // Dangerous exposure
    }

    // 4. Improper Authentication vulnerability
    public boolean authenticateUser(String username, String password) {
        String storedPassword = userDatabase.get(username); // Lookup in "database"
        // Insecure password comparison (plaintext)
        return storedPassword != null && password.equals(storedPassword);
    }

    // 5. Method to process user input without validation (vulnerable)
    public String processUserInput(String input) {
        // Vulnerable to injection attacks
        return "Processed input: " + input;
    }

    // 6. Token generation with predictable pattern (vulnerable)
    public String generateToken(String userId) {
        // Hardcoded token pattern (easily guessable)
        return userId + "-token-12345";
    }

    // 7. Vulnerable method for sensitive action (no checks)
    public String performSensitiveAction(String userId) {
        // Performing an action without checking user permissions
        return "Sensitive action performed for user ID: " + userId;
    }
}
