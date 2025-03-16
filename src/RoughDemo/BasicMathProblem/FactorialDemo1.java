package RoughDemo.BasicMathProblem;

import java.util.ArrayList;
import java.util.List;

public class FactorialDemo1 {

    public static void fact(Long n, Long factorial, List<Long> list)
    {
        if (n == 0 || n == 1)
        {
            list.add(1L);
            return;
        }

        factorial *= n;
        fact(n - 1, factorial, list);
        list.add(factorial); // Add after recursive call to maintain order
    }

    public static void main(String[] args) {
        Long n = 10L;
        List<Long> list = new ArrayList<>();

        fact(n, 1L, list);

        for (Long value : list)
        {
            System.out.println(value);
        }
    }
}
