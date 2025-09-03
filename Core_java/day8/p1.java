import java.util.Scanner;

class Sample {
    public static void main(String[] args) throws InterruptedException {
        int hours, minutes, seconds;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Now set the time for Watch");
            System.out.print("Enter the Hours (1–12): ");
            hours = s.nextInt();
            System.out.print("Enter the Minutes (0–59): ");
            minutes = s.nextInt();
            System.out.print("Enter the Seconds (0–59): ");
            seconds = s.nextInt();

            if (hours < 1 || hours > 12 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
                System.out.println("You entered an invalid time. Please try again.\n");
                continue;
            }
            break;
        }

        while (true) {
            System.out.printf("%02d:%02d:%02d\r", hours, minutes, seconds);
            Thread.sleep(1000);  // 1 second delay

            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
            }
            if (minutes == 60) {
                minutes = 0;
                hours++;
            }
            if (hours > 12) {
                hours = 1;
            }
        }
    }
}
