package data;

import java.util.Random;

enum nature
{
	Adamant, Bashful, Bold, Brave, Calm, Careful, Docile, Gentle, Hardy, Hasty, Impish, Jolly, Lax, 
	Lonely, Mild, Modest, Naive, Naughty, Quiet, Quirky, Rash, Relaxed, Sassy, Serious, Timid, 
};

public class PokemonObject
{
    private int speed;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int health;
    private int lvl; 
    private int dex;
    private String type1;
    private String type2;
    private double height;
    private double weight;
    private String name;
    private String species;
    //private String nature;
    //private String ability;
    //private String characteristic??;
    
    int newSpeed;
    int newAttack;
    int newDefense;
    int newSpecialAttack;
    int newSpecialDefense;
    int newHealth;
    int newLvl;
    int newDex;
    String newType1;
    String newType2;
    double newHeight;
    double newWeight;
    String newName;
    String newSpecies;
    
    int speedIV;
    int attackIV;
    int defenseIV;
    int specialAttackIV;
    int specialDefenseIV;
    int healthIV;
    
    int speedEV;
    int attackEV;
    int defenseEV;
    int specialAttackEV;
    int specialDefenseEV;
    int healthEV;
    
    //nMod()
    int natureInt;
    String nature;    
    
    double speedMod;
    double attackMod;
    double defenseMod;
    double specialAttackMod;
    double specialDefenseMod;
    
    double speedStat;
    double attackStat;
    double defenseStat;
    double specialAttackStat;
    double specialDefenseStat;
    double healthStat;
    
    
    double size;
    double wei;
    
    public PokemonObject()
    {
        speed = 29;
        attack = 136;
        defense = 0;
        specialAttack = 6;
        specialDefense = 6;
        health = 33;
        lvl = 10;
        dex = 000;
        type1 = "Bird";
        type2 = "Normal";
        height = 10.0;
        weight = 3507.2;
        name = "MissingNo";
        species = "??? Pokemon";
        
        speedIV = 1;
        attackIV = 1;
        defenseIV = 1;
        specialAttackIV = 1;
        specialDefenseIV = 1;

        
        speedEV = 1;
        attackEV = 1;
        defenseEV = 1;
        specialAttackEV = 1;
        specialDefenseEV = 1;
        healthEV = 1;
        
    }
    public PokemonObject(int newSpeed, int newAttack, int newDefense, int newSpecialAttack, int newSpecialDefesnse, int newHealth, int newDex, String newType1, String newType2, double newHeight, double newWeight, String newName, String newSpecies)
    {
    	speed = newSpeed;
    	attack = newAttack;
        defense = newDefense;
        specialAttack = newSpecialAttack;
        specialDefense = newSpecialDefense;
        lvl = newLvl;
        health = newHealth;
        dex = newDex;
        type1 = newType1;
        type2 = newType2;
        height = newHeight;
        weight = newWeight;
        name = newName;
        species = newSpecies;
    }
    public int getSpeed()
    {
    	return speed;
    }
    public int getAttack()
    {
    	return attack;
    }
    public int getDefense()
    {
    	return defense;
    }
    public int getSpecialAttack()
    {
    	return specialAttack;
    }
    public int getSpecialDefense()
    {
    	return specialDefense;
    }
    public int getHealth()
    {
    	return health;
    }
    public int getLvl()
    {
    	return lvl;
    }
    public int getDex()
    {
    	return dex;
    }
    public String getType1()
    {
    	return type1;
    }
    public String getType2()
    {
    	return type2;
    }
    public double getHeight()
    {
    	return height;
    }
    public double getWeight()
    {
    	return weight;
    }
    public String getName()
    {
    	return name;
    }
    public String getSpecies()
    {
    	return species;
    }
    
