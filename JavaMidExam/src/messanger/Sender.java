package messanger;
public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "P", "Halo!");
        std.sendMessage("Tiara", "Internship", "Selamat anda lolos magang");

        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Rahasia", "Ini Pesan Rahas");
        mail.sendMessage("Lisa", "Bulgari's Concert", "Jangan lupa datang ke konser ya");
        mail.disconnect();
        mail.sendMessage("Reza", "Permohonan Kerjasama", "Mohon diterima surat ini");

    }
}
