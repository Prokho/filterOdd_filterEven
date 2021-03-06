//ДЗ написать функцию генерации массива заполненого случайными числами от 0 до 100
//2 дз написать функцию фильтрации четных элементов массива
//по итогу функция должна создать 2 массив на базе входящего массива
//2 массив должен содержать только четные элементы


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

  static int [] generateRandomeArray(int size)
  {
      int [] array = new int[size];
      Random rnd = new Random();
      for(int i =0; i < array.length; i++)
      {
          array[i] = rnd.nextInt(100);
      }
      return array;
  }

  static int [] filterEven(int [] array)
  {
      int counter =0;
      for(int i=0;i< array.length;i++)
      {
          if(array[i]%2==0)
          {
              counter=counter+1;
          }

      }
      if(counter==0){
          return null;
      }
      int [] arrayEven = new int[counter];

      for(int i=0, j=0;i< array.length;i++)
      {
          if(array[i]%2==0)
          {
              arrayEven[j] = array[i];
              j +=1;
          }

      }
      return arrayEven;

  }

    static int [] filterOdd(int [] array)
    {
        int counter =0;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]%2==1)
            {
                counter=counter+1;
            }

        }
        if(counter==0){
            return null;
        }
        int [] arrayEven = new int[counter];

        for(int i=0, j=0;i< array.length;i++)
        {
            if(array[i]%2==1)
            {
                arrayEven[j] = array[i];
                j +=1;
            }

        }
        return arrayEven;

    }

    static int [] divideTen(int [] array, int a)
    {
        int counter =0;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]%a==0)
            {
                counter=counter+1;
            }

        }
        if(counter==0){
            return null;
        }
        int [] arrayEven = new int[counter];

        for(int i=0, j=0;i< array.length;i++)
        {
            if(array[i]%a==0)
            {
                arrayEven[j] = array[i];
                j +=1;
            }

        }
        return arrayEven;

    }


  static void print(int [] array)
  {
      if (array==null){
          System.out.println("Нет массива отвечающего нужным параметрам");
          return;
      }

      for(int i=0; i< array.length; i++)
      {
          System.out.print(array[i] + " ");
      }
      System.out.println();
  }


  static int input(){

      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      return a;
  }

    public static void main(String[] args) {
        int [] array1 = generateRandomeArray(10);
        int [] array2 = generateRandomeArray(15);
        print(array1);
        print(array2);
        int [] filteredArray1 = filterEven(array1);
        int [] filteredArray2 = filterEven(array2);
        print(filteredArray1);
        print(filteredArray2);
        int [] filteredArray3 = filterOdd(array1);
        int [] filteredArray4 = filterOdd(array2);
        print(filteredArray3);
        print(filteredArray4);
        int [] filteredArray5 = divideTen(array1, input());
        print(filteredArray5);
    }

}