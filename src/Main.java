import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        /*int[] nodes ={1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        SolutionTrees mytree = new SolutionTrees();
        TreeNode Root;
        Root = mytree.buildTree(nodes);
        System.out.println(mytree.inorderTraversal(Root));*/
        String s = "hello", t = "lolhe";
        Boolean ans;

        char[]s2 = s.toCharArray();
        char[]t2 = t.toCharArray();

        Arrays.sort(t2);
        Arrays.sort(s2);

        s = new String(s2);
        t = new String(t2);
        System.out.println(t);
        System.out.println(s);

        if (t.equals(s)){
            ans = true;
        }
        else
            ans=false;

        System.out.println(ans);







    }
}