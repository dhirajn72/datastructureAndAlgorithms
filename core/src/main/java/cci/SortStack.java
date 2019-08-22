package cci;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 25/06/19
 */
public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(5);
        stack.push(9);
        stack.push(6);
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(1);
        System.out.println(stack);
        _sortStack(stack);



    }

    private static void _sortStack(Stack<Integer> stack) {
        Stack<Integer> res=new Stack<>();
        while (!stack.isEmpty()){
            int temp=stack.pop();
            while (!res.isEmpty() && res.peek()>temp)
                stack.push(res.pop());
            res.push(temp);

        }
        System.out.println(res);
    }
    /*
    res  = [1,2,3,5,6,8,9]
    temp=1/3/8/2/3/8/6/8/9/5
    stack= [9,8,6]

     */

}
