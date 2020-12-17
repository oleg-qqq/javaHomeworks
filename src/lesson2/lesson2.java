package lesson2;

import java.util.Arrays;

public class lesson2 {


    public static void main(String[] args) {
//Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("1 задание: " + case1(array1));

//Задать пустой целочисленный массив размером 8. Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int[] array2 = new int[8];
        int[] array22 = {1, 4, 7, 10, 13, 16, 19, 22};
        System.out.println("2 задание: " + case2(array2, array22));
//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("3 задание: " + case3(array3));
// Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("4 задание: Максимальное число = " + case4max(array3) + ". Минимальное =  " + case4min(array3));
// Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
        case5();

    }

    public static String case1(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                newArray[i] = 1;
            }else newArray[i] = 0;
        }
        return Arrays.toString(newArray);
    }


    public static String case2(int[] array, int[] newArray){

        for(int i = 0; i < array.length; i++){
            array[i] = newArray[i];
        }
        return Arrays.toString(array);
    }

    public static String case3(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i] < 6 ? array[i]*2 : array[i]*1;
        }
        return Arrays.toString(newArray);
    }

    public static int case4max(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int case4min(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
// 5 задание в процессе
    public static void case5(){
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++){
                for(int y = 0; y < array.length; y++){
                array[i][y] = 1;
                System.out.println(array[i][y] + "\t");
                }
            System.out.println();
        }
    }


//6 задание в процессе
    public static String case6(int[] array){
        //int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            array[i] == array[array.length-i]
        }
        return Arrays.toString(newArray);
    }

}