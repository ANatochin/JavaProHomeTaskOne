package arrays.task.two;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = (int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(numbers));

//        1. Посчитать среднее арифметическое массива чисел.

        int sum = 0;
        for(int num : numbers){
            sum += num;
        }

        double average = (1.0*sum)/ numbers.length;
        System.out.println("Average is " + average);

//        2. Найти максимальный и минимальный элементы массива.

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers){
            max = max<num ? num : max;
            min = min>num ? num : min;
        }
        System.out.println("Maximal is " + max);
        System.out.println("Minimal is " + min);

//        3. Найти повторяющиеся элементы в массиве.

        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    System.out.println("Number " + numbers[j] + " is repeating.");
                    break;
                }
            }
        }

//        4. Найти второе наибольшее значение в массиве.
//        5. Найти второе наименьшее значение в массиве.

        int secondMax = numbers[1];
        int secondMin = numbers[1];
        for(int num : numbers){
            secondMax = (num > secondMax && num < max) ? num : secondMax;
            secondMin = (num < secondMin && num > min) ? num : secondMin;
        }
        System.out.println("Second max number is " + secondMax);
        System.out.println("Second min number is " + secondMin);

//        6. Найти повторяющиеся значения в двух массивах.
//        6. Найти не повторяющиеся значения в двух массивах.

        int[] secNumbers = new int[10];
        for(int i = 0; i<secNumbers.length;i++){
            secNumbers[i] = (int)(Math.random()*10)+1;
        }
        System.out.println("Array 1 " + Arrays.toString(numbers));
        System.out.println("Array 2 " + Arrays.toString(secNumbers));

        numbers = arrayCut(numbers);
        secNumbers = arrayCut(secNumbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(secNumbers));

        for(int i = 0; i<numbers.length; i++){
            int checked = numbers[i];
            int counter = 0;
            for (int j = 0; j<secNumbers.length; j++){
                if(checked == secNumbers[j]){
                    counter --;
                } else {
                    counter ++;
                }
            }
            if(counter == secNumbers.length){
                System.out.println("Number " + checked + " is not repeating in given arrays.");
            } else {
                System.out.println("Number " + checked + " is repeating in given arrays.");
            }
        }
    }
    public static int[] arrayCut(int [] array){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i< array.length; i++){
            if(!numbers.contains(array[i])){
                numbers.add(array[i]);
            }
        }

        int[] nums = new int[numbers.size()];
        for(int i = 0; i< nums.length; i++){
            nums[i] = numbers.get(i);
        }

        return nums;
    }
}
