import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Queue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int i=0; i<score.length; i++) {
            pq.offer(new Student(score[i][0], score[i][1], i));
        }
        
        Student temp = pq.poll();
        int rank = 1;
        answer[temp.getIdx()] = rank++;
        while (!pq.isEmpty()) {
            Student curr = pq.poll();
            
            answer[curr.getIdx()] = curr.compareTo(temp) == 0 ? answer[temp.getIdx()] : rank;
            rank++;
            
            temp = curr;
        }
        
        return answer;
    }
}

class Student implements Comparable<Student> {
    
    double avg;
    int idx;
    
    Student(int eng, int math, int idx) {
        this.avg = (double)(eng+math)/2;
        this.idx = idx;
    }
    
    double getAvg() {
        return avg;
    }
    
    int getIdx() {
        return idx;
    }
    
    @Override
    public int compareTo(Student target) {
        if (this.avg == target.getAvg()) return 0;
        else return this.avg < target.getAvg() ? -1 : 1;
    }
    
}