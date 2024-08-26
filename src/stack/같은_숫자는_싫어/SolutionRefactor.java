package stack.같은_숫자는_싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SolutionRefactor {
    public static void main(String[] args) {

        int[] arr1 = {1,1,3,3,0,1,1};
        int[] result1 = new SolutionRefactor().solutionRefactor(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {4,4,4,3,3};
        int[] result2 = new SolutionRefactor().solutionRefactor(arr2);
        System.out.println(Arrays.toString(result2));

    }

    public int[] solutionRefactor(int []arr) {
        List<Integer> answer = new ArrayList<>();

        int preNum = arr[0];
        answer.add(preNum);
        for (int i=1; i < arr.length; i++){
            if (arr[i] != preNum){
                preNum = arr[i];
                answer.add(preNum);
            }
        }


        int[] output = new int[answer.size()];
        for (int i=0; i<answer.size(); i++){
            output[i] = answer.get(i);
        }

        return output;
    }
}
