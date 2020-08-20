//Balanced Brackets
//Try First, Check Solution later
//1. You should first read the question and watch the question video.
//2. Think of a solution approach, then try and submit the question on editor tab.
//3. We strongly advise you to watch the solution video for prescribed approach.
//Question
//1. You are given a string exp representing an expression.
//2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.
//
//e.g.
//[(a + b) + {(c + d) * (e / f)}] -> true
//[(a + b) + {(c + d) * (e / f)]} -> false
//[(a + b) + {(c + d) * (e / f)} -> false
//([(a + b) + {(c + d) * (e / f)}] -> false
//Input Format
//A string str
//Output Format
//true or false
//Constraints
//0 <= str.length <= 100
//Sample Input
//[(a + b) + {(c + d) * (e / f)}]
//Sample Output
//true
//
//-------------------------------------------------------------

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ''('' || ch == ''{'' || ch == ''['') {
                st.push(ch);
            } else if (ch == '')'') {
                if (st.size() == 0 || st.peek() != ''('') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == ''}'') {
                if (st.size() == 0 || st.peek() != ''{'') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else if (ch == '']'') {
                if (st.size() == 0 || st.peek() != ''['') {
                    System.out.println(false);
                    return;
                } else {
                    st.pop();
                }
            } else {
                // nothing
            }
        }

        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}