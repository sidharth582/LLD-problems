
public class Singleton {
    public static void main(String[] args) {
        Abc obj=Abc.getInstance();
        System.out.println(obj);
    }    
}

class Abc{
    //obj created only once
    static Abc obj=new Abc();
    //create private constructor so that client cant create object
    private Abc(){

    }
    //getInstance() method so that client can call this to create object
    public static Abc getInstance(){
        return obj;
    }
}
