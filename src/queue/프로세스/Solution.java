package queue.프로세스;

import java.util.*;

public class Solution {
     public static void main(String[] args){
         int[] priorities1 = new int[]{2, 1, 3, 2};
         int location1 = 2;
         int answer1 = 1;
         int result1 = new Solution().solution(priorities1, location1);
         PRINT_RESULT(1, result1, answer1);

         int[] priorities2 = new int[]{1, 1, 9, 1, 1, 1};
         int location2 = 0;
         int answer2 = 5;
         int result2 = new Solution().solution(priorities2, location2);
         PRINT_RESULT(2, result2, answer2);
    }
    public static void PRINT_RESULT(int index, int result, int answer){
         boolean correct = result == answer;
         StringBuilder sb = new StringBuilder();
         sb.append("\n\n테스트 케이스 ").append(index).append(": ");
         sb.append(correct ? "정답" : "오답").append("\n");
         sb.append("\t- 실행 결과: \t").append(result).append("\n");
         sb.append("\t- 기댓값: \t").append(answer).append("\n");
         if (correct) System.out.println(sb);
         else throw new RuntimeException(sb.toString());
    }

    public int solution(int[] priorities, int location){
         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

         for (int e:priorities){
             pq.add(e);
         }

         int answer = 0;
         while (!pq.isEmpty()){
             for (int i=0; i<priorities.length; i++){
                 if (priorities[i] == pq.peek()){
                     pq.poll();
                     answer++;
                     if (i==location){
                     return answer;
                    }
                 }
             }
         }
         return answer;
    }
}
