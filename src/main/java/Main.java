import java.util.Scanner;
import HomeWork_1.*;
import lesson2.Task1;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.repeatStr(7));
    }
}