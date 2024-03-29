import java.util.*;

class Box {
    int roll;
    float cgpa;
    String name;
}

 class vvv{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box x1 = new Box();
        Box x2 = new Box();

        System.out.print("Enter details of student1:-- ");
        x1.roll = scanner.nextInt();
        x1.cgpa = scanner.nextFloat();
        scanner.nextLine(); 
        x1.name = scanner.nextLine();

        System.out.print("Enter details of student2:-- ");
        x2.roll = scanner.nextInt();
        x2.cgpa = scanner.nextFloat();
        scanner.nextLine();  
        x2.name = scanner.nextLine();

        if (x2.cgpa > x1.cgpa) {
            System.out.println("Details of student1 with higher CGPA: ");
            System.out.println("Name: " + x1.name);
            System.out.println("CGPA: " + x1.cgpa);
            System.out.println("Roll: " + x1.roll);
        } else if (x1.cgpa > x2.cgpa) {
            System.out.println("Details of student with lower CGPA: ");
            System.out.println("Name: " + x2.name);
            System.out.println("CGPA: " + x2.cgpa);
            System.out.println("Roll: " + x2.roll);
        }
    }
}

