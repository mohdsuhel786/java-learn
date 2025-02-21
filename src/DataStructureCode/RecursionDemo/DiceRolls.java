package DataStructureCode.RecursionDemo;

import java.util.ArrayList;

public class DiceRolls
{
    public static void main(String[] args)
    {
        int target = 4;
        int face = 6;
        // diceRoll("",target,face);
        System.out.println(diceRollRet("", target, face));

    }

    static void diceRoll(String p, int target, int face)
    {
        if (target == 0)
        {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++)
        {
            diceRoll(p + i, target - i, face);
        }
    }

    static ArrayList<String> diceRollRet(String p, int target, int face)
    {
        if (target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++)
        {
            list.addAll(diceRollRet(p + i, target - i, face));
        }
        return list;
    }
}
