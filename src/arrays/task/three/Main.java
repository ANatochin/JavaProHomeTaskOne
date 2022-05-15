package arrays.task.three;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        1. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
        int [] fibo = new int[20];

        for (int i = 0; i < fibo.length; i++){
            if(i == 0 || i == 1){
                fibo[i] = i;
            }else{
                fibo[i]= fibo[i-1]+fibo[i-2];
            }
        }
        for(int num : fibo){
            System.out.print(num + " ");
        }
        System.out.println();

//        2. Написать код, который заполнит массив произвольного размера числами по возрастанию,
//        начиная с центра массива, например, `[5,4,3,2,1,0,1,2,3,4,5]`.
        int [] numbers = new int[13];

        numbers[numbers.length/2] = 0;
        for (int i = numbers.length/2; i < numbers.length-1; i++){
            numbers[i+1] = numbers[i]+1;
        }
        for (int i = numbers.length/2; i > 0; i--){
            numbers[i-1] = numbers[i]+1;
        }
        System.out.println(Arrays.toString(numbers));

//        3. Найти в массиве число, которое повторяется наибольшее количество раз.
        int [] numbers1 = new int[10];
        for (int i = 0; i < numbers1.length; i++){
            numbers1[i] = (int)(Math.random()*(5-1)+1);
        }
        System.out.println(Arrays.toString(numbers1));

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        int counter = 1;
        int helpCounter = 1;
        int mostFrequent = numbers1[0];
        for (int i = 1; i < numbers1.length; i++){
            if(numbers1[i] == numbers1[i-1]){
                helpCounter++;
            } else {
                helpCounter = 1;
            }
            if(helpCounter > counter){
                counter = helpCounter;
                mostFrequent = numbers1[i-1];
            }
        }
        System.out.println(mostFrequent + " " + counter);

//        4. Написать код для зеркального переворота элементов в массиве `([1, 2, 3, 4] -> [4, 3, 2, 1])`.

        int [] mirrorArr = {1, 2, 3, 4};
        System.out.print(Arrays.toString(mirrorArr) + " -> ");
        int temp = 0;
        for (int i = 0; i < mirrorArr.length/2; i++){
            temp = mirrorArr[i];
            mirrorArr[i] = mirrorArr[mirrorArr.length - 1 - i];
            mirrorArr[mirrorArr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(mirrorArr));


//        5. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка `[10;99]`.
//        Вывести массив на экран.

        int [][] firstMatrix = new int[8][5];
        for (int i = 0; i < firstMatrix.length; i++){
            for (int j = 0; j < firstMatrix[i].length; j++){
                firstMatrix[i][j]= (int)((Math.random()*90)+10);
            }
        }
        for (int i = 0; i < firstMatrix.length; i++){
            System.out.println(Arrays.toString(firstMatrix[i]));
        }
        System.out.println("==============");

//        6. Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка `[0;9]`.
//        Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял
//        её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в
//        рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
//        а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
        int [][] secMatrix = new int[6][7];
        for (int i = 0; i < secMatrix.length; i++){
            for (int j = 0; j < secMatrix[i].length; j++){
                secMatrix[i][j]= (int)((Math.random()*10));
            }
        }
        for (int i = 0; i < secMatrix.length; i++){
            System.out.println(Arrays.toString(secMatrix[i]));
        }

        for (int i = 0; i < secMatrix.length; i++){
            int max = secMatrix[i][0];
            int helper = secMatrix[i][0];;
            int indexHelper = 0;
            for (int j = 1; j < secMatrix[i].length; j++){

                if (secMatrix[i][j] > max){
                    max = secMatrix[i][j];
                    indexHelper = j;
                }
            }
            secMatrix[i][0] = max;
            secMatrix[i][indexHelper] = helper;
        }
        System.out.println("--------------------");
        for (int i = 0; i < secMatrix.length; i++){
            System.out.println(Arrays.toString(secMatrix[i]));
        }

//        7. Дан массив с числами `5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4`.
//        Переместить все нули в начало массива.
        int[] thirdArray = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};

        thirdArray = startZeros(thirdArray);
        System.out.println(Arrays.toString(thirdArray));

//        8. Дан массив с числами `5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4`.
//        Переместить все нули в конец массива.
        int[] fourthArray = {5, 4, 3, 0, 6, 0, 0, 5, 6, 0, 25, 0, 8, 7, 3, 0, 1, 1, 0, 6, 4};

        fourthArray = zerosToEnd(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

//        9. Программа должна создать массив из 12 случайных целых чисел из отрезка `[-10;10]` таким образом,
//        чтобы отрицательных и положительных элементов там было поровну и не было нулей.
//        При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в
//        массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы
//        постоянно чередуются через один и пр.). Вывести полученный массив на экран.

        int [] twelveNums = new int [12];
        int positives = 0;
        int negatives = 0;

        while(positives != twelveNums.length/2 & negatives != twelveNums.length/2){
            for (int i = 0; i < twelveNums.length; i++){
                int value = (int)(Math.random()*(20+1)-10);

                if(value > 0) {
                    positives ++;
                    twelveNums[i] = value;
                } else if (value < 0){
                    negatives ++;
                    twelveNums[i] = value;
                } else {
                    continue;
                }
            }
            for(int num : twelveNums){
                if(num == 0){
                    positives--;
                }
            }
        }

        System.out.println(Arrays.toString(twelveNums));

    }

    public static int [] startZeros (int [] array){
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i] != 0){
                numbers.add(array[i]);
            }else{
                numbers.add(0,array[i]);
            }
        }
        // not using ArrayList.toArray() method, to keep primitive int type of elements in Array
        int [] helpNums = new int [numbers.size()];
        for (int i = 0; i < helpNums.length; i++){
            helpNums[i] = numbers.get(i);
        }
        return helpNums;
    }

    public static int []zerosToEnd (int [] array){
        int initialLength = array.length;
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if(array[i] != 0){
                numbers.add(array[i]);
            }
        }
        for (int i = numbers.size()-1; i < initialLength-1; i++){
                numbers.add(0);
        }
        // not using ArrayList.toArray() method, to keep primitive int type of elements in Array
        int [] helpNums = new int [numbers.size()];
        for (int i = 0; i < helpNums.length; i++){
            helpNums[i] = numbers.get(i);
        }
        return helpNums;
    }
}
