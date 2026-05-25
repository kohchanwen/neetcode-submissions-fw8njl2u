class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagramMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (anagramMap.containsKey(c)) {
                int count = anagramMap.get(c);
                anagramMap.replace(c, ++count);
            } else {
                anagramMap.put(c, 1);
            }
        }

        if (s.length() != t.length()) {
            return false;
        }
        for (int y = 0; y < t.length(); y++) {
            char c = t.charAt(y);
            if (!anagramMap.containsKey(c)) {
                return false;
            } else {
                int count = anagramMap.get(c);
                if (count > 1) {
                    anagramMap.replace(c, --count);
                } else {
                    anagramMap.remove(c);
                }
            }
        }
        return true;
    }
}
