class Solution {
    public int mostWordsFound(String[] sentences) {
        int len = sentences.length;
        int longest = 0;
        for(int i = 0 ; i< len ; i++){
            int size = (int)sentences[i].chars().filter(ch -> ch == ' ').count();
            if(size > longest){
                longest = size;
            }
        }
        return longest + 1;
    }
}