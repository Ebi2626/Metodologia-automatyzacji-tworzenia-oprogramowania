package pl.wszib.lab1;

public class MyClass {

    public static String staticName;
    protected static String staticName1;
    static String staticName2;
    private static String staticName3;


    public String name;
    protected String name1;
    String name2;
    private String name3;

    public void print(){
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

    }

    public static void printStatic(){
        System.out.println("Static: " + staticName);
        System.out.println("Static: " + staticName1);
        System.out.println("Static: " + staticName2);
        System.out.println("Static: " + staticName3);
    }
}
