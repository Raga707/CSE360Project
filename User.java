public class User {
    // Private fields to store user information
    private String username; // Stores the username of the user
    private String password; // Stores the password of the user
    private String characterType; // Stores the character type of the user

    // Constructor to initialize a new User object with given username, password,
    // and character type
    public User(String username, String password, String characterType) {
        this.username = username;
        this.password = password;
        this.characterType = characterType;
    }

    // Getter method to retrieve the username
    public String getUsername() {
        return username;
    }

    // Getter method to retrieve the password
    public String getPassword() {
        return password;
    }

    // Getter method to retrieve the character type
    public String getCharacterType() {
        return characterType;
    }
}
