package learn;

public class Demo03_StringConstructor {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);

        byte[] arr1 = {97, 98, 99};
        String s1 = new String(arr1);
        System.out.println(s1);

        byte[] arr2 = {97, 98, 99, 100};
        String s2 = new String(arr2, 1, 3);
        System.out.println(s2);

        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        String s3 = new String(arr3);
        System.out.println(s3);

        char[] arr4 = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s4 = new String(arr3, 1, 3);
        System.out.println(s4);

        String s5 = new String("heima");
        System.out.println(s5);
    }
}
