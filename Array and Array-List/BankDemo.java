import java.util.ArrayList;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Bank> accountList = new ArrayList<>();
        
        accountList.add(new Bank("ACC-001", 100000));
        accountList.add(new Bank("ACC-002", 250000));

        System.out.println("Welcome to" + Bank.bankName);
        Bank.infoBank();

        boolean running = true;
        while (running) {
            System.out.println("\n==============================");
            System.out.println("MENU BANK" + Bank.bankName);
            System.out.println("1. Pilih/Kelola Akun");
            System.out.println("2. Buat Akun Baru");
            System.out.println("3. Lihat Semua Daftar Akun");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (accountList.isEmpty()) {
                        System.out.println("Belum ada akun di bank. Buat akun terlebih dahulu.");
                        break;
                    }
                    
                    System.out.print("Masukkan Nomor Akun yang ingin diakses: ");
                    String targetAcc = scanner.nextLine();
                    
                    Bank selectedAccount = null;
                    for (Bank acc : accountList) {
                        if (acc.getAccountNumber().equalsIgnoreCase(targetAcc)) {
                            selectedAccount = acc;
                            break;
                        }
                    }

                    if (selectedAccount == null) {
                        System.out.println("Akun dengan nomor tersebut tidak ditemukan!");
                        break;
                    }

                    boolean accMenu = true;
                    while (accMenu) {
                        System.out.println("\n--- Menu Akun: " + selectedAccount.getAccountNumber() + " ---");
                        System.out.println("1. Cek Saldo");
                        System.out.println("2. Deposit (Setor Tunai)");
                        System.out.println("3. Withdraw (Tarik Tunai)");
                        System.out.println("4. Lihat Riwayat Transaksi (Array)");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih (1-5): ");
                        int subChoice = scanner.nextInt();

                        switch (subChoice) {
                            case 1:
                                System.out.println("Current balance: Rp " + selectedAccount.getBalance());
                                break;
                            case 2:
                                System.out.print("Masukkan jumlah deposit: Rp ");
                                int dep = scanner.nextInt();
                                selectedAccount.deposit(dep);
                                break;
                            case 3:
                                System.out.print("Masukkan jumlah withdraw: Rp ");
                                int wit = scanner.nextInt();
                                selectedAccount.withdraw(wit);
                                break;
                            case 4:
                                selectedAccount.printTransactionHistory();
                                break;
                            case 5:
                                accMenu = false;
                                break;
                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan Nomor Akun Baru: ");
                    String newAccNum = scanner.nextLine();
                    System.out.print("Masukkan Saldo Awal: Rp ");
                    int initialBalance = scanner.nextInt();
                    
                    Bank newBankAcc = new Bank(newAccNum, initialBalance);
                    accountList.add(newBankAcc);
                    System.out.println("Akun " + newAccNum + " berhasil ditambahkan ke ArrayList!");
                    break;

                case 3:
                    System.out.println("\n=== DAFTAR SELURUH AKUN BANK (ArrayList) ===");
                    for (int i = 0; i < accountList.size(); i++) {
                        Bank acc = accountList.get(i);
                        System.out.println((i + 1) + ". No Akun: " + acc.getAccountNumber() + " | Saldo: Rp " + acc.getBalance());
                    }
                    Bank.infoBank();
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan" + Bank.bankName);
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
        scanner.close();
    }
}