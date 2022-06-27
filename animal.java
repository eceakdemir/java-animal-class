package animal;

public abstract class animal {

private boolean vegeterian;
private String eates;
private int noOfLegs;
private String color;
public animal()
{
  
}
  
public animal(boolean vegeterian,String eates,int noOfLegs,String color)
{
this.vegeterian = vegeterian;
this.eates = eates;
this.noOfLegs = noOfLegs;
this.color = color;
}
  
public animal(String eates,String color)
{
this.eates = eates;
this.color = color;
}

public interface InFoodChain{
    public String dietType();
    public void huntsDown();
    public void huntedBy();
    public String climate();
    public String habitat();
    public int lifeExpectancy();
}

public void makeSounds()
{
System.out.println("I make Animal sounds");
}
  
public void setVegetrian(boolean vegeterian)
{
this.vegeterian = vegeterian;
}
  
public void setEats(String eates)
{
this.eates = eates;
}
  
public void setNoOfLegs(int nnoOfLegs)
{
this.noOfLegs = noOfLegs;
}
  
public void setColor(String color)
{
this.color = color;
}
  
public boolean getVegeterian()
{
return this.vegeterian;
}
public String getEats()
{
return this.eates;
}
public int getNoOfLegs()
{
return this.noOfLegs;
}
public String getColor()
{
return this.color;
}
  
public void printInfo()
{
  
System.out.println("I am Animal");
if(vegeterian == true)
System.out.println("I am vegeterian-");
else
System.out.println("I am not vegeterian-");
System.out.println("My color is "+this.color);
System.out.println("I have "+this.noOfLegs+" Legs");
System.out.println("I eate "+this.eates);
}
  
  
// tester method
   public static void main(String[] args) {

// making Animal instances

animal an = new animal(true,"grass",4,"Green");
an.printInfo();
an.makeSounds();
an = new Bird("Species","logs",true,"Red");
an.printInfo();
an.makeSounds();
an = new Panda(true);
  
an.printInfo();
an.makeSounds();
  
an = new Penguin(true,"insects",2,"Black","No");
an.printInfo();
an.makeSounds();
class Penguin extends animal implements InFoodChain{

  {
            Penguin l = new Penguin();
            System.out.println("Diet: "+l.dietType());
            l.huntsDown();
            l.huntedBy();
            System.out.println("Climate: "+l.climate());
            System.out.println("Habitat: "+l.habitat());
            System.out.println("Life Expectancy: "+l.lifeExpectancy());
    }

    @Override
    public String dietType() {
            return "carnivore";
    }

    @Override
    public void huntsDown() {
            System.out.println("Hunts:");
            System.out.println("Deer\nAntelopes\nBuffaloes\nZebras\nEelephants\nRhinos\nHippos\nWild hogs\nCrocodiles\nGiraffes.");
            
    }

    @Override
    public void huntedBy() {
            System.out.print("Hunted By: ");
            System.out.println("Human");
    }

    @Override
    public String climate() {
            return "High Temperature";
    }

    @Override
    public String habitat() {
            return "Savannah Forests";
    }

    @Override
    public int lifeExpectancy() {
            return 15;
    }

}

   }

}

class Bird extends animal
{
private boolean endangered;
private String species;
private boolean vegeterian;
private String eates;
public Bird(String species,String eates,boolean endangered,String color)
{
super(eates,color);
this.endangered = endangered;
this.species = species;
this.eates = eates;
}
  
public Bird(boolean vegeterian,String eates,int noOfLegs,String color,boolean endangered,String species)
{
super(vegeterian,eates,noOfLegs,color);
this.endangered = endangered;
this.species = species;
this.vegeterian = vegeterian;
this.eates = eates;
}
  
public void setEndangered(boolean endangered)
{
this.endangered = endangered;
}
public void setSpecies(String species)
{
this.species = species;
}
  
public boolean getEndangered()
{
return this.endangered;
}
  
public String getSpecies()
{
return this.species;
}
  
public void makeSounds()
{
System.out.println("I make chirp chirp sounds");
}
public void printInfo()
{
System.out.println("I am a bird");
  
if(this.vegeterian == true)
System.out.println("I am vegeterian-");
else
System.out.println("I am not vegeterian-");
System.out.println("I eats "+this.eates);
  
}
}
class Panda extends animal
{
private boolean endangered;
public Panda(boolean endangered)
{
this.endangered = endangered;
}
public Panda(boolean vegeterian,String eates,int noOfLegs,String color,boolean endangered)
{
super(vegeterian,eates,noOfLegs,color);
this.endangered = endangered;
}
  
public void setEndangered(boolean endangered)
{
this.endangered = endangered;
}
  
public boolean getEndangered()
{
return this.endangered;
}
  
public void makeSounds()
{
System.out.println("I make gak gak sounds");
}
  
public void printInfo()
{
System.out.println("I am Pandas");
if(this.endangered = true)
System.out.println("I am endangered");
else
System.out.println("I am not endangered");
}
}

class Penguin extends animal
{
private String type;
  
public Penguin(String str1,String str2,boolean bol,String str3)
{
super(bol,str1,0,str3);
this.type = str2;
}
  
public Penguin(boolean vegeterian,String eates,int noOfLegs,String color,String type)
{
super(vegeterian,eates,noOfLegs,color);
this.type = type;
}
  
public void setType(String type)
{
this.type = type;
}
public String getType()
{
return this.type;
}

  
public void makeSounds()
{
System.out.println("i make Penguin sounds");
}
public void printInfo()
{

System.out.println("I am Penguin");   
System.out.println("My type is:"+this.type);
}
}