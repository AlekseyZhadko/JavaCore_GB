package ru.geekbrains.lesson4;

/*
Задача 1:

1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */

public class Program {
    private static String[][] myArray;
    private static int arraySizeX = 4;
    private static int arraySizeY = 4;

    public static void main(String[] args) {
        myArray = new String[][]{{"4", "4", "s", "4"},
                {"4", "4", "4", "4"},
                {"4", "4", "4", "4"},
                {"4", "4", "4", "4"}};
        ;
        try {
            System.out.println(SumMyArray(myArray));
        } catch (MyArraySizeException ex) {
            System.out.printf("Ошибка размерности массива - %s\n", ex.getMessage());
        } catch (MyArrayDataException ex) {
            System.out.printf("Ошибка содержимого ячйки массива [%d][%d]- %s\n",
                    ex.getX(), ex.getY(), ex.getMessage());
        }

    }

    /**
     * @param myArray
     * @return
     * @throws MyArraySizeException
     * @throws MyArrayDataException
     */
    public static int SumMyArray(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        int sumArray = 0;
        if (myArray.length != arraySizeX) {
            throw new MyArraySizeException("Неккоректный размер массива");
        } else {
            for (int i = 0; i < arraySizeX; i++) {
                if (myArray[i].length != arraySizeY) {
                    throw new MyArraySizeException("Неккоректный размер массива");
                }
            }
            for (int x = 0; x < arraySizeX; x++) {
                for (int y = 0; y < arraySizeY; y++) {
                    try {
                        sumArray += Integer.parseInt(myArray[x][y]);
                    } catch (NumberFormatException ex) {
                        throw new MyArrayDataException("Неккоректные данные в ячейке", x, y);
                    }
                }
            }
        }
        return sumArray;
    }
}


