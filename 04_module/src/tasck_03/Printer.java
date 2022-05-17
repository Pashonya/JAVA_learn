package tasck_03;

public class Printer {

    private static String queue = "";
    private static int pendingPagesCount = 0;
    private static int quantity = 0;
    private static int allPagesCount = 0;


    public Printer() {
        queue = "Документы в печати:";
    }

    public static int getPendingPagesCount() {
        return pendingPagesCount;
    }
    public static int getAllPagesCount () {
        return allPagesCount;
    }


    public void append(String name) {
        append(name, "");
    }

    public void append(String name, String inkСolor) {
        append(name, inkСolor, 1);
    }

    public void append(String name, String inkColor, int quantity) {

        boolean error = false;

        if (contains(name)) {
            return;
        }
        queue = queue + "\n" + name + " " + inkColor + " "+ quantity + " ";
        pendingPagesCount = pendingPagesCount + quantity;
        allPagesCount = allPagesCount;
    }

    public void clear() {
        queue = "";
        pendingPagesCount = 0;
    }

    public boolean contains(String name) {
        return queue.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Нет документов на печать");
        } else {
            System.out.println(queue);
        }
        System.out.println("Общее количество страниц: " + pendingPagesCount + " - стр.");
        clear();
        System.out.println();
        System.out.println("Количество страниц на печать: " + pendingPagesCount);
        System.out.println("Всего страниц было в печати: " + allPagesCount);
        clear();
    }
}


