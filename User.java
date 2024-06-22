public class User {
    private String username;
    private String password;
    private String characterType;

    public User(String username, String password, String characterType) {
        this.username = username;
        this.password = password;
        this.characterType = characterType;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCharacterType() {
        return characterType;
    }
}