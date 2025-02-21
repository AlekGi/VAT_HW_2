package org.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AssemblingTest {

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30})
    @DisplayName("Проверка добавления элементов")
    public void testAddElements(int argument) {
        //given
        Conveyor conveyor = new Conveyor();
        conveyor.addElement(new Element(argument));
        conveyor.addElement(new Element(argument));
        //when
        int elements1 = conveyor.getCounter();
        int elements2 = conveyor.getCounter();
        int elements3 = conveyor.getCounter();
        //then
        Assertions.assertEquals(argument + argument, elements1);
        Assertions.assertEquals(argument + argument, elements2);
        Assertions.assertEquals(argument + argument, elements3);
    }
    @ParameterizedTest
    @ValueSource(ints = {10})
    @DisplayName("Проверка удаления элементов")
    public void testRemoveElements(int argument) {
        //given
        Conveyor conveyor = new Conveyor();
        conveyor.addElement(new Element(argument));
        conveyor.addElement(new Element(argument));
        conveyor.addElement(new Element(argument));
        conveyor.removeElement(0);
        //when
        int elements1 = conveyor.getCounter();
        //then
        Assertions.assertEquals(20, elements1);
    }

    @Test
    @DisplayName("Проверка выброса ошибки о некорректном значении количества элементов равным -1")
    public void testIllegalArgumentException() {
        //given
        //when
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Element(-1));
        //then
        Assertions.assertNotNull(exception);
        Assertions.assertEquals("Количество элементов не может быть отрицательным", exception.getMessage());
    }
}
