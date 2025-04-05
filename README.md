Sinema İşletmesi Sistemi Projesi (Nesneye Dayalı Programlama Vize Ödevi - Servet ÖNAY):

Bu proje, bir sinema işletmesi için temel müşteri kaydı ve bilet işlemlerini gerçekleştiren bir konsol uygulamasıdır. Kullanıcılar, sinemada sunulan filmleri ekleyebilir, müşteri kaydı yapabilir, bilet oluşturabilir ve mevcut verileri listeleyebilir.



Program, temel Java özellikleri kullanılarak geliştirilmiştir. 

Kullanıcıdan girdi almak için Scanner sınıfını kullandım.

Do-While yapısı ve koşulları kullanarak bir konsol arayüzü geliştirdim. Örneğin kullanıcıdab "1" girdisi aldığında, geçerliği girdinin "1" olduğu koşul olan "Film Ekleme" akışı devreye giriyor. Ve girdi "9" olana kadar
while'ın koşulu sağlandığı için kullanıcı çıkış yapmak istediği zamana kadar program çalışmaya devam ediyor.

Diziler:

String[] filmAdi: Film isimlerini tutan bir dizi.

short[] filmSureleri: Filmlerin sürelerini tutan bir dizi.

String[] filmTurleri: Filmlerin türlerini tutan bir dizi.

String[] musteriler: Müşteri isimlerini tutan bir dizi.

String[] musteriMailleri: Müşteri e-posta adreslerini tutan bir dizi.

String[][] biletler: Müşteri ve film ilişkisini tutan iki boyutlu dizi. Her müşteri için hangi filmi izlediği bilgisi burada tutuluyor.

filmSureleri,filmSayisi,musteriSayisi gibi alacağı değerler belli bir sınırda olacağı kesin olan değişkenler için uygun (byte, short) veri tipleri kullandım.

Uygulama Akışı:

Film Ekleme:

Kullanıcı, sistemdeki mevcut film kapasitesine göre yeni bir film ekleyebilir. Film adı, süresi ve türü kullanıcıdan alınır.

Müşteri Ekleme:

Kullanıcı, sistemdeki müşteri kapasitesine göre yeni bir müşteri kaydedebilir. Müşteri adı ve e-posta adresi alınır.

Bilet Kesme:

Sistem, bir müşteri ve film seçildiğinde bir bilet oluşturur. Bu işlem, seçilen müşteri ve film arasındaki ilişkiyi biletler dizisine kaydeder.

Film Listeleme:

Sistemdeki mevcut filmler, adı, süresi ve türüyle birlikte listelenir.

Müşteri Listeleme:

Sistemdeki tüm müşteriler, adları ve e-posta adresleriyle listelenir.

Bilet Listeleme:

Her müşteri için hangi film veya filmlerle ilişkilendirildiği listelenir.

Çıkış:

Kullanıcı çıkış yapmak için 9 numaralı seçeneği seçer.

Sistemde maksimum 10 film ve 20 müşteri kaydedilebilir. 

Her müşteri, yalnızca mevcut filmlerle ilişkilendirilebilir. Bir müşteri birden fazla film için bilet alabilir.
 


Başlangıçta; 2 boyutlu "biletler" dizisinde oluşturulacak tüm elemanlara, bilet listeleme işlevini yerine getirmek adına koşuldan geçirmek için belli bir değer atamak istedim ("bos").
Bilet listelerken kullandığım koşul: if (biletler[i][k].equals("bos")) idi.
Fakat kodu yeniden gözden geçirip bazı noktaları araştırdığımda; Java'nın örneğin "String[] filmAdi = new String[10];" gibi bir 
dizi oluşturulmak istendiğinde, bellekte zaten 10 adet "String" türünde "null" değerli elemanlar oluşturduğunu öğrendim. Dolayısıyla bilet listeleme işlevinde yerine getirilmesini
beklediğim koşul: "if(biletler[i][k] != null)" oldu. Böylelikle filmlerle eşleştirilip biletler dizisinde yer alan elemanları bu kontrolden geçirerek listeleyebildim. 
