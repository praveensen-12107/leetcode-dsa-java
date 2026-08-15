class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map_s = new HashMap<>();
        HashMap<Character,Character> map_t = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map_s.containsKey(a) && map_s.get(a)!=b){
                return false;
            }
            if(map_t.containsKey(b)&& map_t.get(b)!=a){
                return false;
            }
            map_s.put(a,b);
            map_t.put(b,a);
        }
        return true;
        
    }
}