package interfaz;

//import com.sun.xml.internal.ws.util.StringUtils;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Logica {


//    public static BigInteger potencia(int base, int exp){
//        if(exp==0){
//        return BigInteger.valueOf(1);
//        } else if(exp < 0){
//            return BigInteger.valueOf(1).divide(potencia(base, exp*-1));
//        }else{
//            return BigInteger.valueOf(base).multiply(potencia(base, exp-1));
//        }
//        }
    
    public static double potencia(int base, int exp){
        if(exp==0){
        return 1;
        } else if(exp < 0){
            return 1/potencia(base, exp*-1);
        }else{
            return base* potencia(base, exp-1);
        }
        }
    
    public static BigInteger factorial(int n){
        if (n<=1){ return BigInteger.valueOf(1);
        } else{
            return BigInteger.valueOf(n).multiply(factorial(n-1));
        }
    }
}
