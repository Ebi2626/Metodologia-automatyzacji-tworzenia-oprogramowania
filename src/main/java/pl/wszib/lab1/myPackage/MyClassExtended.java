package pl.wszib.lab1.myPackage;

import pl.wszib.lab1.MyClass;

public class MyClassExtended extends MyClass {

    @Override
    public void print() {
        super.print();
        super.name = "zmienionyName";
        super.name1 = "zmienionyName1";
    }
}
