public class User{

    //required params
    private final String name;
    private final String email;

    //Optional params
    private final int age;
    private final String address;

    public User(Builder builder){
        this.name=builder.name;
        this.email=builder.email;
        this.age=builder.age;
        this.address=builder.address;
    }


    public static class Builder{
        //rewuired params
        private final String name;
        private final String email;

        //optional param
        private int age=0;
        private String address="";

        public Builder(String name,String email){
            this.name=name;
            this.email=email;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Builder address(String address){
            this.address=address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public String toString() {
            return "User{name='" + name + "', email='" + email + "', age=" + age + ", address='" + address + "'}";
    }
}