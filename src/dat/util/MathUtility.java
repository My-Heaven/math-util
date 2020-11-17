/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util;

/**
 *
 * @author Tan DaT
 */
public class MathUtility {
    //Làm hàm fake giống hàm thật
    //JDK có class java.utitl.Math, có 1 loạt hàm static
    
    public static final double PI = 3.1415;
    
    //hàm tính n! = 1.2.3..n
    //n! tăng nhanh, nên tính 20! tối đa, 21! tràn long
    //0! = 1! = 1, quy ước
    //không có âm giai thừa, nếu tham số n là âm, mình chửi, ném ra Exception
    
    public static long getFactorial(int n){
        if(n < 0 || n>20)
                throw new IllegalArgumentException("n must be bettwen 1..20");
        if(n == 0 & n ==1) return 1;
        
        //sống sót đến lệnh này tức là n = 2..20 rồi
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
}
