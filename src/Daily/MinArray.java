package Daily;

/**
 * @author grady
 * @date 2020 20-7-22 下午3:38
 */
public class MinArray {

    public static void main(String[] args) {
        MinArray minArray = new MinArray();
        int[] numbers = {1,2,5};
        System.out.println(minArray.solution(numbers));
    }
    public int solution(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;

        while (left < right){
            int curr = left + (right - left)/2;
            if (numbers[curr] < numbers[right]){
                right = curr;
            }else if (numbers[curr] > numbers[right]){
                left = curr + 1;
            }else {
                right --;
            }
        }
        return numbers[left];
    }
}
