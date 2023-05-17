package ForLoop.MoreExercises;

public class ClockPartTwo {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = 0;
        int seconds = -1;
        for (int i = 0; i <= 86399; i++) {
            seconds += 1;
            if (seconds == 60) {
                minutes += 1;
                seconds = 0;
            }
            if (minutes == 60){
                hours += 1;
                minutes = 0;
            }
            System.out.printf("%d : %d : %d\n", hours, minutes, seconds);

        }
    }
}
