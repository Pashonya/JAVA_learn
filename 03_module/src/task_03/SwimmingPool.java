package task_03;

public class SwimmingPool {
    public static void main(String[] args) {

        int volume = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int storageVolume = 0;
        int numberOfTimes = 0;

        while (storageVolume < volume) {

            storageVolume = storageVolume + fillingSpeed - devastationSpeed;
            numberOfTimes = numberOfTimes + 1;
        }
        System.out.println("Время наполения бассеина: " +numberOfTimes);
    }
}



