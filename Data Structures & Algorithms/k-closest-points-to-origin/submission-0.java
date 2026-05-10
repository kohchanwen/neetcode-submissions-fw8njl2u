class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(
            (a, b) -> { 
                int distanceA = distance(a[0], a[1]);
                int distanceB = distance(b[0], b[1]);

                return distanceA - distanceB;
            }
        );
        for (int[] point : points) {
            minHeap.offer(point);
        }
        int[][] result = new int[k][2];
        for (int i=0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }

    private int distance(int x, int y) {
        return x * x + y * y;
    }
}
