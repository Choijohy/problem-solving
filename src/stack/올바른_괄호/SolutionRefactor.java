package stack.올바른_괄호;

import java.util.Stack;

class SolutionRefactor {
    public static void main(String[] args) {
        String s1 = "()()";
        boolean answer1 = true;
        boolean result1 = new SolutionRefactor().solution(s1);
        PRINT_RESULT(1, result1, answer1);

        String s2 = "(())()";
        boolean answer2 = true;
        boolean result2 = new SolutionRefactor().solution(s2);
        PRINT_RESULT(2, result2, answer2);

        String s3 = ")()(";
        boolean answer3 = false;
        boolean result3 = new SolutionRefactor().solution(s3);
        PRINT_RESULT(3, result3, answer3);

        String s4 = "(()(";
        boolean answer4 = false;
        boolean result4 = new SolutionRefactor().solution(s4);
        PRINT_RESULT(4, result4, answer4);
    }

    public static void PRINT_RESULT(int index, boolean result, boolean answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    boolean solution(String s) {
        char[] characters = s.toCharArray();
        int cnt = 0;
        boolean ans = false;
        for (int i=0; i<characters.length; i++){
            char c = characters[i];

            if(c=='('){
                cnt ++;
            }
            else if (c==')'){
                cnt --;
            }

            if (cnt < 0) break;
        }

        if (cnt == 0) ans = true;

        return ans;
    }
}