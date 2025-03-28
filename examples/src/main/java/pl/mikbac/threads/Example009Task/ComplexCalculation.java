package pl.mikbac.threads.Example009Task;

import java.math.BigInteger;

public class ComplexCalculation {
    public BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) throws InterruptedException {
        BigInteger result;

        final PowerCalculatingThread thread1 = new PowerCalculatingThread(base1, power1);
        final PowerCalculatingThread thread2 = new PowerCalculatingThread(base2, power2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        result = thread1.getResult().add(thread2.getResult());

        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;

        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            result = base.pow((int) power.longValue());
        }

        public BigInteger getResult() {
            return result;
        }
    }
}
