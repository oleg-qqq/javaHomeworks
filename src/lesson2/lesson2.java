package lesson2;

import java.util.Arrays;

public class lesson2 {


    public static void main(String[] args) {
//1 .Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1 задание: " + case1(array1));

//2. Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        System.out.println("2 задание: " + case2());

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        //int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] array3 = {1, 1, 1, 3};
        System.out.println("3 задание: " + case3(array3));
//4. Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("4 задание: Максимальное число = " + case4max(array3) + ". Минимальное =  " + case4min(array3));
//5.  Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
        System.out.println("6 задание: ");
        int side = 5;
        int[][] bArr = new int[side][side];
        case5(bArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int x = 0; x < bArr.length; x++) {
                System.out.print(bArr[i][x]);
            }
            System.out.println();
        }
// 6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.

        System.out.println("6 задание:\nМассив: " + Arrays.toString(array3) + "\nОтвет: " + case6(array3));
// 7. Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
        int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int Value = 15;
        case7(shiftArray, Value);
        System.out.println("7 задание: \nСдвиг на " + Value +"\n" + Arrays.toString(shiftArray));
    }





    // 1 задание
    public static String case1(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[i] = 1;
            } else newArray[i] = 0;
        }
        return Arrays.toString(newArray);
    }

    // 2 задание
    public static String case2() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i * 3;
        }
        return Arrays.toString(arr);
    }

    // 3 задание
    public static String case3(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] < 6 ? array[i] * 2 : array[i] * 1;
        }
        return Arrays.toString(newArray);
    }

    // 4 задание
    public static int case4max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    // 4 задание
    public static int case4min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    // 5 задание
    public static void case5(int[][] inArr) {
        for (int i = 0; i < inArr.length; i++) {
            inArr[i][i] = 1;
            inArr[i][inArr.length - i -1] = 1;
        }
    }

    // 6 задание
    public static Boolean case6(int[] array){
        int left = 0;
        int right = 0;
        for(int i = 0; i < array.length-1; i++){
            left +=array[i];
            for (int j = i+1; j < array.length-1; j++) {
                right +=array[j];
            }
        }
        return (left == right);
    }

    // 7 задание
    public static void case7(int[] array, int value) {
        boolean direct;
        if (value < 0) {
            direct = true;
            value = -value;
        } else {
            direct = false;
        }
        value %= array.length;
        int lastI = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direct) ? array[0] : array[lastI];
            for (int j = 0; j < lastI; j++) {
                if (direct)
                    array[j] = array[j + 1];
                else
                    array[lastI - j] = array[lastI - j - 1];
            }
            if (direct)
                array[lastI] = temp;
            else
                array[0] = temp;
        }
    }
}