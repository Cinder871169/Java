import java.lang.Math;

class SNT extends Thread {
    @Override
    public void run() {
        synchronized (System.out) {
            System.out.println("SNT pv 1000:");
            for (int i = 2; i <= 1000; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }
}

class HoanHao extends Thread {
    @Override
    public void run() {
        synchronized (System.out) {
            System.out.println("So hoan hao pv 10000:");
            for (int i = 1; i <= 10000; i++) {
                if (perfect(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    private boolean perfect(int n) {
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tong += i;
            }
        }
        return tong == n;
    }
}

class D3 extends Thread {
    @Override
    public void run() {
        synchronized (System.out) {
            System.out.println("So chia het cho 3 pv 2000:");
            for (int i = 1; i <= 2000; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}

public class demo {
    public static void main(String[] args) {
        SNT p = new SNT();
        HoanHao h = new HoanHao();
        D3 d3 = new D3();

        p.start();
        h.start();
        d3.start();

        try {
            p.join();
            h.join();
            d3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
