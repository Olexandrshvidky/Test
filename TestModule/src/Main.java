public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setDynamicField(2);
        System.out.println(myClass.getDynamicField());
        System.out.println(myClass.getStaticField());
        myClass.setStaticField(3);

        MyClass myClass2 = new MyClass();


        myClass2.setDynamicField(4);
        myClass.setDynamicField(5);
        System.out.println(myClass2.getDynamicField());


        System.out.println(myClass2.getStaticField());

        System.out.println("Done.");
    }
}
