class Solution {

    boolean find(char ch){
        if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public boolean halvesAreAlike(String s) {

        int i =0;
        int j=s.length()-1;
        int val1=0;
        int val2=0;

        while(i<j){
            char ch1 =s.charAt(i);
            char ch2 =s.charAt(j);

            if(find(ch1)){
                val1++;
            }
            if(find(ch2)){
                val2++;
            }
            i++;
            j--;
        }
        return val1==val2;


    }
}