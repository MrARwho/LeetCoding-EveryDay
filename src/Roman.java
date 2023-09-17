import java.util.Stack;

public class Roman {
    public String longestCommonPrefix(String[] strs) {
        String mine="";
        int min=1000;
        boolean input=false;

        for (int k = 0;  k< strs.length;k++) {
            if (strs[k].length()<min){
                min = strs[k].length();
            }
        }
        System.out.println(min);
        for (int i =0 ; i<min ;i++){
            for (int j=0 ; j < strs.length ; j++){
                if(strs[0].charAt(i) == strs[j].charAt(i) ){
                    input = true;
                }
                else{
                    input = false;
                    break;
                }
            }
            if (input) {
                mine += strs[0].charAt(i);
            }
            else break;
        }
        return mine;
    }

    public Stack insertatend(int a , Stack <Integer> e ){
        if (e.isEmpty()){
            e.push(a);
            return e;
        }
        int x = e.pop();
        insertatend(a ,e);
        e.push(x);
        return e;
    }
}



