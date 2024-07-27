import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        return bfs(x, y, n);
    }
    
    public int bfs(int x, int y, int n) {
        Queue<ValueObject> q = new LinkedList<>();
        q.offer(new ValueObject(y, 0));
        
        while (!q.isEmpty()) {
            ValueObject vo = q.poll();
            int value = vo.getValue();
            
            if (value == x) return vo.getDepth();
            
            if (value-n >= x) q.offer(new ValueObject(value-n, vo.getDepth()+1));
            if (isInteger((double)value/2) && value/2 >= x) q.offer(new ValueObject(value/2, vo.getDepth()+1));
            if (isInteger((double)value/3) && value/3 >= x) q.offer(new ValueObject(value/3, vo.getDepth()+1));
        }
        
        return -1;
    }
    
    public boolean isInteger(double n) {
        return n%1 == 0.0;
    }
}

class ValueObject {
    int value;
    int depth;
    
    ValueObject(int value, int depth) {
        this.value = value;
        this.depth = depth;
    }
    
    int getValue() {
        return value;
    }

    int getDepth() {
        return depth;
    }
}