class Solution {

    public static boolean isAnagram(char[] s1, char[] s2) {
        int alpha1[] = new int[26];
        int alpha2[] = new int[26];

        Arrays.fill(alpha1, 0);
        Arrays.fill(alpha2, 0);

        for (char c : s1)
            alpha1[c - 'a']++;
        for (char c : s2)
            alpha2[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if (alpha1[i] != alpha2[i])
                return false;

        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output_list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            if (map.containsKey(sortedStr)) {
                int index = map.get(sortedStr);
                output_list.get(index).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                output_list.add(group);
                map.put(sortedStr, output_list.size() - 1);
            }
        }

        return output_list;
    }
}
