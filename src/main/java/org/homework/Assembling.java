package org.homework;

public class Assembling {
    public static void main(String[] args) {

        Conveyor conveyor = new Conveyor();
        conveyor.addElement(new Element(1));
        conveyor.addElement(new Element(2));
        System.out.println("В 1-й сборке получилось собрать " + conveyor.getCounter() + " элемента(ов)");

        Conveyor conveyor2 = new Conveyor();
        conveyor2.addElement(new Element(10));
        conveyor2.addElement(new Element(20));
        System.out.println("Во 2-й сборке получилось собрать " + conveyor2.getCounter() + " элемента(ов)");

        Conveyor conveyor3 = new Conveyor();
        conveyor3.addElement(new Element(30));
        conveyor3.addElement(conveyor);
        System.out.println("В 3-й сборке получилось собрать " + conveyor3.getCounter() + " элемента(ов)");

        Conveyor conveyor4 = new Conveyor();
        conveyor4.addElement(conveyor2);
        conveyor4.addElement(conveyor3);
        conveyor4.removeElement(0);
        System.out.println("В 4й сборке получилось собрать " + conveyor4.getCounter() + " элемента(ов)");
    }
}