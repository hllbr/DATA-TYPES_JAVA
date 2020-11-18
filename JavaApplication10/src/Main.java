
        /*
        Tamsayıları gösteren 4 adet veri tipimiz bulunmakta bu veri tipleri sırası ile ,
        Int,
        Byte,
        Short,
        Long,
        Bunları birbirlerinden ayıran en önemli özellikleri bellekte kapladıkları yerler ve tuttukları(tutabildikleri) değerlerdir.
        örnek olarak byte veri tipi long tan çok daha az değer tutbiliyor.(Çok küçük değerler tutabiliyor.)
        bunlar aynı zamanda kapladıkları byte,bit miktarına görede ayrılıyorlar.
        Bir byte Byte SEKİZ adet Bit'e eşittir.
        int veri tipi bellekte 32 bit yani bellekte 4 byte'lık bir alan kaplıyor
        */
public class Main {
    public static void main(String[] args) {
        int a = 58;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
        //byte veri tipi 8 bitlik yani 1 bytelık alan kaplamaktadır.
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.TYPE);
        //short 2 byte yani 16 bitlik bir alan kaplamakta
        
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.TYPE);
        //En yüksek veri tutabildiğimiz veri tipi sie long veri tipidir.
        
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.SIZE);
        System.err.println(Long.TYPE);
        
        //burada veri tipleri için javanın bize hazır olarak verdiği bazı methodları kullandık...
        
        //Veri Tiplerinin birbirlerine dönüşümü =
        
             /*
        ************************************************************************
        BYTE-->SHORT-->İNTEGER-->LONG
        2 Farklı veri tipinden değerleri topladığımızda JAVA bir dönüştürme yapmaya çalışıyor.
        Java bu dönüşümü yapabiliyorsa yapar yapamadığı durumlarda bizim bunu yapmamız gerekiyor.
        yapabiliyorsa olarak anlatmak istediğimiz byte ve int veri tipleri toplanmışsa direkt olarak inte dönüştürme gerçekleştiriyor
        JAVA çalışma mantığı açısından yukarı yuvarlayarak üst veri tipine dönüştürmeyi tercih eder.
        JAVA'nın bu dönüştürme mantığının temelinde veri kaybını önlemek yatar.
        int her değer byte ile gösterilemez ancak byte her değer shor ve long aynı zamanda int olarak ifade edilebilir.
        
   
        ************************************************************************
        JAVANIN YAPTIĞI OTOMATİK DÖNÜŞTÜRME İŞLEMLERİ = 
        */
        short j = 1000;
        int i = (j/2);
        System.out.println("i adlı ifademizin sonucu =" +i);
        System.out.println("aşağıda bulunan işlemde javanın otomatik dönüştürme yapmadığı durum içn bir örnek bulunmaktadır.");
        byte k = 100;
        byte m = (byte)(a/2);
        System.out.println("m = "+m);
        //a bir byte ve 2 bir integer ifadedir.sonucun byte olmasını istiyorsak işlemi byte olarak tanımlamalıyız 2 ifadesini tek başında değil işlemi burada bu noktaya dikkat edilmelidir.
        //otomatik dönüştürme = 
        short z =100;
        byte g = 2;
        int u = 4;
        long sonuc = z+g+u;
        //java burada sıkıntı çıkartmadı çünkü long diğer veri tiplerine üstündür. 
        System.out.println("sonucumuz : "+sonuc);
        
    }
    
}
