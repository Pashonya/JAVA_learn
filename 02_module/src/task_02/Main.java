package task_02;

public class Main {
    public static void main(String[] args) {

        int houstonAge = 3;
        int geraltAge = 2;
        int basiaAge = 4;

        int min = -1;
        int middle = -1;
        int max = -1;

        //min

        if (houstonAge <= geraltAge && houstonAge <= basiaAge) {
            min = houstonAge;
        }
        else if (geraltAge <= houstonAge && geraltAge <= basiaAge) {
            min = geraltAge;
        }
        else { min = basiaAge; }

        //middle

        if ((houstonAge <= geraltAge && houstonAge >= basiaAge) || (houstonAge >= geraltAge && houstonAge <= basiaAge)) {
            middle = houstonAge;
        }
        else if ((geraltAge <= houstonAge && geraltAge >= basiaAge) || (geraltAge >= houstonAge && geraltAge <= basiaAge)) {
            middle = geraltAge;
        }
        else { middle = basiaAge; }

        //max

        if (houstonAge >= geraltAge && houstonAge >= basiaAge) {
            max = houstonAge;
        }
        else if (geraltAge >= houstonAge && geraltAge >= basiaAge) {
            max = geraltAge;
        }
        else { max = basiaAge; }

        System.out.println("Minimal Age: " + min);
        System.out.println("Middle Age: " + middle);
        System.out.println("Maximum Age: " + max);
    }
}