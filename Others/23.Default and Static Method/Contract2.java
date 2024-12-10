public interface Contract2 {
    default void calculate_salary(int a,int b)
    {
        System.out.println(a-b);
    }
}
