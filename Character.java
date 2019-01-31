
    package rpg;
    public class Character {
    
    static Dice dice = new Dice();
    
    private String Name;
    private int Strength;
    private int Dexterity;
    private int Intellegence;
    private int Maxlife;
    private int Currentlife;

    public Character(String n, int s, int d, int i) {
    this.Name =n;
    this.Strength = s;
    this.Dexterity= d;
    this.Intellegence= i;

    this.Maxlife = dice.roll()+20;
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