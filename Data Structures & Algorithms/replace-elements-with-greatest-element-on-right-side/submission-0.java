class Solution {
    public int[] replaceElements(int[] arr) {
        int largest = arr[arr.length-1];
        for(int i=arr.length-1; i>=0; i--) {
          int current = arr[i];
          arr[i] = largest;
          if (current > largest) {
            largest = current;
          }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}