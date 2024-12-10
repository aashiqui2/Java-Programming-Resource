@FunctionalInterface
public interface Contract2 {
    // public void rule2();

    // public void add(int no1,int no2);

    public int add(int no1,int no2);

    // public void rule5();
    //! Contract2 is not a functional interface multiple non-overriding abstract methods found in interface Contract2
    //? functional interface has only one abstract method

    public static void rule3(){

    }
    public default void rule4(){

    }
}
