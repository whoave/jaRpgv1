package javaclas;
import java.util.Random;


public class Monsters {
        String mName;
        int Damage;
        int Health;
   
    String SelectedM(){
    Random rand = new Random();
    int SelectM = rand.nextInt(5);
        switch(SelectM){
            case 0:
                mName="Tarantula";
                Damage=5;
                Health=3;
                break;
            case 1:
                mName="Bulutsal Varlık";
                Damage=15;
                Health=15;
                break;
            case 2:
                mName="Turşu Küfü";
                Damage=10;
                Health=5;
                break;
            case 3:
                mName="Kılıçlı Okçu";
                Damage=20;
                Health=10;
                break;
            case 4:
                mName="Barutatar";
                Damage=10;
                Health=30;
                break;
            case 5:
                mName="Muz";
                Damage=1;
                Health=1;
                break;
            case 6:
                mName="Davros";
                Damage=20;
                Health=15;
                
        }
        return mName + " Hasar:: "+Damage+" Can:: "+Health;
    }
}