	public void setSpecies(String string) {
		species = string;	
	}
	public void setName(String string) {
		name = string;		
	}
	public void setHeight(double d) {
		height = d;
	}
	public void setType2(String string) {
		type2 = string;	
	}
	public void setType1(String string) {
		type1 = string;
	}
	public void setHealth(int i) {
		health = i;
	}
	public void setLvl (int i)
	{
		lvl = i;
	}
	public void setSpecialDefense(int i) {
		specialDefense = i;
	}
	public void setSpecialAttack(int i) {
		specialAttack = i;
	}
	public void setDex(int i) {
		dex = i;
	}
	public void setDefense (int i) {
		defense = i;	
	}
	public void setAttack(int i) {
		attack = i;
	}
	public void setSpeed(int i) {
		speed = i;
	}
	
    
    public void generateIV()
    {
    	Random spee = new Random();
    	speedIV = spee.nextInt(31)+1;
    	
    	Random att = new Random();
    	attackIV = att.nextInt(31)+1;

    	Random ense = new Random();
    	defenseIV = ense.nextInt(31)+1;
    	
    	Random spAtt = new Random();
    	specialAttackIV = spAtt.nextInt(31)+1;
    	
    	Random spEnse = new Random();
    	specialDefenseIV = spEnse.nextInt(31)+1;
    	
    	System.out.println(speedIV + "\n" + attackIV+"\n" + defenseIV+"\n" + specialAttackIV+"\n" + specialDefenseIV + "/n");
    }
    	
    public void generateEV()//there can only be 510 total
    {
    	
    }
    public void nat()
    {
    	switch (nature) {
    	
    	// FILL IN CASE STATEMENTS
    		
    	}
    	
    }
    
   
    
    public void generateUniqueStats()
    {
    	for (int i= 0; i < 1; i++)
    	{
    		speedStat = ((speed*2 + speedIV + (speedEV/4)*lvl/100+5)*speedMod);
    		attackStat = ((attack*2 + attackIV + (attackEV/4)*lvl/100+5)*attackMod);
    		defenseStat = ((defense*2 + defenseIV + (defenseEV/4)*lvl/100+5)*defenseMod);
    		specialAttackStat = ((specialAttack*2 + specialAttackIV + (specialAttackEV/4)*lvl/100+5)*specialAttackMod);
    		specialDefenseStat = ((specialDefense*2 + specialDefenseIV + (defenseEV/4)*lvl/100+5)*specialDefenseMod);
    		healthStat = ((speed*2 + speedIV + (speedEV/4)*lvl/100+5));
    		
    		
    		
    	}
    }
	@Override
	public String toString() 
	{
		return "PokemonObject [speed=" + speed + ", attack=" + attack + ", defense=" + defense + ", specialAttack="
				+ specialAttack + ", specialDefense=" + specialDefense + ", health=" + health + ", lvl=" + lvl
				+ ", dex=" + dex + ", type1=" + type1 + ", type2=" + type2 + ", height=" + height + ", weight=" + weight
				+ ", name=" + name + ", species=" + species + ", newSpeed=" + newSpeed + ", newAttack=" + newAttack
				+ ", newDefense=" + newDefense + ", newSpecialAttack=" + newSpecialAttack + ", newSpecialDefense="
				+ newSpecialDefense + ", newHealth=" + newHealth + ", newLvl=" + newLvl + ", newDex=" + newDex
				+ ", newType1=" + newType1 + ", newType2=" + newType2 + ", newHeight=" + newHeight + ", newWeight="
				+ newWeight + ", newName=" + newName + ", newSpecies=" + newSpecies + ", speedIV=" + speedIV
				+ ", attackIV=" + attackIV + ", defenseIV=" + defenseIV + ", specialAttackIV=" + specialAttackIV
				+ ", specialDefenseIV=" + specialDefenseIV + ", healthIV=" + healthIV + ", speedEV=" + speedEV
				+ ", attackEV=" + attackEV + ", defenseEV=" + defenseEV + ", specialAttackEV=" + specialAttackEV
				+ ", specialDefenseEV=" + specialDefenseEV + ", healthEV=" + healthEV + ", natureInt=" + natureInt
				+ ", nature=" + nature + ", speedMod=" + speedMod + ", attackMod=" + attackMod + ", defenseMod="
				+ defenseMod + ", specialAttackMod=" + specialAttackMod + ", specialDefenseMod=" + specialDefenseMod
				+ ", speedStat=" + speedStat + ", attackStat=" + attackStat + ", defenseStat=" + defenseStat
				+ ", specialAttackStat=" + specialAttackStat + ", specialDefenseStat=" + specialDefenseStat
				+ ", healthStat=" + healthStat + ", size=" + size + ", wei=" + wei + "]";
	}
}

