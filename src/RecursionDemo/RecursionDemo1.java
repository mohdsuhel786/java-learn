package RecursionDemo;

public class RecursionDemo1 {

    public static void func(int i,int n){
        if(i<= 0) return ;

        System.out.println(i);
        func(i-1,n);
    }

    public static void main(String[] args){
        int  n = 4;
        func(n,n);
    }
}
