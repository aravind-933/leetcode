class Solution {
    public int mostWordsFound(String[] sentences) {
        int count =0;
        int max =0;
        for(int i =0;i<sentences.length;i++) {
            count =1;
            for(int j =0;j<sentences[i].length();j++) {
                char ch = sentences[i].charAt(j);
                if(ch == ' ') {
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}