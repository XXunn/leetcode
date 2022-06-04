package leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/6/4 12:52
 **/
public class numUniqueEmails {

    /*** 直接string+string效率很低
    public int numUniqueEmails(String[] emails) {
        Set<String> st = new LinkedHashSet<>();
        for(String email : emails) {
            String[] a2 = email.split("@");
            String tmp = "";
            for(int i = 0; i < a2[0].length(); i++) {
                if(a2[0].charAt(i) == '+') {
                    break;
                } else if(a2[0].charAt(i) == '.') {
                    continue;
                } else {
                    tmp += a2[0].charAt(i);
                }
            }
            st.add(tmp+"@"+a2[1]);
        }
        for(String x : st) {
            System.out.println(x);
        }
        return st.size();
    }
     */

    /*** 用stringbuilder改进
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails) {
            StringBuilder strB = new StringBuilder();
            String[] split = email.split("@");
            for(int i = 0; i < split[0].length(); i++) {
                char t = split[0].charAt(i);
                if(t == '.') {
                    continue;
                } else if(t == '+') {
                    break;
                } else {
                    strB.append(t);
                }
            }
            set.add(strB.append("@").append(split[1]).toString());
        }
        return set.size();
    }
     */

    /***
     * 直接API
     */
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email : emails) {
            int idx = email.indexOf("@");
            String tmpRes = email.substring(0, idx).split("\\+")[0].replace(".","");
            set.add(tmpRes+email.substring(idx, email.length()));
        }
        return set.size();
    }


}
