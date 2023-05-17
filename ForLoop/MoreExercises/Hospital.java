package ForLoop.MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int period = Integer.parseInt(sc.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;
        for (int i = 1; i <= period; i++) {
            if (i % 3 == 0) {
                if(untreatedPatients>treatedPatients){
                    doctors +=1;
                }
            }
            int patients = Integer.parseInt(sc.nextLine());
            if (doctors >= patients) {
                treatedPatients += patients ;
            } else {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }
        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");
    }
}
