package streams;

interface A {
    void kill();
    default void show(){
        System.out.println("A's show");
    }
}

class MyClass implements A {
    // Compilation error unless we override
    public void show() {
        System.out.println("Resolved conflict manually");
    }

     public void kill(){
        System.out.println("has");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.kill();
        obj.show();
    }
}



