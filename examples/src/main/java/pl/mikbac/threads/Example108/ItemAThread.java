package pl.mikbac.threads.Example108;

/**
 * Created by MikBac on 21.01.2024
 */
public class ItemAThread extends Thread {

    private Item item;

    public ItemAThread(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            item.blockA();
        }
    }

}
