package easy.twosum2;

class Solution {

    public int[] dd(int[] numbers, int target) {
        int left = numbers.length - 1;
        for (int right = 0; right < numbers.length; right++) {
            if (numbers[right] + numbers[left] == target) {
                return new int[] {++right, ++left};
            }
            left--;
        }

        return new int[] {};
    }
}