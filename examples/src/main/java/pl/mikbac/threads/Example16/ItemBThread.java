package pl.mikbac.threads.Example16;

/**
 * Created by MikBac on 21.01.2024
 */
public class ItemBThread extends Thread {

    private final Item item;

    public ItemBThread(Item item) {
        this.item = item;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            item.blockB();
        }
    }

}
