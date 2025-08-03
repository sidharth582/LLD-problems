public class User{
    //required params
    private final String Firstname;
    private final String Lastname;
    

    //Optional params
    private final String email;
    private final int age;
    private final String address;

    public User(UserBuilder builder){
        this.Firstname = builder.Firstname;
        this.Lastname = builder.Lastname;
        this.email=builder.email;
        this.age=builder.age;
        this.address=builder.address;
    }


    public static class UserBuilder{
        //rewuired params
        private final String Firstname;
        private final String Lastname;

    
        //optional params
        private String email;
        private int age=0;
        private String address="";

        public UserBuilder(String Firstname, String Lastname){
            this.Firstname = Firstname;
            this.Lastname = Lastname;
        }

        public UserBuilder email(String email){
            this.email=email;
            return this;
        }

        public UserBuilder age(int age){
            this.age=age;
            return this;
        }

        public  UserBuilder address(String address){
            this.address=address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String toString() {
            return "User{name='" + Firstname + " "+ Lastname + "', email='" + email + "', age=" + age + ", address='" + address + "'}";
    }
}