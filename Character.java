
    package rpg;
    public class Character {
    
    static Dice dice = new Dice();
    
    protected String Name;
    protected int Strength;
    protected int Dexterity;
    protected int Intellegence;
    protected int Maxlife;
    protected int Currentlife;

    public Character(String n, int s, int d, int i) {
    this.Name =n;
    this.Strength = s;
    this.Dexterity= d;
    this.Intellegence= i;

    this.Maxlife = dice.roll()+15;
    this.Currentlife = Maxlife;


    }
    
    public int attack() {
        int x = dice.roll();
        return x;
    }
    
    public void wound(int damage) {
        Currentlife -= damage;
    }
    
    public void heal(int heal) {

        if(Currentlife == Maxlife){
            System.out.println(Name + " is already at full health and cannot be healed! ");
        }
        else{
            Currentlife += heal;
        }

    }
   
    public String getName() {
        return Name;
    }
    
    public int getStrength() {
        return Strength;
    }
   
    public int getDexterity() {
        return Dexterity;
    }
    
    public int getIntelligence() {
        return Intellegence;
    }
   
    public int getCurrentLife() {

       return Currentlife;
    }
    
    public int getMaxLife() {
       return Maxlife;
       
    }
    }