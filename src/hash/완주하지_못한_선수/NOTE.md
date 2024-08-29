# [PS] 해시

#### Source
프로그래머스

https://school.programmers.co.kr/learn/courses/30/lessons/42576
#### Category
해시

## 📍 문제 요약
1. 참가자 명단, 완주자 명단이 배열로 주어짐

2. 미완주자의 이름 반환

## 📍 풀이 접근
1. 2개의 배열을 토대로, 참가자용/완주자용 hashMap 생성
2. 참가자 해시맵을 순회하며, 
   - 완주자용 해시맵에 해당 키가 있는가? --> 없으면 미완주자<br>
   - 키가 있다면, value값이 같은가? --> valuer값이 더 적다면 해당 키값이 미완주자<br>

   
** 주의) 동명이인이 있을 경우를 고려하여, 단순히 키 값 유무로 비교하면 안됨<br>

## 📍 풀이 개선

## 📍 기타 공부

### hashMap 순회
- 람다식을 사용한 forEach문을 사용하는 경우, 중간에 loop 탈출이 어려움
```
   my_hm.forEach((key,value)->{})
```
- break문을 통해, loop를 탈출하고 싶은 경우, 전통적인 for문 사용

```
   HashMap<String,Integer> hm = new HashMap<>();
   
   for (Map.Entry<String,Integer> entry:hm.entrySet()){
      if (...){
         break;
         }
   }
   
```

