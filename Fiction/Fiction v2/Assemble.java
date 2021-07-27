
class Human{

    private String prefix ="Mr.";
    private String name;
    private String gender;

    
    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    public String getPrefix(){
        return this.prefix;
    }    


    public void setName(String name){
        // name = name; // compilation error
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }

    public String getNameWithPrefix(){
        return this.prefix+" "+this.name;
    }

    // void setNameGender(String n, String g){
    //     name = n;
    //     gender = g;

    // }
    // String getNameAndGender(){
        
    //     return "Human name is "+name+" and gender is "+gender;
    // }
       
}

class SuperHuman extends Human{

    // String name;
    // String gender;
    private String superPower;
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }

    public String getSuperPower(){
        return this.superPower;
    } 
    
}





public class Assemble{

    public static void main(String []args){
        Human h1= new Human();
        h1.setName("Anand");
        // h1.name="Vishal";// we are not going to allow this

        h1.setName("Vishal");
        h1.setName("Farheen");
        h1.setPrefix("Miss");

        // System.out.println(h1.getName());
        System.out.println(h1.getNameWithPrefix());
        Human h2= new Human();
        h2.setName("Nitish");
        System.out.println(h2.getNameWithPrefix());
        Human h3= new Human();
        h3.setName("Anand");
        System.out.println(h3.getNameWithPrefix());

        SuperHuman s1= new SuperHuman();
        s1.setName("Steve");
        s1.setSuperPower("SuperStrength");

        System.out.println(s1.getNameWithPrefix()+" super power is "+s1.getSuperPower());


        // h1.setNameGender("Anand","M");
       




        // SuperHuman s1= new SuperHuman();
        // s1.name="Steve";
        // s1.gender ="M";
        // s1.superPower ="SuperStrength";
        // System.out.println(h1.getNameAndGender());
        // System.out.println("SuperHuman name is "+s1.name+" and super power is : "+s1.superPower);
    }
}