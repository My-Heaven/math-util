/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dat.util.test;

import dat.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tan DaT
 */
public class MathUtilityTest {
    @Test //kí hiệu của JUnit đauw ra, biến hàm ngay sau đây thành hàm main
    //public static void main(), app có nhiều main()
    //f6 chạy main() mặc định, Shift-f6 là cahyj main () ở @test
    //đây là 1 trong cách đặt tên cho hàm test, test code chính
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //XANH CHỈ ĐẠT ĐC NẾU TẤT CẢ CÙNG XANH, HÀM Ý HÀM ĐÚNG HẾT TẤT CẢ
    //ĐỎ: CHỈ CẦN ÍT NHẤT 1 THẰNG ĐỎ, COI NHƯ ĐỎ HẾT
    //ý nghĩa, hàm đã đúng phải đúng hết
    
}
//viết code để test code chunhs (MathUtility)
//viết code dùng thư viện junit, NUnit,xUnit, Jasmine,... để test
//xem code chính chạy ổn không trước khi đem qua bên !C/Khách hàng trải nghiệm
//và thư viện này cung cấp cáci cơ chế báo đúng sai qua màu sắc xanh đỏ
//mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expected và actul rồi kết

