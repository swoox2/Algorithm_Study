import java.awt.*;
import java.util.*;
class Main01_07 {
    public String solution(String str) {
        String answer = "Yes";
        str=str.toUpperCase();
        char[] c = str.toCharArray();
        int lt=0,rt=c.length-1;
        for (int i = 0; i < c.length / 2; i++) {
            if (c[lt] == c[rt]) {
                lt++; rt--;
            }else{
                answer="no";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main01_07 T = new Main01_07();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
