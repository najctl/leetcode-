package easy.twosum2;

class Solution {

    public int[] dd(int[] numbers, int target) {
        int left = numbers.length - 1;
        int right =0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[right] + numbers[left] == target) {
                return new int[] {++right, ++left};
            } else if (numbers[right] + numbers[left] > target) {
                left--;
            }else {
                right++;
            }
        }

        return new int[] {};
    }
}