public class MyClass {
    public static void main(String args[]) {
      
      int result;
      
      for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                result = x * y;
                System.out.println(x + " x " + y + " = " + result);
            }
        }
      
    }
}