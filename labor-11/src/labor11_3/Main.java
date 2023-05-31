package labor11_3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("data.txt");
        System.out.println("Initial products:");
        System.out.println(storage);

        storage.update("update.txt");
        System.out.println("Updated products:");
        System.out.println(storage);
    }
}

