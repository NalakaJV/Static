public class TestStatic {
    static int age;
    static void show() {
        System.out.println("This is static Method!!");
    }

    public static void main(String[] args) {
        age = 26;
        System.out.println("Age is " + age);
        show();
    }
}
