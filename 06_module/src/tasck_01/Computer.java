package tasck_01;

public class Computer {

    private Processor processor;
    private StorageOfInformation storageOfInformation;
    private RAM ram;
    private Screen screen;
    private Keyboard keyboard;



    public Computer(Processor processor, StorageOfInformation storageOfInformation, RAM ram, Screen screen, Keyboard keyboard) {
        this.processor = processor;
        this.storageOfInformation = storageOfInformation;
        this.ram = ram;
        this.screen = screen;
        this.keyboard = keyboard;
    }


    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public StorageOfInformation getStorageOfInformation() {
        return storageOfInformation;
    }

    public void setStorageOfInformation(StorageOfInformation storageOfInformation) {
        this.storageOfInformation = storageOfInformation;
    }

    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String toString () {

        return processor.toString() + "\n" + storageOfInformation.toString() + "\n" + ram.toString() + "\n" + screen.toString() + "\n" + keyboard.toString();
    }
}


