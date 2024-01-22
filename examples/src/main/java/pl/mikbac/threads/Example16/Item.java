package pl.mikbac.threads.Example16;

/**
 * Created by MikBac on 21.01.2024
 */
public class Item {

    private final Object itemA = new Object();
    private final Object itemB = new Object();

    public void blockA() {
        synchronized (itemA) {
            System.out.println(STR."Item A is locked by: \{Thread.currentThread().getName()}");

            synchronized (itemB) {
                System.out.println(STR."Item B is locked by: \{Thread.currentThread().getName()}");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public void blockB() {
        synchronized (itemB) {
            System.out.println(STR."Item B is locked by: \{Thread.currentThread().getName()}");

            synchronized (itemA) {
                System.out.println(STR."Item A is locked by: \{Thread.currentThread().getName()}");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        }
    }

}
