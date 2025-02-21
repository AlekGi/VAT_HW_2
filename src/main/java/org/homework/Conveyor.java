package org.homework;


import java.util.ArrayList;
import java.util.List;

public class Conveyor implements IElement {

    public List<IElement> elements = new ArrayList<>();

    public void addElement(IElement element) {
        elements.add(element);
    }

   public void removeElement(int index) {
        elements.remove(index);
   }

    @Override
    public int getCounter() {
        return elements.stream().mapToInt(IElement::getCounter).sum();
    }
}
