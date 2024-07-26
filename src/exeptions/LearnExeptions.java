package exeptions;

public class LearnExeptions {
    public static void printArray(int[] Array, int length) {
        try {
            for (int i = 0; i < length; i++) {
                System.out.println(Array[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}

//Пример использования
//package main;
//
//import exeptions.LearnExeptions;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] Array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//        LearnExeptions.printArray(Array,15);
//        System.out.println("1");
//    }
//}