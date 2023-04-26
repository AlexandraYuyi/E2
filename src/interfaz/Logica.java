package interfaz;

import java.math.BigInteger;

public class Logica {

    public static boolean esPrimo(int m, int n) {
        if (m<=2)
            return (n == 2) ? true : false;
        if (m%n==0)
            return false;
        if (n*n>m)
            return true;

        return esPrimo(m, n + 1);
    }

    public static double potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            return 1 / potencia(base, exp * -1);
        } else {
            return base * potencia(base, exp - 1);
        }
    }

    public static BigInteger multiplicacion(int a, int b) {
        BigInteger aBI = BigInteger.valueOf(a);
        BigInteger bBI = BigInteger.valueOf(b);
        BigInteger resultado = aBI.multiply(bBI).abs();
        return resultado;
    }

    public static BigInteger sumaDigitos(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        } else {
            return n.mod(BigInteger.TEN).add(sumaDigitos(n.divide(BigInteger.TEN)));
        }
    }

    public static String resultadoFibonacci(int m) {
        String resultado = "";
        for (int i = 0; i < m; i++) {
            if (funcionFibonacci(i) > m) {
                break;
            }
            if (i == m - 1) {
                resultado += funcionFibonacci(i);
            } else {
                resultado += funcionFibonacci(i) + ", ";
            }
        }
        return resultado;
    }

    private static int funcionFibonacci(int num) {
        if (num == 0 || num == 1)
            return num;
        else
            return funcionFibonacci(num - 1) + funcionFibonacci(num - 2);
    }

    public static BigInteger factorial(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

}
