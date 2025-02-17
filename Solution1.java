class Solution {
    public int numTilePossibilities(String tiles) {
        Set<String> st=new HashSet<>();
        int n=tiles.length();
        boolean[] visited=new boolean[n];
        f(tiles,"",visited,st);
        return st.size()-1;
    }
    public void f(String tiles,String s,boolean[] visited,Set<String> st)
    {
        st.add(s);
        for(int i=0;i<tiles.length();i++)
        {
            if(!visited[i])
            {
                visited[i]=true;
                f(tiles,s+tiles.charAt(i),visited,st);
                visited[i]=false;
            }
        }
    }
}