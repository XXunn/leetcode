package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class simplifyPath {

    public String simplifyPath(String path) {
        String ans = "";
        String[] split = path.split("/");
        Deque<String> strings = new ArrayDeque<String>();
        for(String x : split) {
            if(x.equals("..")) {
                if(!strings.isEmpty()) {
                    strings.removeLast();
                }
            } else if(x.equals(".") || x.equals("")) {
                continue;
            } else {
                strings.addLast(x);
            }
        }
        for(String s : strings) {
            ans += "/";
            ans += s;
        }
        return ans==""?"/":ans;
    }

//    public String simplifyPath(String path) {
//        String s = "";
//        int n = path.length();
//        Stack<String> strs = new Stack<String>();
//        Stack<String> strsRev = new Stack<String>();
//        for(int i = 0; i < n; i++) {
//            char x = path.charAt(i);
//            if(x == '/') {
//                while(i < n-1 && path.charAt(i+1) != '/') {
//                    i++;
//                    s += path.charAt(i);
//                }
//            }
//            System.out.println(s);
//            if(s == "") {
//                continue;
//            } else if(s == "..") {
//                strs.pop();
//            } else {
//                strs.push(s);
//            }
//            s = "";
//        }
//        while(!strs.empty()) {
//            strsRev.push(strs.pop());
//        }
//        s = "";
//        while(!strsRev.empty()) {
//            s += "/";
//            s += strsRev.pop();
//        }
//        return s;
//    }
}
