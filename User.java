public class User {
    private String name;
    private int userId;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}
