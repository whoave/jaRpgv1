package javaclas;

import java.util.Scanner;

public class Javaclas {
static Scanner scanInput = new Scanner(System.in);
static Insan cHar = new Insan("Oyuncu1","AD");

    public static void main(String[] args) {
System.out.println("Karakter Adı Giriniz!");
String name = scanInput.next();
cHar.isim=name;
boolean game = true;
while(game){
    
 // game kontroller
    
    
    Monsters canavar = new Monsters();
    System.out.println("#############################################################################");
    System.out.println("Karşına " + canavar.SelectedM() + " çıktı!");
    System.out.println("#############################################################################");

while(canavar.Health > 0){
   
System.out.println("Ne yapmak istiyorsun? (saldir, heal, kac)");
    System.out.println("---------------------------------------------------------------");
String islem = scanInput.next();
switch(islem){
    case "saldir":
        canavar.Health-=cHar.Saldir(canavar.Health);
        cHar.can-=cHar.Savun(canavar.Damage);
        System.out.println("Canın: "+cHar.can+" Canavarın Canı: "+ canavar.Health);
        break;
    case "heal":
        cHar.can += cHar.heal();
        cHar.can-=cHar.Savun(canavar.Damage);
        System.out.println("Canın: "+cHar.can+" Canavarın Canı: "+ canavar.Health);
        break;
    case "kac":
        System.out.println("Kaçtın. Korkakça.");
        break;
    default:
        System.out.println("Böyle bir hamlen yok");
        break;
}
}
    // canvar kesildi
    System.out.println("Canavar yok edildi! +10g");
    cHar.gold+=10;
    
// markete gidecek misin?
    System.out.println("Markete gidecek misin?(e/h)");
    String market = scanInput.next();
    if("e".equals(market) || "E".equals(market)){
        market();
        System.out.println("######################MARKET############################");
    }else{
        System.out.println("Markete girmiyorsun, demekki kendine güvenin hala sağlam!!");
    }
    
    System.out.println("TOPLAM ALTIN: "+ cHar.gold);
    System.out.println("#########################################################");
    
    
      if(cHar.can<=0){
        System.out.println("ÖLDÜN. OYUN BİTTİ.");
        game=false;
        System.exit(0);
    }
}
    
      
    }

    
static void market(){
     // pot alacak mısın?
    System.out.println("Ne almak istiyorsun?"
            + "\n"
            + "+15 CAN POTU(-15G) -- pot"
            + "\n"
            + "+10 GÜÇ İKSİRİ(-15G) -- guc"
            + "\n"
            + "Terket --terk");
    String secim = scanInput.next();
    System.out.println(secim);
    if("pot".equals(secim) || "POT".equals(secim) && cHar.gold >= 15){
        cHar.gold-=15;
        cHar.can+=15;
        System.out.println("Pot alındı, içildi! YeniCan:: " + cHar.can);
    }else if("guc".equals(secim)){
        cHar.gold-=15;
        cHar.guc+=10;
        System.out.println("Güç alındı! Yeni Güç:: ~" + cHar.guc );
    }else if("terk".equals(secim)){
        System.out.println("Hiçbir şey alınmadı! Güle güle.");
        }
    
}
    
    
    
    
    
}

