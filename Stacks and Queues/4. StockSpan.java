//Stock Span
//Try First, Check Solution later
//1. You should first read the question and watch the question video.
//2. Think of a solution approach, then try and submit the question on editor tab.
//3. We strongly advise you to watch the solution video for prescribed approach.
//Question
//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing the prices of a share on n days.
//3. You are required to find the stock span for n days.
//4. Stock span is defined as the number of days passed between the current day and the first day before today when price was higher than today.
//
//e.g.
//for the array [2 5 9 3 1 12 6 8 7]
//span for 2 is 1
//span for 5 is 2
//span for 9 is 3
//span for 3 is 1
//span for 1 is 1
//span for 12 is 6
//span for 6 is 1
//span for 8 is 2
//span for 7 is 1
//Input Format
//Input is managed for you
//Output Format
//Output is managed for you
//Constraints
//0 <= n < 10^5
//-10^9 <= a[i] <= 10^9
//Sample Input
//4327
//-919325727
//-1581140995
//-901396450
//172701187
//447634619
//938497111
//571307354
//616684488
//194547094
//1437359261
//-615833113
//288339246
//-1646321864
//-1366493808
//819627191
//-413567688
//-98237776
//-370728508
//-1809411469
//2008843847
//-1464945014
//454352074
//-1231284269
//1701984227
//-622142659
//955025553
//1140532528
//636585147
//1821055720
//-1485353719
//-1038409898
//-904350486
//-1290315715
//-1229238776
//-1617000033
//1790468219
//1662015677
//1465441137
//-313467588
//-1100114385
//290872869
//1879572370
//-1900412459
//-953079171
//702243624
//402001870
//-1290257579
//-136416551
//-1863323811
//1205412731........
// 
// _______________________________________________---

import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
  }

  public static int[] solve(int[] arr) {
    int[] span = new int[arr.length];

    Stack<Integer> st = new Stack<>();
    st.push(0);
    span[0] = 1;

    for (int i = 1; i < arr.length; i++) {
      while(st.size() > 0 && arr[i] > arr[st.peek()]){
        st.pop();
      }

      if(st.size() == 0){
        span[i] = i + 1;
      } else {
        span[i] = i - st.peek();
      }

      st.push(i);
    }

    return span;
  }

}