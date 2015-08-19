package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isreader= new InputStreamReader(System.in);
        BufferedReader reader1=new BufferedReader(isreader);
        String snum = reader1.readLine();
         int num=Integer.parseInt(snum);
        int i=0;
        int[] mas=new int[num];
        while (i<num)
        {
            String smas = reader1.readLine();
            mas[i]=Integer.parseInt(smas);
            i++;
        }
        int max=mas[0];
        for (i=1;i<num;i++)
        {
            if(max<=mas[i])
            {
                max=mas[i];
            }
        }

        //напишите здесь ваш код




        System.out.println(max);
    }
}
