package pl.mikbac.threads.Example22;

/**
 * Created by MikBac on 23.01.2024
 */
public class Item {

    private int value;

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public int getValue() {
        return value;
    }

}
