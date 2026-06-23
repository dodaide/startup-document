public class SumOfArrayPlusOne {
    /**
     * Tổng các phần tử mảng số nguyên cộng thêm độ dài mảng (tương đương bản C#).
     */
    public int sumOfIntegers(int[] integerArray) {
        int sum = 0;
        for (int item : integerArray) {
            sum += item;
        }
        return sum + integerArray.length;
    }
}
