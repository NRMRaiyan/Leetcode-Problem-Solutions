//Problem Link - https://leetcode.com/problems/count-commas-in-range/?envType=daily-question&envId=2026-09-09

class commaCount1 {
    public int countCommas(int n) {
        int total = 0;
        int lower = 1;
        int upper = 9;
        int d = 1;
        
        while (lower <= n) {
            int hi = Math.min(upper, n);
            int lo = lower;
            if (lo <= hi) {
                int count = hi - lo + 1;
                int commasPerNumber = (d - 1) / 3;
                total += count * commasPerNumber;
            }
            d++;
            lower = upper + 1;
            upper = upper * 10 + 9;
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        commaCount1 sol = new commaCount1();
        System.out.println(sol.countCommas(1002)); // 3
        System.out.println(sol.countCommas(998));   // 0
        System.out.println(sol.countCommas(100000)); // test max n
    }
}