package hash.완주하지_못한_선수;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        String[] participant1 = new String[]{"leo", "kiki", "eden"};
        String[] completion1 = new String[]{"eden", "kiki"};
        String answer1 = "leo";
        String result1 = new Solution().solution(participant1, completion1);
        PRINT_RESULT(1, result1, answer1);

        String[] participant2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};
        String answer2 = "vinko";
        String result2 = new Solution().solution(participant2, completion2);
        PRINT_RESULT(2, result2, answer2);

        String[] participant3 = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = new String[]{"stanko", "ana", "mislav"};
        String answer3 = "mislav";
        String result3 = new Solution().solution(participant3, completion3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, String result, String answer) {
        boolean correct = result.equals(answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> p_hm = new HashMap<>();
        HashMap<String,Integer> c_hm = new HashMap<>();

        // 참가자, 완주자 hashMap 생성
        for (int i =0; i<completion.length; i++){
            p_hm.put(participant[i],p_hm.getOrDefault(participant[i],1)+1);
            c_hm.put(completion[i],c_hm.getOrDefault(completion[i],1)+1);
        }

        p_hm.put(participant[participant.length-1],p_hm.getOrDefault(participant[participant.length-1],0)+1);

        String key;
        Integer value;
        // 참가자 hashMap에서 완주자 제하기
        for (Map.Entry<String,Integer> entry:p_hm.entrySet()){
            key = entry.getKey();
            value = entry.getValue();
            if (c_hm.containsKey(key)){
                if (value > 1 && (c_hm.get(key) - value) < 0){
                    answer = key;
                    break;
                }
            } else{
                answer = key;
                break;
            }
        }
        return answer;
    }
}