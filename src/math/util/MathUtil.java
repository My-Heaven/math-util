/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import dat.util.MathUtility;

/**
 *
 * @author Tan DaT
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MathUtility.getFactorial(5));
        // goi ham tinh 5 giai thua hy vong tra ve 120
        // lat hoi ham chay , coi thuc te la may - ACTUAL
         //so sanh voi ca hy vong truoc khi tinh , EXPECTED 120
         //ACTUAL == EXPECTED, ham chay dung cho tinh huong nay, test case nay
         
         System.out.println("0! = " + MathUtility.getFactorial(0));
         
                            //expected: 1, actual: ? chay xong moi biet
                            //chay xong moi biet ham dung sai
        System.out.println("-5! = " + MathUtility.getFactorial(-5));
                               //exception: dap vao mat ILLEGALARGUMENTTEXCEPTION
        //cach test kieu nay goi la MANUAL vi ta phai nhin bang mat de ket luan ket qua
        
        //cách xin sò, ta dùng màu sắc xanh đỏ để luận kết quả đúng sai của 2 kêt quả này
        //cách này gọi là TEST AUTOMATION
        
    }
    
}
