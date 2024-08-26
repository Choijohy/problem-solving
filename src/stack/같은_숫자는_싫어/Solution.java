package stack.같은_숫자는_싫어;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int[] arr1 = {1,1,3,3,0,1,1};
        int[] result1 = new Solution().solution(arr1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {4,4,4,3,3};
        int[] result2 = new Solution().solution(arr2);
        System.out.println(Arrays.toString(result2));

    }

    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();

        for (int i=arr.length-1; i>-1; i--){
            stack.add(arr[i]);
        }


        int previous = stack.pop();
        answer.add(previous);

        for (int i=1; i<arr.length; i++){
            int current = stack.pop();
            if (previous != current){
                answer.add(current);
                previous = current;
            }
        }
        int[] output = new int[answer.size()];
        for (int i=0; i<answer.size(); i++){
            output[i] = answer.get(i);
        }

        return output;
    }
}
