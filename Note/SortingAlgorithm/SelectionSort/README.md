Selection Sort [선택 정렬]
=======================
<table><tr><td>
  
### 목차
<li><a href='#개념-학습'>개념 학습</a></li>
<li><a href='#정렬-방법'>정렬 방법</a></li>
<li><a href='#구현-코드'>구현 코드</a></li>
<li><a href='#장점-및-단점'>장점 및 단점</a></li>
<li><a href='#시간-복잡도'>시간 복잡도</a></li><br>
</td></tr></table>

개념 학습
----------------
> 선택한 인덱스에 가장 적합한 원소를 탐색하는 정렬 알고리즘입니다.   
리스트의 처음부터 시작하여 끝까지 진행하며, 이 과정을 전체 리스트가 정렬될 때까지 반복합니다.

SelectionSort는 데이터를 '비교'하면서 찾기 때문에 **비교 정렬**이며, 배열에 형태에 따라 입력 순서가 영향을 받기에 **불안정 정렬**이다.   
또한 데이터를 교환하는 과정에서 임시 변수를 필요로 하나, 이는 충분히 무시할 만큼 적은 양이기 때문에 **제자리 정렬**로 볼 수 있다.   
버블 정렬과 같이 구현이 비교적 쉽다.

정렬 방법
----------------
- #### 초기 상태
|6|8|4|2|10|
|:-:|:-:|:-:|:-:|:-:|

- ##### 1회전
|${\textsf{\color{red}6}}$|${\textsf{\color{blue}8}}$|**4**|**2**|**10**|
|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{red}6}}$|**8**|${\textsf{\color{blue}4}}$|**2**|**10**|
|${\textsf{\color{red}6}}$|**8**|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{blue}2}}$|**10**|
|${\textsf{\color{red}6}}$|**8**|**4**|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{blue}10}}$|
|${\textsf{\color{lightgreen}2}}$|**8**|**4**|**6**|**10**|

- ##### 2회전
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{red}8}}$|${\textsf{\color{blue}4}}$|**6**|**10**|
|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{red}8}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{blue}6}}$|**10**|
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{red}8}}$|${\textsf{\color{lightgreen}4}}$|**6**|${\textsf{\color{blue}10}}$|
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}4}}$|**8**|**6**|**10**|

- ##### 3회전
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{red}8}}$|${\textsf{\color{blue}6}}$|**10**|
|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{red}8}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{blue}10}}$|
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{lightgreen}6}}$|**8**|**10**|

- ##### 4회전
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{red}8}}$|${\textsf{\color{blue}10}}$|
|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{lightgreen}10}}$|

- #### 오름차순 완성 상태
|2|4|6|8|10|
|:-:|:-:|:-:|:-:|:-:|

>##### 총 라운드는 (배열 크기 - 1) 번 진행되고,   
>##### 각 라운드별 비교 횟수는 (배열 크기 - 라운드 횟수) 만큼 비교한다.   
>##### ![SelectionSort](https://upload.wikimedia.org/wikipedia/commons/b/b0/Selection_sort_animation.gif)   

구현 코드
----------------
```java
public void SelectionSort(int[] arr) {
  for (int i=0; i<arr.length; i++) {
    int idx = i;

    for (int j=i+1; j<arr.length; j++) {
      if (arr[j] < arr[idx]) idx = j;
    }

    int temp = arr[i];
    arr[i] = arr[idx];
    arr[idx] = temp;
  }
}
```
장점 및 단점
----------------
### [장점]
- 구현이 매우 간단하다.
- 추가적인 메모리 소비가 적다.
### [단점]
- 정렬 시간이 오래 걸린다.
- 불안정 정렬이다.

> ### Unstable Sort? (불안정 정렬)
>> ``[B1, B2, C, A] (A < B < C)`` 배열이 있다고 가정할 때   
1회전 종료 시 B1과 A의 위치를 바꾼다. ``[A, B2, C, B1]``   
2회전은 **B2**보다 작은 원소가 없기에 변동이 없다.   
3회전 및 오름차순 정렬이 완료된 배열은 ``[A, B2, B1, C]``로 B2와 B1의 위치가 바뀐다.

시간 복잡도
----------------
> Best, Average, Worst 모두 동일한 O(N²)의 시간 복잡도를 가진다.

N이 정렬해야하는 리스트의 자료 수, i가 라운드라고 가정을 하자.
|라운드|비교 횟수|
|:-:|:-:|
|**i = 1**|**(N-1)**|
|**i = 2**|**(N-2)**|
|**i = 3**|**(N-3)**|
|**⋮**|**⋮**|
|**i = (N-2)**|**2**|
|**i = (N-1)**|**1**|

즉, 다음과 같이 일반화하여 공식으로 만들 수 있다.   
<img src='https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcaPQ6R%2FbtqT7WpmfYi%2FFcUPJByWgOZe8ANHFKSe40%2Fimg.png' width='400'>   
그리고 N에 대하여 다음을 만족하기 때문에 시간복잡도 또한 도출 할 수 있다.   
<img src='https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FSkRlG%2FbtqT17EhBud%2FT7Dxz78bEkqUWMpZRoEwn1%2Fimg.png' width='150'>   
BubbleSort와 이론상 같은 시간복잡도를 갖고 있으나, 비교/수행이 상대적으로 적기 때문에 조금 더 빠르다.   

참조
----------------
- [https://st-lab.tistory.com/168](https://st-lab.tistory.com/168) - 자바 [JAVA] - 선택 정렬 (Selection Sort)
- [https://ko.wikipedia.org/wiki/%EC%84%A0%ED%83%9D_%EC%A0%95%EB%A0%AC](https://ko.wikipedia.org/wiki/%EC%84%A0%ED%83%9D_%EC%A0%95%EB%A0%AC) - 위키백과
