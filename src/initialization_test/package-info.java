/**
 * 
 */
/**
 * @author asusy
 *
 */
package initialization_test;
class TestThis {
    static int test1() {
        int j = 1;
        return j;
    }
    static int test2(int i) {
        i = test1() + test1() + i;
        return i;
    }
    public static void main(String[] args) {
        System.out.println("This is : " + test2(1));
    }
}