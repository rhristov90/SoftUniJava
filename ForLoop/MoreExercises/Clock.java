package ForLoop.MoreExercises;

public class Clock {
    public static void main(String[] args) {
        int hours = 0;
        int minutes = -1;
        for (int i = 0; i <= 1439; i++) {
            minutes += 1;
            if (minutes==60){
                hours += 1;
                minutes = 0;
            }  System.out.printf("%d : %d\n", hours, minutes);

        }
    }

}

