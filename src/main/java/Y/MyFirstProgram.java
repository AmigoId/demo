package Y;

import Y.myfirstpackage.MyFirstPackage;

public class MyFirstProgram {
    public static void main(String[] s){
        MyFirstPackage second = new MyFirstPackage(1, 2);
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
        System.out.println(second.getY());
        System.out.println(second.getX());

    }
}
