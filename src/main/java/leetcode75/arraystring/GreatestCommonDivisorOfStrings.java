package leetcode75.arraystring;

/*
https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=study-plan-v2&envId=leetcode-75
 */
public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        for (int i = str1.length(); i > 0; i--) {
            String gcd = str1.substring(0, i);
            if (str1.replaceAll(gcd, "").isEmpty() && str2.replaceAll(gcd, "").isEmpty()) {
                return gcd;
            }
        }
        return "";
    }

    public String gcdOfStringsImproved(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int gcdval=gcd(str1.length(),str2.length());
        return str2.substring(0,gcdval);
    }

    int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }
}
