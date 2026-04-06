class Solution {
    public int calPoints(String[] operations) {
        List<Integer> stack = new ArrayList<>();
        
        for(int i=0; i<operations.length; i++) {
            if (isInteger(operations[i])) {
                stack.add(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("+")) {
                // assuming there will always be 2 previous values
                stack.add(stack.get(stack.size()-1) + stack.get(stack.size()-2));
            }
            else if(operations[i].equals("D")) {
                stack.add(stack.get(stack.size()-1) * 2);
            }
            else if(operations[i].equals("C")) {
                stack.remove(stack.size()-1);
            }
            else continue;
        }
        int totalScore = stack.stream().mapToInt(Integer::intValue).sum();
        return totalScore;
    }

    public static boolean isInteger(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        int d = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
}