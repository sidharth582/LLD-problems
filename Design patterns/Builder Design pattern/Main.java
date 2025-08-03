
public class Main{
    public static void main(String[] args) {
        User user1=new User.UserBuilder("Sidharth", "Roy")
                .email("sid582@gmail.com")
                .age(24)
                .address("Kolkata")
                .build();
        User user2=new User.UserBuilder("John", "Doe")
                .email("johnDoe@gmail.com")
                .age(30)
                .build();
        System.out.println(user1);
        System.out.println(user2);
    }   
}