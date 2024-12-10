public class Employee implements Contract,Contract2 {
    public static void main(String[] args) {
        Contract emp=new Employee();
        emp.calculate_salary(1000, 200);
        Contract.test();
        //emp.test();///we cannot call the static method in the interface with class name 
    }
    @Override
    public void calculate_salary(int a,int b)
    {
        Contract.super.calculate_salary(500, 500);
        Contract2.super.calculate_salary(600, 500);
    }
}
//Duplicate default methods named calculate_salary with the parameters (int, int) and (int, int) are inherited from the types Contract2 and ContractJava(67109917)
