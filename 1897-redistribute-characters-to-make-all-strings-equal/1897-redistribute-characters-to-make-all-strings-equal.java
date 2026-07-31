class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==0){
            return true;
        }else{
        int n = words.length;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);

                }
                else{
                    map.put(ch,1);
                }
            }
        
        }
        
        for(char key : map.keySet()){
            int ele = map.get(key);
            
        
        if(ele % n != 0){
        return false;
        }
        
            }
            
    }
    return true;
    }}