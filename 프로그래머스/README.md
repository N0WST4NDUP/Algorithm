[![background](./background.png)](https://programmers.co.kr/)
# Navigation

## Level
> 프로그래머스에서 선정한 Level을 기준으로 분류
- ### [level1](./1)
- ### [level2](./2)
- ### [level3](./)

## MyFavorite
> 개인적으로 정말 재미있게 풀었던 문제
- ### [2️⃣ [PCCP 기출문제] 석유 시추](https://github.com/N0WST4NDUP/Algorithm/tree/main/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4/2/250136.%E2%80%85%EF%BC%BBPCCP%E2%80%85%EA%B8%B0%EC%B6%9C%EB%AC%B8%EC%A0%9C%EF%BC%BD%E2%80%852%EB%B2%88%E2%80%85%EF%BC%8F%E2%80%85%EC%84%9D%EC%9C%A0%E2%80%85%EC%8B%9C%EC%B6%94)
> **_BFS / DFS**   
`BFS와 DFS에 대해 더 깊게 탐구해볼 수 있어서 재밌었다.`
- ### [1️⃣ [2022 KAKAO BLIND RECRUITMENT] 신고 결과 받기](https://github.com/N0WST4NDUP/Algorithm/tree/main/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4/1/92334.%E2%80%85%EC%8B%A0%EA%B3%A0%E2%80%85%EA%B2%B0%EA%B3%BC%E2%80%85%EB%B0%9B%EA%B8%B0)
> `실무에서 비슷한 알고리즘이 자주 쓰일 것 같아 재밌게 풀었다.`
- ### [1️⃣ [2022 KAKAO TECH INTERNSHIP] 성격 유형 검사하기](https://github.com/N0WST4NDUP/Algorithm/tree/main/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4/1/118666.%E2%80%85%EC%84%B1%EA%B2%A9%E2%80%85%EC%9C%A0%ED%98%95%E2%80%85%EA%B2%80%EC%82%AC%ED%95%98%EA%B8%B0)
> `Enum 클래스를 공부하면서 재밌게 풀었다.`
- ### [2️⃣ 귤 고르기](https://github.com/N0WST4NDUP/Algorithm/tree/main/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4/2/138476.%E2%80%85%EA%B7%A4%E2%80%85%EA%B3%A0%EB%A5%B4%EA%B8%B0)
> **_Greedy**   
`복잡한 로직보다, 심플하고 로지컬한 알고리즘을 짜고 싶어 고민 했던 과정이 재밌었다.`


## Inspirational
> 색다른 접근 방식에 소름 돋아서 저장하려고 만든 탭   
> 링크의 경우 문제와 내가 푼 답이 있으며, 아래의 코드는 다른 사람이 푼 답이다.
##### [0️⃣ 문자열 밀기](./0/120921. 문자열 밀기)
```java
class Solution {
    public int solution(String A, String B) {
        String tempB = B.repeat(3);
        return tempB.indexOf(A);
    }
}
```
##### [0️⃣ 세균 증식](./0/120910. 세균 증식)
> 비트연산자 활용
```java
class Solution {
    public int solution(int n, int t) {
        return n << t;
    }
}
```
