package RoughDemo.BasicMathProblem;

public class RecursionBacktrack {

    public static void func(int i, int n){
        if(i>n) return;

        func(i+1,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        int n = 4;
        func(1,4);
    }

}
