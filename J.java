public class J implements A, I {

    private double j = 100.500;

    private int e = 42;

    public int af() {
        return -1;
    }

    public float ff() {
        return 0;
    }

    public void bb() {
        System.out.println(getClass().getName());
    }

    public Object pp() {
        return this;
    }

    public void aa() {
        System.out.println("void aa");
    }

    public Object rr() {
        return null;
    }

    public Object gg() {
        return return getClass().getClassLoader();
    }
}
