public class A21 {
 
    // عند إستدعاءها نعطيها عددين فترجع ناتج جمع هذين العددين sum هنا قمنا بتعريف دالة إسمها
    public static int sum(int a, int b) {
        return a+b;
    }
 
 
    public static void main(String[] args) {
        // لحساب ناتج جمع العددين 5 و 10 sum هنا قمنا باستدعاء الدالة
        System.out.println( "5 + 10 = " + sum(10, 5) );
    }
 
}
