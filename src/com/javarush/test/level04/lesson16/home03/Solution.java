package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        InputStreamReader isreader= new InputStreamReader(System.in);
        BufferedReader reader1=new BufferedReader(isreader);
        int num=0;
        int sum=0;
        while (num!=-1) {
            String snum = reader1.readLine(); //Напишите тут ваш код
            num=Integer.parseInt(snum);
            sum+=num;
        }
        System.out.print(sum);

    }
}
