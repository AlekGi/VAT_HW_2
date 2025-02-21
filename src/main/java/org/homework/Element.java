package org.homework;

public class Element implements IElement {

    private int counter;

    public Element(int counter) {
        if (counter < 0){
            throw new IllegalArgumentException("Количество элементов не может быть отрицательным");
        }else {
            this.counter = counter;
        }
    }

    @Override
    public int getCounter() {
        return counter;
    }
}
