package Offer11;

public class Solution2 {

    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right - 1) {
            int mid = (left + right) / 2;
            if (numbers[mid] > numbers[left] && numbers[mid] < numbers[right]) {
                return numbers[left];
            }
            if (numbers[mid] > numbers[left]) {
                left = mid;
            }
            else if (numbers[mid] < numbers[right]){
                right = mid;
            }
        }
        return numbers[right];
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] numbers = {3,4,5,1,2};
        System.out.println(solution2.minArray(numbers));
    }
}
