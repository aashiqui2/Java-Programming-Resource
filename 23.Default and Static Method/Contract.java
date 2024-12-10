public interface Contract {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    default void calculate_salary(int a,int b)//defendender methods or virtual extension methods
    {
        System.out.println(a+b);
    }
    static void test()
    {
        System.out.println("contract employee");
    }
}
//! we can also have main method in the interafce after java version 8
// we can have static and non-static(default) method in interface
//backward compatability
//we can override the default methods in the interface