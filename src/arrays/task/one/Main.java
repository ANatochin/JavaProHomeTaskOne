package arrays.task.one;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {

//        1.   Создайте массив интов без указания значений элементов при создании объекта.
        int[] firstIntArray = new int[10];

//        2.   Создайте массив интов с указанием значений элементов при создании объекта.
        int[] secondIntArray = {1,2,3,4,5};

//        3.   Создайте пустой массив интов. Заполните его любыми значениями.
        int[] toFillIntArr = new int[5];
        for(int i = 0; i<toFillIntArr.length;i++){
            toFillIntArr[i]= 1 + (int)(Math.random()*5);
        }
        System.out.println(Arrays.toString(toFillIntArr));
        System.out.println("=====================");

//        4.   Создайте пустой массив даблов. Заполните его любыми значениями и выведите в консоль содержимое.
        double[] doubleArr = new double[5];
        for(int i = 0; i<doubleArr.length;i++){
            doubleArr[i]= Math.random()*5;
        }
        System.out.println(Arrays.toString(doubleArr));
        System.out.println("=====================");


//        5.   Создайте пустой массив на 10 элементов. Заполните значения элементов. Расширьте массив на 5 элементов.
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length;i++){
            numbers[i]= 3 + (int)(Math.random()*7);
        }

        numbers = copyOf(numbers, numbers.length+5);


//        6.   Создайте массив из 12 случайных целых чисел из отрезка `[-15;15]`.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
        int[] betweenFifteens = new int[12];
        for(int i = 0; i<betweenFifteens.length;i++){
            betweenFifteens[i]= (int)(Math.random()*(30+1)-15);
        }
        System.out.println(Arrays.toString(betweenFifteens));
        int max = -15;
        int indexOfMax = 0;
        for(int i = 0; i< betweenFifteens.length; i++){
            if(betweenFifteens[i]>=max){
                max = betweenFifteens[i];
                indexOfMax = i;
            }
        }
        System.out.println(max);
        System.out.println(indexOfMax);

        System.out.println("=====================");

//        7.   Создайте массив из 8 случайных целых чисел из отрезка `[1;10]`.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
        int[] eightNums = new int[8];
        for(int i = 0; i<eightNums.length;i++){
            eightNums[i]= (int)(Math.random()*(9+1)+1);
        }
        System.out.println(Arrays.toString(eightNums));

        for (int i = 0; i< eightNums.length; i++){
            if(!(i%2==0)){
                eightNums[i]=0;
            }
        }
        System.out.println(Arrays.toString(eightNums));
        System.out.println("=====================");
//        8.   Создайте массив из 4 случайных целых чисел из отрезка `[10;99]`.
//        Выведите его на экран в строку. Далее определите и выведите на экран сообщение о том,
//        является ли массив строго возрастающей последовательностью.
        int[] fourNums = new int[4];
        for(int i = 0; i<fourNums.length;i++){
            fourNums[i]= (int)(Math.random()*(100-10)+10);
        }
        System.out.println(Arrays.toString(fourNums));

        boolean rising = true;
        for(int i = 1; i<fourNums.length; i++){
            if(fourNums[i]<=fourNums[i-1]){
                rising = false;
            }
        }
        if(rising == true){
            System.out.println("Массив строго возрастающий");
        }
        System.out.println("=====================");

//        9.   Создайте 2 массива из 5 случайных целых чисел из отрезка `[0;5]` каждый.
//        Выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое
//        элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше
//        (либо сообщите, что их средние арифметические равны).
        int[] fiveNums1 = new int[5];
        int[] fiveNums2 = new int[5];
        for(int i = 0; i<fiveNums1.length;i++){
            fiveNums1[i]= (int)(Math.random()*6);
        }
        for(int i = 0; i<fiveNums2.length;i++){
            fiveNums2[i]= (int)(Math.random()*6);
        }
        System.out.println(Arrays.toString(fiveNums1));
        System.out.println(Arrays.toString(fiveNums2));

        System.out.println(averageOfArray(fiveNums1));
        System.out.println(averageOfArray(fiveNums2));

        if(averageOfArray(fiveNums1)==averageOfArray(fiveNums2)){
            System.out.println("Среднее арифмет. массивов равны");
        }else if(averageOfArray(fiveNums1)>averageOfArray(fiveNums2)){
            System.out.println("Среднее арифмет. первого массива больше чем у второго");
        } else {
            System.out.println("Среднее арифмет. второго массива больше чем у первого");
        }
        System.out.println("=====================");
//        10.   Создать массив из 50 случайных целых чисел из отрезка `[0;1000]` и вывести его на экран.
//        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        int[] thousand = new int[50];
        int evenCount = 0;
        for(int i = 0; i<thousand.length;i++){
            thousand[i]= (int)(Math.random()*1001);
            if(thousand[i]%2==0){
                evenCount++;
            }
        }
        int[] evens = new int[evenCount];
        int j = 0;
        for(int i = 0; i<thousand.length; i++){
            if(thousand[i]%2==0){
                evens[j]= thousand[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(thousand));
        System.out.println(Arrays.toString(evens));
        System.out.println("=====================");

//        11.   Создайте массив a, заполните его. Создайте массив b, заполните его. Создайте массив c,
//        размер которого будет равен размер массива a + размер массива b.
//        Заполнить массив c следующим образом: взять элемент с массива a, следом элемент из массива b и т.д.
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};
        int[] c = new int[a.length+b.length];
        int i = 0;
        int k = 0;
        while (i<c.length){
            c[i] = a[k];
            i++;
            c[i]= b[k];
            i++;
            k++;
        }
        System.out.println(Arrays.toString(c));
    }
    public static double averageOfArray(int[] array){
        int sum = 0;
        for(int num:array){
            sum+=num;
        }
        return 1.0*sum/array.length;
    }
}
