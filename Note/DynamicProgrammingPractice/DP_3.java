import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int[] arr = new int[(int)Math.pow(2, numbers.length-1)];
        int size = 0;
        arr[size++] = numbers[0];
        for (int i=1; i<numbers.length; i++, size *= 2) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (int j=0; j<size; j++) {
                arr[j*2] = temp[j] - numbers[i];
                arr[j*2+1] = temp[j] + numbers[i];
            }
        }
        return (int)Arrays.stream(arr).filter(n -> Math.abs(n)==target).count();
    }
}
