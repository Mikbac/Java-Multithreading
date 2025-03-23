package pl.mikbac.threads.Example108;

/**
 * Created by MikBac on 21.01.2024
 */
public class Main {

    public static void main(String[] args) {

        final Item item = new Item();

        ItemAThread itemAThread = new ItemAThread(item);
        ItemBThread itemBThread = new ItemBThread(item);

        itemAThread.start();
        itemBThread.start();

    }

}
