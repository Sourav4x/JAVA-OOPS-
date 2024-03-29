import java.util.*;

class time {
    int hour, min;

    void get() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter hours and minutes (HH:MM): ");
        try {
            String[] parts = s1.nextLine().split(":");
            hour = Integer.parseInt(parts[0]);
            min = Integer.parseInt(parts[1]);
            // Input validation
            if (hour < 0 || hour > 23 || min < 0 || min > 59) {
                throw new IllegalArgumentException("Invalid time input.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter time in HH:MM format.");
            get(); // Retry input
        }
    }

    time add(time t11) {
        time r = new time();
        r.min = this.min + t11.min;
        r.hour = this.hour + t11.hour + r.min / 60; // Carry-over to hours
        r.min %= 60; // Adjust minutes for carry-over
        return r;
    }

    void display() {
        System.out.println("Time: " + String.format("%02d:%02d", hour, min)); // Formatted output
    }
}

class oop {
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time();

        t1.get();
        t2.get();

        time t3 = t1.add(t2); // Store added time directly

        System.out.println("The added time is:");
        t3.display();
    }
}
