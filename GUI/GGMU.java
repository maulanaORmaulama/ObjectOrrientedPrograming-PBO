import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GGMU {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Manchester United - Trophy & Legends Data Gallery");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850, 620);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        Color warnaMerahMU = new Color(218, 2, 14);
        Color warnaKuningMU = new Color(253, 185, 19);

        JPanel panelAtas = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 10));
        panelAtas.setBackground(warnaMerahMU);

        JLabel labelLogo = new JLabel();
        ImageIcon iconLogo = new ImageIcon("assets/logo_mu.png");
        Image imgLogo = iconLogo.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        labelLogo.setIcon(new ImageIcon(imgLogo));

        JLabel labelJudul = new JLabel("MANCHESTER UNITED HISTORY");
        labelJudul.setFont(new Font("Arial", Font.BOLD, 15));
        labelJudul.setForeground(Color.WHITE);

        panelAtas.add(labelLogo);
        panelAtas.add(labelJudul);
        frame.add(panelAtas, BorderLayout.NORTH);

        JPanel panelTengah = new JPanel(new BorderLayout(10, 10));
        panelTengah.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        panelTengah.setBackground(new Color(255, 240, 240));

        JLabel labelInstruksi = new JLabel("Silakan pilih kategori dan klik item untuk melihat detail serta fotonya:", JLabel.CENTER);
        labelInstruksi.setFont(new Font("Arial", Font.BOLD, 13));
        labelInstruksi.setForeground(warnaMerahMU);

        JTextArea areaInfo = new JTextArea("Selamat datang!\nPilih salah satu tombol di bawah untuk menampilkan daftar trofi atau daftar pemain legenda.\nKemudian pilih item untuk melihat detail dan fotonya.");
        areaInfo.setFont(new Font("Monospaced", Font.PLAIN, 12));
        areaInfo.setEditable(false);
        areaInfo.setLineWrap(true);
        areaInfo.setWrapStyleWord(true);
        areaInfo.setBackground(Color.WHITE);

        JLabel labelGambar = new JLabel("", JLabel.CENTER);
        labelGambar.setPreferredSize(new Dimension(200, 200));
        labelGambar.setBorder(BorderFactory.createLineBorder(warnaMerahMU, 2));

        JPanel panelKanan = new JPanel(new BorderLayout());
        panelKanan.setBackground(new Color(255, 240, 240));
        panelKanan.add(labelGambar, BorderLayout.NORTH);

        panelTengah.add(labelInstruksi, BorderLayout.NORTH);
        panelTengah.add(new JScrollPane(areaInfo), BorderLayout.CENTER);
        panelTengah.add(panelKanan, BorderLayout.EAST);
        frame.add(panelTengah, BorderLayout.CENTER);

        JPanel panelMenu = new JPanel(new GridLayout(1, 2, 15, 15));
        panelMenu.setBorder(BorderFactory.createEmptyBorder(15, 20, 20, 20));
        panelMenu.setBackground(warnaMerahMU);

        JButton btnTrophy = new JButton("🏆 PILIH TROFI");
        JButton btnLegends = new JButton("⭐ PILIH PEMAIN LEGENDA");

        btnTrophy.setFont(new Font("Arial", Font.BOLD, 14));
        btnTrophy.setBackground(warnaKuningMU);
        btnTrophy.setForeground(Color.BLACK);
        btnTrophy.setFocusPainted(false);

        btnLegends.setFont(new Font("Arial", Font.BOLD, 14));
        btnLegends.setBackground(warnaKuningMU);
        btnLegends.setForeground(Color.BLACK);
        btnLegends.setFocusPainted(false);

        btnTrophy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] daftarTrofi = {
                    "English Top-Flight League (First Division / Premier League)",
                    "FA Cup",
                    "FA Community Shield",
                    "League Cup (EFL Cup)",
                    "UEFA Champions League (European Cup)",
                    "UEFA Europa League",
                    "UEFA Cup Winners' Cup",
                    "UEFA Super Cup",
                    "Intercontinental Cup",
                    "FIFA Club World Cup"
                };

                String pilihan = (String) JOptionPane.showInputDialog(
                    frame,
                    "Pilih Trofi:",
                    "Galeri Trofi MU",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    daftarTrofi,
                    daftarTrofi[0]
                );

                if (pilihan != null) {
                    if (pilihan.contains("Premier League")) {
                        labelInstruksi.setText("English Top-Flight League (20 Gelar)");
                        areaInfo.setText("Tahun / Span: 1908–2013\nManchester United adalah penguasa Liga Inggris era Premier League dengan total 20 gelar juara liga.");
                        ImageIcon icon = new ImageIcon("assets/league.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("FA Cup")) {
                        labelInstruksi.setText("FA Cup (13 Gelar)");
                        areaInfo.setText("Tahun / Span: 1909–2024\nTrofi tertua di dunia yang telah dimenangkan MU sebanyak 13 kali.");
                        ImageIcon icon = new ImageIcon("assets/facup.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Community Shield")) {
                        labelInstruksi.setText("FA Community Shield (21 Gelar)");
                        areaInfo.setText("Tahun / Span: 1908–2016\nAjang pembuka musim resmi sepak bola Inggris yang paling sering dimenangkan oleh Manchester United.");
                        ImageIcon icon = new ImageIcon("assets/community_shield.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("League Cup")) {
                        labelInstruksi.setText("League Cup / EFL Cup (6 Gelar)");
                        areaInfo.setText("Tahun / Span: 1992–2023\nTurnamen piala domestik utama kedua di Inggris yang sukses dimenangkan MU sebanyak 6 kali.");
                        ImageIcon icon = new ImageIcon("assets/league_cup.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Champions League")) {
                        labelInstruksi.setText("UEFA Champions League (3 Gelar)");
                        areaInfo.setText("Tahun / Span: 1968, 1999, 2008\nGelar paling bergengsi di Eropa, termasuk momen dramatis treble winners tahun 1999.");
                        ImageIcon icon = new ImageIcon("assets/ucl.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Europa League")) {
                        labelInstruksi.setText("UEFA Europa League (1 Gelar)");
                        areaInfo.setText("Tahun / Span: 2017\nGelar juara kompetisi daratan Eropa yang diraih MU di bawah arahan manajer José Mourinho.");
                        ImageIcon icon = new ImageIcon("assets/europa.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Cup Winners' Cup")) {
                        labelInstruksi.setText("UEFA Cup Winners' Cup (1 Gelar)");
                        areaInfo.setText("Tahun / Span: 1991\nTrofi kontinental bersejarah yang dimenangkan MU dengan mengalahkan Barcelona di final.");
                        ImageIcon icon = new ImageIcon("assets/cup_winners.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Super Cup")) {
                        labelInstruksi.setText("UEFA Super Cup (1 Gelar)");
                        areaInfo.setText("Tahun / Span: 1991\nAjang perebutan piala super Eropa setelah menaklukkan juara Liga Champions saat itu.");
                        ImageIcon icon = new ImageIcon("assets/super_cup.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Intercontinental Cup")) {
                        labelInstruksi.setText("Intercontinental Cup (1 Gelar)");
                        areaInfo.setText("Tahun / Span: 1999\nKejuaraan antarklub interkontinental legendaris yang dimenangkan MU di Tokyo.");
                        ImageIcon icon = new ImageIcon("assets/Intercontinental.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.contains("Club World Cup")) {
                        labelInstruksi.setText("FIFA Club World Cup (1 Gelar)");
                        areaInfo.setText("Tahun / Span: 2008\nStatus juara dunia antarklub resmi yang diselenggarakan oleh FIFA.");
                        ImageIcon icon = new ImageIcon("assets/club_world_cup.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    }
                }
            }
        });

        btnLegends.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] daftarPemain = {
                    "Ryan Giggs",
                    "Sir Bobby Charlton",
                    "Paul Scholes",
                    "Bill Foulkes",
                    "Gary Neville",
                    "Wayne Rooney",
                    "David de Gea",
                    "Denis Irwin",
                    "Roy Keane",
                    "George Best",
                    "Rio Ferdinand",
                    "Bryan Robson",
                    "Denis Law",
                    "Peter Schmeichel",
                    "Maulana Isna Andika"
                };

                String pilihan = (String) JOptionPane.showInputDialog(
                    frame,
                    "Pilih Pemain Legenda:",
                    "Galeri Legenda MU",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    daftarPemain,
                    daftarPemain[0]
                );

                if (pilihan != null) {
                    if (pilihan.equals("Ryan Giggs")) {
                        labelInstruksi.setText("Ryan Giggs");
                        areaInfo.setText("Posisi: Winger\nJumlah Caps: 963 Pertandingan\nPemilik penampilan terbanyak sepanjang masa untuk Manchester United.");
                        ImageIcon icon = new ImageIcon("assets/giggs.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Sir Bobby Charlton")) {
                        labelInstruksi.setText("Sir Bobby Charlton");
                        areaInfo.setText("Posisi: Attacking Midfielder\nJumlah Caps: 746 Pertandingan\nIkon abadi klub, legenda timnas Inggris dan peraih Ballon d'Or.");
                        ImageIcon icon = new ImageIcon("assets/bobby.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Paul Scholes")) {
                        labelInstruksi.setText("Paul Scholes");
                        areaInfo.setText("Posisi: Midfielder\nJumlah Caps: 717 Pertandingan\nGelandang jenius pengatur tempo permainan era Sir Alex Ferguson.");
                        ImageIcon icon = new ImageIcon("assets/scholes.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Bill Foulkes")) {
                        labelInstruksi.setText("Bill Foulkes");
                        areaInfo.setText("Posisi: Defender\nJumlah Caps: 672 Pertandingan\nBek tangguh generasi Busby Babes yang selamat dari Tragedi Munich.");
                        ImageIcon icon = new ImageIcon("assets/foulkes.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Gary Neville")) {
                        labelInstruksi.setText("Gary Neville");
                        areaInfo.setText("Posisi: Right-Back\nJumlah Caps: 603 Pertandingan\nKapten pekerja keras dan salah satu bek kanan terbaik dalam sejarah klub.");
                        ImageIcon icon = new ImageIcon("assets/noville.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Wayne Rooney")) {
                        labelInstruksi.setText("Wayne Rooney");
                        areaInfo.setText("Posisi: Striker\nJumlah Caps: 559 Pertandingan\nTop scorer sepanjang masa Manchester United dengan 253 gol.");
                        ImageIcon icon = new ImageIcon("assets/rooney.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("David de Gea")) {
                        labelInstruksi.setText("David de Gea");
                        areaInfo.setText("Posisi: Goalkeeper\nJumlah Caps: 545 Pertandingan\nKiper legendaris pemegang rekor clean sheet terbanyak MU.");
                        ImageIcon icon = new ImageIcon("assets/degea.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Denis Irwin")) {
                        labelInstruksi.setText("Denis Irwin");
                        areaInfo.setText("Posisi: Full-Back\nJumlah Caps: 529 Pertandingan\nBek kiri konsisten andalan Sir Alex Ferguson dalam mengeksekusi penalti.");
                        ImageIcon icon = new ImageIcon("assets/irwin.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Roy Keane")) {
                        labelInstruksi.setText("Roy Keane");
                        areaInfo.setText("Posisi: Midfielder\nJumlah Caps: 479 Pertandingan\nKapten paling karismatik, tegas, dan bermental pemenang di lini tengah.");
                        ImageIcon icon = new ImageIcon("assets/keane.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("George Best")) {
                        labelInstruksi.setText("George Best");
                        areaInfo.setText("Posisi: Winger\nJumlah Caps: 470 Pertandingan\nPenyerang sayap legendaris pemenang European Cup 1968.");
                        ImageIcon icon = new ImageIcon("assets/best.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Rio Ferdinand")) {
                        labelInstruksi.setText("Rio Ferdinand");
                        areaInfo.setText("Posisi: Centre-Back\nJumlah Caps: 455 Pertandingan\nBek tengah elegan yang cerdas dan tenang dalam mengawal pertahanan.");
                        ImageIcon icon = new ImageIcon("assets/ferdinand.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Bryan Robson")) {
                        labelInstruksi.setText("Bryan Robson");
                        areaInfo.setText("Posisi: Midfielder\nJumlah Caps: 453 Pertandingan\nDijuluki 'Captain Marvel', gelandang box-to-box paling ikonik era 80-an.");
                        ImageIcon icon = new ImageIcon("assets/robson.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Denis Law")) {
                        labelInstruksi.setText("Denis Law");
                        areaInfo.setText("Posisi: Striker\nJumlah Caps: 405 Pertandingan\n'The King', penyerang legendaris peraih Ballon d'Or asal Skotlandia.");
                        ImageIcon icon = new ImageIcon("assets/law.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Peter Schmeichel")) {
                        labelInstruksi.setText("Peter Schmeichel");
                        areaInfo.setText("Posisi: Goalkeeper\nJumlah Caps: 398 Pertandingan\nKiper terbaik dunia era 90-an dengan gaya menepis bola khas star-jump.");
                        ImageIcon icon = new ImageIcon("assets/schmeichel.jpg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    } else if (pilihan.equals("Maulana Isna Andika")) {
                        labelInstruksi.setText("Maulana Isna Andika");
                        areaInfo.setText(
                            "Posisi: Winger\n" +
                            "Jumlah Caps: 398 Pertandingan (578 Caps Total Legenda MU | 1.788 G/A)\n" +
                            "Kiper terbaik dunia era 90-an dengan gaya menepis bola khas star-jump.\n\n" +
                            "Sebagai seorang legenda hidup Manchester United, perjalanan karierku di bawah mistar gawang maupun garis serangan sering kali membuat buku rekor sepak bola terlihat seperti fiksi. " +
                            "Dianggap sebagai salah satu penjaga gawang paling disegani sekaligus sosok paling berpengaruh di generasiku, aku menghabiskan puncak kejayaanku bersama Setan Merah—mengukir standar yang melampaui batas wajar antara refleks luar biasa, ketajaman, dan dominasi mutlak.\n\n" +
                            "Dalam perjalanan panjangku, aku bukan sekadar pengisi daftar susunan pemain, melainkan pusat gravitasi yang mampu mengubah arah pertandingan dalam hitungan detik. " +
                            "Koleksi gelarku bersama klub mencerminkan kedigdayaan yang nyaris tak tersentuh: 3 trofi Liga Champions (UCL), 5 gelar Piala FA, 7 trofi Piala Liga (Carabao Cup), serta 8 gelar Piala Dunia Antarklub (CWC) yang menegaskan bahwa standar kemenangan kami berlaku dari Eropa hingga pentas dunia.\n\n" +
                            "Di luar trofi kolektif, torehan statistik dan lompatan ikonikku menjadi simbol obsesi yang tidak pernah padam setiap kali peluit kick-off berbunyi. " +
                            "Setiap tepisan dengan gaya \"star-jump\" yang menutup ruang tembak lawan, setiap komando di kotak penalti, hingga setiap kontribusi penentu lahir dari disiplin besi, keberanian beradu badan, dan mentalitas juara tanpa kompromi.\n\n" +
                            "Kini, ketika lembaran kejayaanku tertulis tinta emas dalam sejarah Manchester United, namaku berdiri sejajar dengan para ikon abadi klub. " +
                            "Rekor dan trofi memang bisa dipajang di museum atau dibaca di halaman sejarah, tetapi warisan mentalitas, ketenangan di bawah tekanan, dan rasa bangga mengenakan jersi merah itu akan selalu hidup."
                        );
                        ImageIcon icon = new ImageIcon("assets/isna.jpeg");
                        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                        labelGambar.setIcon(new ImageIcon(img));
                    }
                }
            }
        });

        panelMenu.add(btnTrophy);
        panelMenu.add(btnLegends);
        frame.add(panelMenu, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}