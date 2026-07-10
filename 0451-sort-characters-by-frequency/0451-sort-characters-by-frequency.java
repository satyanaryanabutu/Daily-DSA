class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
  //      ArrayList<Character> arr=new ArrayList<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        ArrayList<Character> arr=new ArrayList<>(map.keySet());
        Collections.sort(arr,(a,b) -> map.get(b) -map.get(a));
        StringBuilder str=new StringBuilder();
        for(char c:arr){
            int freq=map.get(c);
            while(freq>0){
                str.append(c);
                freq--;

            }
        }
        return str.toString();


    }
}