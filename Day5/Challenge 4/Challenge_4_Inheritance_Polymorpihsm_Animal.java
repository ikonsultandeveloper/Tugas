class Animals{
    protected String name;
    protected String type;
    protected String teeth;

    Animals()
    {

    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetType(String type){
        this.type = type;
    }
    public void SetTeeth(String teeth){
        this.teeth = teeth;
    }
    public String GetName(){
        return this.name;
    }
    public String GetType(){
        return this.type;
    }
    public String GetTeeth(){
        return this.teeth;
    }
    public void IdentityMySelf()
    {
        System.out.println("Hi, Im parent of all Animals, My name is " + this.GetName());
    }
}

class Herbivora extends Animals
{
    Herbivora()
    {
        super();
        super.SetType("tumbuhan");
        super.SetTeeth("tumpul");
    }

    @Override
    public void IdentityMySelf()
    {
        System.out.println("Hi, Im Herbivor, My name is " + this.GetName() + ", My food is " + this.GetType() + ", I have " + this.GetTeeth() + " teeth.");
    }
}

class Carnivora extends Animals
{
    Carnivora()
    {
        super();
        super.SetType("daging");
        super.SetTeeth("tajam");
    }

    @Override
    public void IdentityMySelf()
    {
        System.out.println("Hi! Im Carnivor, My name is " + this.GetName() + ", My food is " + this.GetType() + ", I have " + this.GetTeeth() + " teeth.");
    }
}

class Omnivora extends Animals{
    Omnivora()
    {
        super();
        super.SetType("semua");
        super.SetTeeth("tajam dan tumpul");
    }

    @Override
    public void IdentityMySelf(){
        System.out.println("Hi! Im Omnivor, My name is " + this.GetName() + ", My food is " + this.GetType() + ", I have " + this.GetTeeth() + " teeth.");
    }
}

public class Challenge_4_Inheritance_Polymorpihsm_Animal
{
    public static void main(String[] args)
    {
        Animals();
        Herbivora();
        Carnivora();
        Omnivora();
    }
    public static void Animals()
    {
        Animals Animal = new Animals();
        Animal.SetName("Binatang");
        Animal.IdentityMySelf();
    }
    public static void Herbivora()
    {
        Herbivora Herbivora = new Herbivora();
        Herbivora.SetName("Kambing");
        Herbivora.IdentityMySelf();
    }
    public static void Carnivora()
    {
        Carnivora Carnivora = new Carnivora();
        Carnivora.SetName("Singa");
        Carnivora.IdentityMySelf();
    }
    public static void Omnivora()
    {
        Omnivora Omnivora = new Omnivora();
        Omnivora.SetName("Ayam");
        Omnivora.IdentityMySelf();
    }
}