import java.util.*;

class time {
    int hour, min;

    void get() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter hour & min: ");
        hour = s1.nextInt();
        min = s1.nextInt();
    }

    time add(time t1, time t2) {
        time result = new time();
        result.hour = t1.hour + t2.hour;
        result.min = t1.min + t2.min;
        if (result.min >= 60) {
            result.hour += result.min / 60;
            result.min %= 60;
        }
        return result;
    }
}

public class oops {
    public static void main(String[] args) {
        time t1 = new time();
        time t2 = new time();
        time t3 = new time();

        System.out.println("Enter first time:");
        t1.get();
        System.out.println("Enter second time:");
        t2.get();

        t3 = t3.add(t1, t2);

        System.out.println("Sum of times:");
        System.out.println("Hour: " + t3.hour + " Min: " + t3.min);
    }
}
