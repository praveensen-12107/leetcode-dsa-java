class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap <Character,Integer> smap = new HashMap<>();
        HashMap <Character,Integer> tmap = new HashMap<>();
        for( char ch : s.toCharArray()){
            if(smap.containsKey(ch)){
                smap.put(ch,smap.get(ch)+1);
            }
            else{
                smap.put(ch,1);
            }
        }
        for( char c : t.toCharArray()){
            if(tmap.containsKey(c)){
                tmap.put(c,tmap.get(c)+1);
            }
            else{
                tmap.put(c,1);
            }
        }
        for( char chh : smap.keySet()){
            if (!smap.get(chh).equals(tmap.get(chh))) {
                return false;
            }
        }
        return true;
        
    }
}