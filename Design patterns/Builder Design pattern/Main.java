
public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder("Alice", "alice@example.com")
                            // .age(30)
                            .address("New York")
                            .build();

        System.out.println(user1.toString());
    }
}