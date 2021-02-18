public class Solution {
    public static double min(double[] arr) {
        double min  = max(arr);

        for(int i = 0; i < arr.length; ++i) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static double max(double[] arr) {
        double max = 0.0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            sum += arr[i];
        }
        return sum;
    }

    public static boolean checkBalance(int[] arr) {
        int leftDigitsSum = 0;
        int sum = sum(arr);
        for(int i = 0; i < arr.length; ++i) {
            leftDigitsSum += arr[i];
            sum -= arr[i];
            if(leftDigitsSum == sum) {
                return true;
            }
        }
        return false;
    }

    public static int[] arrShift(int[] arr, int n) {
        if(n < 0) {
            n *= -1;
        } else if(n > 0) {
            for(int i = 0; i < n; ++i) {
                int temp2 = arr[0];
                for(int j = 0; j < arr.length; ++j) {
                    int temp = arr[i];
                    arr[i] = temp2;
                    temp2 = temp;
                }
                arr[0] = temp2;
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        //first task
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }

        //second task
        int k = 0;
        int[] anotherArr = new int[8];
        for (int i = 0; i < anotherArr.length; ++i) {
           anotherArr[i] = k;
           k = k + 3;
        }

        //third task
        int[][] twoDimArr = new int[10][10];
        for(int i = 0; i < 10; ++i) {
                twoDimArr[i][i] = 1;
        }

    }
}
