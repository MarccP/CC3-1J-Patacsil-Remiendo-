package rpg;

public class HeavyClass extends Character{
    public Dice die = new Dice();
    public HeavyClass(String n, int s, int d, int i) {
        super(n, s, d, i);
    }
    
    public int demolish(){
        int damage = die.roll()+super.getStrength();
        return damage;
        
    }
    
    public int brutalStrikes(){
        int damage = (die.roll()*2)+super.getStrength();
        return damage;
    }
    @Override
    public int attack(){
        int x = dice.roll()+super.Strength;
        return x;
    }
    
}
