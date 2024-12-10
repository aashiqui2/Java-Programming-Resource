public class Test2 {
    public static void main(String[] args) {
        // Contract2 ci=new Contract2(){--->anonymous class
        // public void rule2()
        // {
        // System.out.println("follow rules");
        // }
        // };

        // Contract2 ci = () -> {
        // System.out.println("follow rules");
        // };

        // ci.rule2();

        // Contract2 ci = (no1, no2) -> {
        //     System.out.println(no1 + no2);
        // };
        // ci.add(2, 3);

        //! if we have only one line no need of return keyword
        Contract2 ci = (no1, no2) ->no1+no2 ;
        int result=ci.add(2, 3);
        System.out.println(result);

    }
}
