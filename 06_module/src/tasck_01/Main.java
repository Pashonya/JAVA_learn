package tasck_01;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(8,16,"Apple",2);
        StorageOfInformation storageOfInformation = new StorageOfInformation(typeStorageOfInformation.SSD,1,1);
        RAM ram = new RAM("M1", 16, 0.2);
        Screen screen = new Screen(16,typeScreen.XDR, 0.3 );
        Keyboard keyboard = new Keyboard("Magic Keyboard", " есть", 0.2);
        Computer computer = new Computer (processor,storageOfInformation, ram, screen, keyboard);
        System.out.println(computer);
        }
    }

