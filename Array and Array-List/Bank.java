import java.util.Arrays;

public class Bank {
    public static String bankName = " Bank Dut";
    public static int totalAccounts = 0;
    private String accountNumber;
    private int balance;
    
    private int[] transactionHistory = new int[5];
    private int transactionCount = 0;

    public Bank(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            addTransaction(amount);
            System.out.println("Deposit berhasil: Rp " + amount);
        } else {
            System.out.println("Jumlah deposit tidak valid!");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            addTransaction(-amount);
            System.out.println("Withdraw berhasil: Rp " + amount);
        } else if (amount > this.balance) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            System.out.println("Jumlah penarikan tidak valid!");
        }
    }

    private void addTransaction(int amount) {
        if (transactionCount < transactionHistory.length) {
            transactionHistory[transactionCount] = amount;
            transactionCount++;
        } else {
            for (int i = 0; i < transactionHistory.length - 1; i++) {
                transactionHistory[i] = transactionHistory[i + 1];
            }
            transactionHistory[transactionHistory.length - 1] = amount;
        }
    }

    public void printTransactionHistory() {
        System.out.println("Riwayat Transaksi Terakhir (Array):");
        if (transactionCount == 0) {
            System.out.println("- Belum ada transaksi.");
        } else {
            for (int i = 0; i < transactionCount; i++) {
                String jenis = transactionHistory[i] > 0 ? "Setor" : "Tarik";
                System.out.println("- " + jenis + ": Rp " + Math.abs(transactionHistory[i]));
            }
        }
    }

    public static void infoBank(){
        System.out.println(" NAMA BANK :" + bankName);
        System.out.println(" TOTAL AKUN AKTIF : " + totalAccounts);
    }

    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}