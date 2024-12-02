public class Test {
    public static void main(String[] args) {
        //! non-static  method calling
        // Test t=new Test();
        // t.disply(); 

        //! without lambda expression
        // Citizen ci=new Citizen();
        Contract ci=new Citizen();
        ci.rule1();

    }

    // public void disply()
    // {
    //     System.out.println("display");
    // }

    //! this is how you call the method but if the method has no name how can we call it-->learn functional interface
    
    // ()->{System.out.println("display");}

    
    

    
    
}
