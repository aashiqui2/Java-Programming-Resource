import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Function<String,Integer> f=(name)->name.length();
        // System.out.println(f.apply("aashiqui"));//return length of the string.

        //List<Integer> values=Arrays.asList(10,4,5,8,13);
        // System.out.println(values);

        //Enhanced forloop(external looping)
        // for(Integer no:values)
        // {
        //     System.out.println(no);
        // }

        //Internal looping
        //values.forEach(elem->System.out.println(elem));

        //! for normal interface
        // Contract3 cc=new Contract3()
        // {
        //     public void rule1()
        //     {
        //         System.out.println("hi");
        //     }
        // };


        //!for functional interface
        // Contract3 cc=()->System.out.println("hi");
        // cc.rule1();

        // Consumer<Integer> cc=new Consumer_implment();
        // cc.accept(66);

        //! since it is a functional interface and consumer has a anonymous inner class
        // Consumer<Integer> cc=new Consumer<Integer>() {
        //     @Override
        //     public void accept(Integer no)
        //     {
        //         System.out.println(no);
        //     }
        // };

        //! we can apply lambda expression
       // Consumer<Integer> cc=(no)-> System.out.println(no);
        // cc.accept(66);

        List<Integer> values=Arrays.asList(10,4,5,8,13);
        // values.forEach(cc);
        values.forEach((no)-> System.out.println(no));



        
    }
}
