package pl.wszib.lab1;

import pl.wszib.lab1.myPackage.MyClassExtended;
import pl.wszib.lab1.myPackage.MyPackageClass;

public class Main {

    public static void main(String[]args){
        System.out.println("Hello world\n");


        MyClass myClass = new MyClass();
        myClass.name = "Stefan";
        myClass.name1 = "Fred";
        myClass.name2 = "John";

        myClass.print();

        MyClass myClass1 = new MyClass();

        MyPackageClass myPackageClass = new MyPackageClass();
        myPackageClass.name = "Stefan";
        myPackageClass.print();

        MyClass myClassExtended = new MyClassExtended();
        MyClassExtended myClassExtended2 = new MyClassExtended();

    }
}
