package task_02;

public class Main2 {
    public static void main(String[] args) {
        int houstonAge = 3;
        int geraltAge = 2;
        int basiaAge = 2;

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
        else if (basiaAge <= houstonAge && basiaAge <= geraltAge){
            min = basiaAge;
        }

        //middle

        if ((houstonAge <= geraltAge && houstonAge >= basiaAge) || (houstonAge >= geraltAge && houstonAge <= basiaAge)) {
            middle = houstonAge;
        }
        else if ((geraltAge <= houstonAge && geraltAge >= basiaAge) || (geraltAge >= houstonAge && geraltAge <= basiaAge)) {
            middle = geraltAge;
        }
        else if ((basiaAge <= houstonAge && basiaAge >= geraltAge) || (basiaAge >= houstonAge && basiaAge <= geraltAge)) {
            middle = basiaAge;
        }

        //max

        if (houstonAge >= geraltAge && houstonAge >= basiaAge) {
            max = houstonAge;
        }
        else if (geraltAge >= houstonAge && geraltAge >= basiaAge) {
            max = geraltAge;
        }
        else if (basiaAge >= houstonAge && basiaAge >= geraltAge) {
            max = basiaAge;
        }

        System.out.println("Minimal Age: " + min);
        System.out.println("Middle Age: " + middle);
        System.out.println("Maximum Age: " + max);
    }
}

