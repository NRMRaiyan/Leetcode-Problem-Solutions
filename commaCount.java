#Problem Link - https://leetcode.com/problems/count-commas-in-range-ii/?envType=daily-question&envId=2026-09-09

public class commaCount {
    public long countCommas(long n) {
        long total = 0;
        long lower = 1;
        long upper = 9;
        int d = 1;

        while(lower <= n){
            long hi = Math.min(upper, n);
            long lo = lower;

            if(lo <= hi){
                long count = hi - lo + 1;
                long commasPerNumber = (d - 1) / 3;
                total += count * commasPerNumber;
            }

            d++;
            lower = upper + 1;

            if(upper > (Long.MAX_VALUE -1) / 10){
                upper = Long.MAX_VALUE;
            }else{
                upper = upper * 10 + 9;
            }
        }
        return total;
    }

    public static void main(String [] args){
        commaCount sol = new commaCount();
        System.out.println(sol.countCommas(1002)); // 3
        System.out.println(sol.countCommas(998));   // 0
        System.out.println(sol.countCommas(1000000000000000L)); // test large
    }
}