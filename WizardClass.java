
package rpg;


public class WizardClass extends Character{
private  int maxMagic,currentMagic;
public Dice die = new Dice();

    public WizardClass(String n, int s, int d, int i,int mm) {
        super(n, s, d, i);
        this.maxMagic = mm;
        this.currentMagic = mm;
    }
    
    public int castLightningBolt(){
        int dmg = 0;
        if(currentMagic >= 5){
            currentMagic -=5;
            dmg = die.roll() + super.getIntelligence();
        }else{
            System.out.println(super.getName()+" had no mana left for Lightning bolt!");
            dmg = 0;
        }
        return dmg;
    }
    
    public int castHeal(){
        int heal = (dice.roll() + super.getIntelligence());;
        if(currentMagic >= 8 && super.Currentlife < super.Maxlife){
            if(heal+super.getCurrentLife() > super.getMaxLife()){
                heal = super.getMaxLife()-super.getCurrentLife();
                System.out.println(super.getName()+" healed for "+heal);
                currentMagic-=8;
            }else{
                System.out.println(super.getName()+" healed for "+heal);
                currentMagic-=8;
                //Return heal as normal
            }   
        }else{
            System.out.println(super.getName()+" had no magic left to cast heal!");
            heal = 0;
        }
        return heal;
    }
    
    public int getMaxMagic(){
        return maxMagic;
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }
    
}
