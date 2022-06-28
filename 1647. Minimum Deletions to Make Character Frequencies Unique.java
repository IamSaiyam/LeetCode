//saiyamhk
//103 / 103 test cases passed.
//Status: Accepted

class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c) + 1);
            else map.put(c, 1);
        }
        int[] arr = new int[map.size()];
        int index = 0;
        int ans = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            arr[index] = entry.getValue();
            index++;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1; i>=0; i--){
            for(int j=0; j<arr.length; j++){
                if(i!=j && arr[i] == arr[j] && arr[i]!=0){
                    arr[j]--;
                    ans++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return ans;
    }
}
