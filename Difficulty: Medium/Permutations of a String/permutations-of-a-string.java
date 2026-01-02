class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        HashSet<String> set = new HashSet<>();
        permutations("", s, set);

        ArrayList<String> res = new ArrayList<>(set);
        Collections.sort(res);   // GFG expects sorted output
        return res;
    }
    public static void permutations(String p,String s,HashSet<String> set){
        if(s.isEmpty()){
            set.add(p);
            return;
        }
        char ch=s.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String h=p.substring(i,p.length());
            permutations(f+ch+h,s.substring(1),set);
        }
    }
}