import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String[] filmAdi = new String[10];
        int[] filmSureleri = new int[10];
        String[] filmTurleri = new String[10];
        int filmSayisi = 0;

        String[] musteriler = new String[20];
        String[] musteriMailleri = new String[20];
        int musteriSayisi = 0;

        String[][] biletler = new String[20][10];

        for (int i = 0; i < 20; i++) {

            for (int k = 0; k < 10; k++) {

                biletler[i][k] = "bos";
            }


        }

        Scanner giris = new Scanner(System.in);

        int secim;
        do {

            System.out.println("\n ------ Sinema Bilet Sistemi ------");
            System.out.println("1. Film Ekle");
            System.out.println("2. Müşteri Ekle");
            System.out.println("3. Bilet Kes");
            System.out.println("4. Film Listele");
            System.out.println("5. Müşteri Listele");
            System.out.println("6. Bilet Listele");
            System.out.println("9. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = giris.nextInt();
            giris.nextLine();


            if (secim == 1) {
                // film ekleme
                if (filmSayisi < 10) {
                    System.out.print("Film adı: ");
                    filmAdi[filmSayisi] = giris.nextLine();

                    System.out.print("Film süresi: ");
                    filmSureleri[filmSayisi] = giris.nextInt();
                    giris.nextLine();

                    System.out.print("Film türü: ");
                    filmTurleri[filmSayisi] = giris.nextLine();

                    filmSayisi++;
                    System.out.println("Film başarıyla eklendi.");
                } else {
                    System.out.println("Daha fazla film giremezsin.");
                }

            } else if (secim == 2) {
                // Müşteri ekleme
                if (musteriSayisi < 20) {
                    System.out.print("Müşteri adı: ");
                    musteriler[musteriSayisi] = giris.nextLine();

                    System.out.print("Müşteri e-posta: ");
                    musteriMailleri[musteriSayisi] = giris.nextLine();

                    musteriSayisi++;
                    System.out.println("Müşteri başarıyla eklendi.");
                } else {
                    System.out.println("Müşteri kapasitesi doldu.");
                }

            } else if (secim == 3) {
                // Bilet oluşturma
                if (filmSayisi == 0 || musteriSayisi == 0) {
                    System.out.println("Film veya müşteri kaydı eksik.");
                } else {
                    // Müşteri listesi
                    System.out.println("Müşteriler:");
                    for (int i = 0; i < musteriSayisi; i++) {
                        System.out.println(i + ". " + musteriler[i]);
                    }

                    System.out.print("Müşteri numarası: ");
                    int musteriNum = giris.nextInt();

                    // Film listesi
                    System.out.println("Filmler:");
                    for (int i = 0; i < filmSayisi; i++) {
                        System.out.println(i + ". " + filmAdi[i]);
                    }

                    System.out.print("Film numarası: ");
                    int filmNum = giris.nextInt();
                    giris.nextLine();

                    // Kontrol
                    if (musteriNum <= musteriSayisi && filmNum >= 0 && filmNum <= filmSayisi) {
                        biletler[musteriNum][filmNum] = filmAdi[filmNum];
                        System.out.println("Bilet başarıyla oluşturuldu.");
                    } else {
                        System.out.println("Geçersiz seçim.");
                    }
                }

            } else if (secim == 4) {
                // Filmleri listeleme
                System.out.println("------  Filmler -----");
                for (int i = 0; i < filmSayisi; i++) {
                    System.out.println(i + ". " + filmAdi[i] + " | " + filmSureleri[i] + " dk | Tür: " + filmTurleri[i]);
                }

            } else if (secim == 5) {
                // Müşterileri listeleme
                System.out.println("------ Müşteriler ------");
                for (int i = 0; i < musteriSayisi; i++) {
                    System.out.println(i + ". " + musteriler[i] + " | Email: " + musteriMailleri[i]);
                }

            } else if (secim == 6) {
                // Biletleri listeleme
                System.out.println("------ Biletler ------");
                for (int i = 0; i < musteriSayisi; i++) {

                    for (int k = 0; k < filmSayisi; k++) {


                        if (biletler[i][k].equals("bos")) {
                            System.out.println(musteriler[i] + " --> Bilet tanımlanmamış.");
                        } else {
                            System.out.println(musteriler[i] + " --> " + filmAdi[k]);
                        }

                    }
                }

            } else if (secim == 0) {
                // Çıkış
                System.out.println("Güle güle");
                break;

            } else {
                System.out.println("Geçersiz işlem.");
            }
        }
        while (secim != 9);

        giris.close();
    }
}