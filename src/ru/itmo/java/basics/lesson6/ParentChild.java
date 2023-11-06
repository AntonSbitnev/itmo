package ru.itmo.java.basics.lesson6;
import java.util.Scanner;
public class ParentChild {


    public static class ParentClass {
        public int num;

        public static void main (String[] args) {
            ParentClass Obj = new ParentClass();
            Obj.getNumber();

            ChildClass subObject = new ChildClass();
            subObject.displayNumber(Obj);
        }
        public void getNumber() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");
            num = scanner.nextInt();
        }
    }
    public static class ChildClass {
        public void displayNumber(ParentClass Obj) {
            System.out.println("Введенное число: " + Obj.num);
        }
    }
}
