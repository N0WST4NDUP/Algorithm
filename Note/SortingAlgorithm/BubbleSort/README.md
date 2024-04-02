Bubble Sort [버블 정렬]
=======================
> 인접한 두 원소를 비교하여 순서가 바뀌어있으면 서로 교환하는 정렬 알고리즘입니다.   
리스트의 끝부터 시작하여 첫 원소까지 진행하며, 이 과정을 전체 리스트가 정렬될 때까지 반복합니다.

이러한 과정이 거품(Bubble)이 수면 위로 올라오는 것 같다고 해서 **BubbleSort**라는 이름이 붙었다고 한다.   
정렬 방식 중 비교적 쉽게 구현이 가능하며, 데이터를 '비교'하면서 찾기 때문에 **비교 정렬**이다.   
또한 데이터를 교환하는 과정에서 임시 변수를 필요로 하나, 이는 충분히 무시할 만큼 적은 양이기 때문에 **제자리 정렬**로 볼 수 있다.   
이는 선택정렬과도 같은 부분이다.

정렬 방법
----------------

구현 코드
----------------
```java
public void bubbleSort(int[] arr) {
  for (int i=1; i<arr.length; i++) {
    for (int j=0; j<arr.length-i; j++) {
      if (arr[j]>arr[j+1]) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
}
```
장점 및 단점
----------------

시간 복잡도
----------------

참조
----------------
- [https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html](https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html) - [알고리즘] 버블 정렬(bubble sort)이란
- [https://ko.wikipedia.org/wiki/%EB%B2%84%EB%B8%94_%EC%A0%95%EB%A0%AC](https://ko.wikipedia.org/wiki/%EB%B2%84%EB%B8%94_%EC%A0%95%EB%A0%AC) - 위키백과
