interface A {
    void disp();
}

public class Mainclass {
    public static void main(String[] args) {
        // A obj=new A(); //A is abstract; cannot be instantiated
        // A obj=new A(){
        // public void disp()
        // {
        // System.out.println("display");
        // }
        // };

        // ! lambda expression-> when there is only one method in the functional interface we can do like this ()->
        A obj = () -> {
            System.out.println("display");
        };
        obj.disp();
    }
}
