
package javaclas;
import java.util.Random;

public class Insan {
    Random rand = new Random();
    String isim;
    int gold = 0;
    int can = 100;
    int guc =10;
    
    public Insan(String ad, String soyad){
        isim = ad +" " + soyad;
    }
    
    int Saldir(int cH){
        int hasarI = rand.nextInt(guc);
        System.out.println(hasarI+ "hasar verildi");
        return hasarI;
    }
    
    int Savun(int cD){
         int tolerans = rand.nextInt(8);
         int gelenHasar = cD - tolerans;
         System.out.println(cD + " Hasar alındı."+ tolerans + " kadarı tölare edildi!" + " ALINAN HASAR: "+ gelenHasar);
     return gelenHasar;
    }
    
    int heal(){
        int heal = rand.nextInt(20);
        System.out.println(heal + " kadar can yenilendi");
        return heal;
    }
}
