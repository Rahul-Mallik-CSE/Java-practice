package javapractice;

public class Main {

    public static void main(String[] args){
        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        char myGrade = 'A';
        System.out.println(myGrade);

        String myName = "John";
        System.out.println(myName);

        short myShort = 5000;
        System.out.println(myShort);

        long myLong = 150000L;
        System.out.println(myLong);

        double myDouble = 19.99d;
        System.out.println(myDouble);

        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}