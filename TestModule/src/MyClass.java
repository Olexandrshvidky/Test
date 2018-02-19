public class MyClass {
    static private int staticField = 1;
    private int dynamicField;

    public /*static*/ int getStaticField() {
        return staticField;
    }

    public /*static*/ void setStaticField(int staticField) {
        MyClass.staticField = staticField;
    }

    public int getDynamicField() {
        return dynamicField;
    }

    public void setDynamicField(int dynamicField) {
        this.dynamicField = dynamicField;
    }
}
