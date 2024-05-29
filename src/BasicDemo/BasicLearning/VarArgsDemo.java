package BasicDemo.BasicLearning;

import java.util.Arrays;

public class VarArgsDemo {

    public static int add(int... nums){

        return Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {

        System.out.println(add(3,4,5));
    }
}
