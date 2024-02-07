import java.util.Random;
import java.util.Scanner;

public class taskagitmakas {
    public static void main(String[] args) {
        while(true){
            oyunuBaslat();
            System.out.println("yeniden oynamak ister misin evet/hayır");
            Scanner scanner=new Scanner(System.in);
            String devamet=scanner.next().toLowerCase();
           if(devamet.equals("evet")){
            oyunuBaslat();
           }
           else{
            System.out.println("oyun sonlandı");
            break;
           }
    
        }

    }
public static void oyunuBaslat(){
    System.out.println("Taş Kağıt Makas Oyununa Hoşgeldiniz");
    System.out.println("Seçiminizi yapın. Taş/Kağıt/Makas");        
    Scanner scanner=new Scanner(System.in);
    String kullanicininsecimi=scanner.next().toLowerCase();
        if(gecerliSecim(kullanicininsecimi)){
            String bilgisayarsecimi=bilgisayarsecimyap();
            System.out.println("Bilgisayar Seçimini yaptı \nBilgisayarın secimi:"+bilgisayarsecimi);
            sonucuHesapla(kullanicininsecimi, bilgisayarsecimi);
        }
        else{
            System.out.println("Geçersiz bir seçim yaptınız.Lütfen taş kağıt makastan birini seçin");
        }

}
    public static boolean gecerliSecim(String secim){
    return(secim.equals("tas"))|| secim.equals("makas") || secim.equals("kagit");

    }
    public static String bilgisayarsecimyap(){
        String []secenekler={"tas","kagit","makas"};
        Random rand=new Random();
        int rastgele=rand.nextInt(secenekler.length);
        return secenekler[rastgele];

    }
    private static void sonucuHesapla(String kullanici,String bilgisayar){
        if(kullanici.equals(bilgisayar)){
            System.out.println("BERABERE! İKİ TARAFTA AYNI SEÇİMİ YAPTI ");
        }
        else if(kullanici.equals("tas")&& bilgisayar.equals("makas")||
        kullanici.equals("makas")&&bilgisayar.equals("kagit")|| kullanici.equals("kagit")&& bilgisayar.equals("tas")){
            System.out.println("TEBRİKLER SİZ KAZANDINIZ");
        }
        else{
            System.out.println("Maalesef kaybettiniz.Bilgisayar Kazandı");
        }
    }
}
