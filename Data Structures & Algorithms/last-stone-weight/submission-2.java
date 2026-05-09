class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Max heap
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            int largest = pq.poll(); // remove and return largest
            int secondLargest = pq.poll(); // remove and return second largest
            if (largest > secondLargest) {
               pq.offer(largest - secondLargest);
            } 
        }
        return pq.peek() != null ? pq.peek() : 0;

    }
}
