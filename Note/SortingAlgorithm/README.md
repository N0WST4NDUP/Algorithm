
<div align='center'>
  <h3>정렬 별 장단점</h3>
  <table border="1">
    <tr>
      <th>정렬 종류</th>
      <th>장점</th>
      <th>단점</th>
    </tr>
    <tr>
      <td align='center'><a href="./BubbleSort/">버블 정렬</a></td>
      <td><li>구현이 간단하다.</li></td>
      <td><li>정렬 시간이 오래 걸린다.</li></td>
    </tr>
    <tr>
      <td align='center'><a href="./">삽입 정렬</a></td>
      <td><li>최선의 경우 <b>O(n)</b>으로 정렬이 가능하다.</li></td>
      <td><li>최악의 경우 <b>O(n²)</b>이 걸린다.</li></td>
    </tr>
    <tr>
      <td align='center'><a href="./">선택 정렬</a></td>
      <td><li>구현이 간단하다.</li><li>비교하는 횟수에 비해 교환이 적게 일어난다.</li></td>
      <td><li>정렬 시간이 오래 걸린다.</li></td>
    </tr>
    <tr>
      <td align='center'><a href="./">병합 정렬</a></td>
      <td><li>항상 <b>O(n log n)</b>으로 일정한 속도로 정렬된다.</li></td>
      <td><li>추가적인 메모리 공간이 필요하다.</li></td>
    </tr>
    <tr>
      <td align='center'><a href="./">퀵 정렬</a></td>
      <td><li>평균 실행시간 <b>O(n log n)</b>으로 빠른 편이다.</li></td>
      <td><li>Pivot에 따라서 성능의 차이가 심하다.</li><li>최악의 경우 <b>O(n²)</b>이 걸리게 된다.</li></td>
    </tr>
    <tr>
      <td align='center'><a href="./">힙 정렬</a></td>
      <td><li>항상 <b>O(n log n)</b>으로 빠른 편이다.</li></td>
      <td><li>다른 <b>O(n log n)</b>의 정렬법보다 오래 걸린다.</li></td>
    </tr>
    <tr>
      <td align='center'><a href="./">기수 정렬</a></td>
      <td><li><b>O(n)</b> 속도로 굉장히 빨리 정렬할 수 있다.</li></td>
      <td><li>추가적인 데이터가 굉장히 많이 필요하다.</li><li>데이터 타입이 항상 일정해야 한다.</li><li>구현을 위한 조건이 많이 붙는다.</li></td>
    </tr>
  </table>

  <h3>시간 복잡도 & 공간 복잡도</h3>
  <table border="1">
    <tr align='center'>
      <th rowspan='2'>정렬 종류</th>
      <th colspan='3'>시간 복잡도</th>
      <th rowspan='2'>공간 복잡도</th>
    </tr>
    <tr align='center'>
      <th>평균(Average)</th>
      <th>최선(Best)</th>
      <th>최악(Worst)</th>
    </tr>
    <tr align='center'>
      <td><a href="./BubbleSort/">버블 정렬</a></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n)</b></td>
    </tr>
    <tr align='center'>
      <td><a href="./">삽입 정렬</a></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n)</b></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n²)</b></td>
    </tr>
    <tr align='center'>
      <td><a href="./">선택 정렬</a></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n²)</b></td>
    </tr>
    <tr align='center'>
      <td><a href="./">병합 정렬</a></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
    </tr>
    <tr align='center'>
      <td><a href="./">퀵 정렬</a></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n²)</b></td>
      <td><b>O(n log n)</b></td>
    </tr>
    <tr align='center'>
      <td><a href="./">힙 정렬</a></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
      <td><b>O(n log n)</b></td>
    </tr>
    <tr align='center'>
      <td><a href="./">기수 정렬</a></td>
      <td><b>O(dn)</b></td>
      <td><b>O(dn)</b></td>
      <td><b>O(dn)</b></td>
      <td></td>
    </tr>
  </table>
</div>
