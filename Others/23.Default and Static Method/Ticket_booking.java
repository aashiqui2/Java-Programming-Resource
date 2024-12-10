import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Ticket_booking {
    public static void main(String[] args) {
        // Ticket_booking tb=new Ticket_booking();
        // System.out.println(tb.Test(65));

        // Predicate<Integer> p = (no) -> (no > 60);
        // System.out.println(p.test(65));

        // Predicate<String> p1 = (name) -> (name.length() >= 8);
        // System.out.println(p1.test("aashiqui"));

        // ArrayList al = new ArrayList();
        // System.out.println(al.size());
        // al.add(10);
        // Predicate<Collection> p2 = (aa) -> aa.size() == 0;
        // System.out.println(p2.test(al));

        // ! Predicates in array
        // int[] ar = { 10, 5, 4, 6, 7 };
        // Predicate<Integer> p = (no) -> no % 2 != 0;
        // for (int i = 0; i < ar.length; i++) {
        // System.out.println(p.test(ar[i]));
        // }

        // Contract.test();

        // && || !
        // Negate !
        // or
        // and

        int[] ar = { 10, 5, 4, 6, 7, 12 };
        Predicate<Integer> p1 = (no) -> no % 2 != 0;
        Predicate<Integer> p2 = (no) -> no <10;
        //check(p1, ar);//this will give only odd numbers
        //check(p1.negate(),ar);//even number
        //! odd number and less than 10
        // check(p1.and(p2),ar);
        check(p1.or(p2),ar);//predicate joining

        // check(p2, ar);

    }

    // public boolean Test(int age)
    // {
    // if(age>60){
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    public static void check(Predicate<Integer> p, int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            // System.out.println(p.test(ar[i]));
            boolean result=p.test(ar[i]);
            if(result){
                System.out.println(ar[i]);
            }
        }
    }

}
