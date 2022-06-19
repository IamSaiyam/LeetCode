//saiyamhk
//41 / 41 test cases passed.
//Status: Accepted

public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products);
        String temp = "";
        for(int i=0; i<searchWord.length(); i++){
            temp += searchWord.charAt(i) + "";
            ans.add(new ArrayList<>());
            for(String s : products){
                if(s.startsWith(temp)){
                    ans.get(i).add(s);
                }
                if(ans.get(i).size() == 3) break;
            }
        }
        return ans;
    }
