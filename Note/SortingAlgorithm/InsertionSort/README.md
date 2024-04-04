Insertion Sort [삽입 정렬]
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
> 선택된 원소를 이전 원소들과 비교해 해당 원소가 위치 할 곳을 탐색하는 정렬 알고리즘입니다.   
리스트의 처음부터 시작하여 끝까지 진행하며, 이 과정을 전체 리스트가 정렬될 때까지 반복합니다.   

Insertion Sort는 데이터를 '비교'하면서 찾기 때문에 **비교 정렬**이며, 입력된 순서의 영향을 미치지 않기에 **안정 정렬**이 가능하다.   
또한 데이터를 교환하는 과정에서 임시 변수를 필요로 하나, 이는 충분히 무시할 만큼 적은 양이기 때문에 **제자리 정렬**로 볼 수 있다.   
이는 선택정렬과도 같은 부분이다.

정렬 방법
----------------
- #### 초기 상태
|6|5|3|1|8|7|2|4|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|

- ##### 1회전
|${\textsf{\color{blue}6}}$|${\textsf{\color{red}5}}$|3|1|8|7|2|4|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|**3**|**1**|**8**|**7**|**2**|**4**|

- ##### 2회전
|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{blue}6}}$|${\textsf{\color{red}3}}$|1|8|7|2|4|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{blue}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{red}3}}$|**1**|**8**|**7**|**2**|**4**|
|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|**1**|**8**|**7**|**2**|**4**|

- ##### 3회전
|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{blue}6}}$|${\textsf{\color{red}1}}$|**8**|**7**|**2**|**4**|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{blue}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{red}1}}$|**8**|**7**|**2**|**4**|
|${\textsf{\color{blue}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{red}1}}$|**8**|**7**|**2**|**4**|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|**8**|**7**|**2**|**4**|

- ##### 4회전
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{blue}6}}$|${\textsf{\color{red}8}}$|**7**|**2**|**4**|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}8}}$|**7**|**2**|**4**|

- ##### 5회전
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{blue}8}}$|${\textsf{\color{red}7}}$|**2**|**4**|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{blue}6}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}7}}$|**2**|**4**|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|**2**|**4**|

- ##### 6회전
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{blue}8}}$|${\textsf{\color{red}2}}$|**4**|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{blue}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}2}}$|**4**|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{blue}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}2}}$|**4**|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{blue}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}2}}$|**4**|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{blue}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}2}}$|**4**|
|${\textsf{\color{blue}1}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}2}}$|**4**|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|**4**|

- ##### 7회전
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{blue}8}}$|${\textsf{\color{red}4}}$|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{blue}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}4}}$|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{blue}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}4}}$|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{blue}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}4}}$|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{blue}3}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|${\textsf{\color{red}4}}$|
|${\textsf{\color{lightgreen}1}}$|${\textsf{\color{lightgreen}2}}$|${\textsf{\color{lightgreen}3}}$|${\textsf{\color{lightgreen}4}}$|${\textsf{\color{lightgreen}5}}$|${\textsf{\color{lightgreen}6}}$|${\textsf{\color{lightgreen}7}}$|${\textsf{\color{lightgreen}8}}$|

- #### 오름차순 완성 상태
|1|2|3|4|5|6|7|8|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|

>##### 총 라운드는 (배열 크기 - 1) 번 진행되고,   
>##### 각 라운드별 비교 횟수는 배열의 따라 다르다.   
>##### 정렬이 되어 있는 경우엔 한번, 역순의 경우 라운드 수 만큼 비교한다.   
>##### ![InsertionSort](https://upload.wikimedia.org/wikipedia/commons/2/25/Insertion_sort_animation.gif)   

구현 코드
----------------
```java
public void insertionSort(int[] arr) {
  for (int i=1; i<arr.length; i++) {
    int temp = arr[i];
    int prev = i-1;
    while (prev >= 0 && arr[prev] > temp) {
      arr[prev+1] = arr[prev];
      prev --;
    }
    arr[prev+1] = temp;
  }
}
```
장점 및 단점
----------------
### [장점]
- 구현이 매우 간단하다.
- 추가적인 메모리 소비가 적다.
### [단점]
- 각 라운드 진행시 항상 인접한 두 원소를 비교하기에 다른 정렬에 비해 시간이 오래 걸린다.

> 일반적으로 자료의 교환 작업(SWAP)이 자료의 이동 작업(MOVE)보다 더 복잡하기 때문에   
버블 정렬은 단순성에도 불구하고 거의 쓰이지 않는다.

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
즉, 시간 복잡도는 O(N²)이다.

참조
----------------
- [https://st-lab.tistory.com/179](https://st-lab.tistory.com/179) - 자바 [JAVA] - 삽입 정렬 (Insertion Sort)
- [https://ko.wikipedia.org/wiki/%EB%B2%84%EB%B8%94_%EC%A0%95%EB%A0%AC](https://ko.wikipedia.org/wiki/%EB%B2%84%EB%B8%94_%EC%A0%95%EB%A0%AC) - 위키백과
