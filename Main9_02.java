package study;
import java.util.*;
class Time implements Comparable<Time>{
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o){
        if(this.e==o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}

class Main9_02 {
    public int solution(ArrayList<Time> arr, int n){
        int cnt=0;
        Collections.sort(arr);
        int et=0;
        for(Time ob : arr){
            if(ob.s>=et){
                cnt++;
                et=ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Main9_02 T = new Main9_02();
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x=scan.nextInt();
            int y=scan.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr, n));
    }
}