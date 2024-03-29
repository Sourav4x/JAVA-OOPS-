class Compute {
    {
        System.out.println("Inside the instance block");
    }

    static {
        System.out.println("In static block");
    }
}

public class statiic {
    public static void main(String[] args) {
        System.out.println("Code of main");
        Compute c1 = new Compute();
    }
}
