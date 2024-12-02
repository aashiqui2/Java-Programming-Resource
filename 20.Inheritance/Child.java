class Parents {
    public void displayParents() {
        System.out.println("Two Parents");
    }
}

interface Mother {
    public void show();
}

interface Father {
    public void show();
}

public class Child extends Parents implements Mother, Father {
    public void show() {
        System.out.println("Mother and Father are parents ");
    }

    public void displayChild() {
        System.out.println("Mother and Father have one child");
    }

    public static void main(String args[]) {
        Child obj = new Child();
        System.out.println("Implementation of Hybrid Inheritance in Java");
        obj.show();
        obj.displayChild();
    }
}