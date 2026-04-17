class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int L = 1;
        int R = 0;
        for(int p : piles) {
            R = Math.max(R, p);
        }
        int result = R;

        while(L <= R) {
            int mid = L + (R - L) / 2;

            if(canFinish(piles, h, mid)) {
                result = mid;
                //Try smaller speed
                R = mid - 1;
            } else {
                //Try faster speed
                L = mid + 1;
            }
        } 
        return result;
    }

    static boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for(int p : piles) {
            // The total number of hours needed to consume all bananas
            hours += (p + k - 1) / k; //Math.ceil
            // If total hours required is more than given hours, return false
            if (hours > h) return false;
        }
        // Return true if able to finish
        return hours <= h;
    }
}
