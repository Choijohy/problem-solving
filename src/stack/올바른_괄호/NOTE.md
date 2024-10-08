# [PS] 스택

#### Source
프로그래머스

https://school.programmers.co.kr/learn/courses/30/lessons/12909

#### Category
스택

## 📍 문제 요약
1. 주어진 문자열이 올바른 괄호인지 아닌지 판단<br>
   - "()()" 또는 "(())()" 는 올바른 괄호
   - ")()(" 또는 "(()(" 는 올바르지 않은 괄호

## 📍 풀이 접근
1. 스택에 '('일 때만, 요소를 저장
2. ')'가 등장하면 스택에서 pop
3. ')'가 등장했을 때, 스택이 비었거나 or 최종 결과가 빈 스택이 아닐 경우 올바르지 않은 괄호로 판단
   
## 📍 풀이 개선
다른 풀이를 보니, stack 자체를 사용하지 않고도 풀이 가능

1. '(' 등장 -> cnt ++
2. ')' 등장 -> cnt --
3. '(' 등장하여, cnt-- 한 결과가 음수가 되거나 or 최종 cnt의 값이 0이 아닌 경우 올바르지 않은 괄호로 판단


## 📍 기타 공부
### Stack 관련 메소드별 시간 복잡도

- push(): O(1)
- pop(): O(1)
- peek(): O(1)
- isEmpty: O(1)
- size(): O(1)
- search -> O(n)


