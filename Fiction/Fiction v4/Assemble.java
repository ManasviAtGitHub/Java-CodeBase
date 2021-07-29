
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


    public void printProfile(){
        System.out.println("Name is : "+this.prefix+" "+this.name);
        System.out.println("Gender is : "+this.gender);
    }
    


}

class SuperHuman extends Human{

    // String name;
    
    // String gender;

    //Only way to setRole will be using constructor
    private int roleType;
    private String role;


    SuperHuman(){


    }


    // constructor is method without return type
    // same name as class name
    SuperHuman(int roleType){

        this.roleType=roleType;
        this.setRole(this.roleType);
    }

    public String getRole() {
        return this.role;
    }

    //this method can only be accessed in this class
    private void setRole(int roleType) {
        if(roleType==0){
            this.role="Villain";
        }
        else{
            this.role="Hero";
        }
        
    }


    private String superPower;
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }

    public String getSuperPower(){
        return this.superPower;
    } 

    public void printProfile(){


        // this.printProfile();
        super.printProfile();
        System.out.println("SuperPower is : "+this.superPower);
        System.out.println("Is a "+this.role);
        
    }
    
}


class Story extends SuperHuman{
    // hero/villain    team
    // Captain America Avenger
    // Thanos          Enemy
    String team;
    String heroName;
    String villainName;



    public boolean isHero(SuperHuman s){
        // getRole();// returns null
        // 
        // String val = s.getRole();// returns
        if(s.getRole().equals("Hero")){
            return true;

        }
            return false;


    }




    public void setName(SuperHuman s, String name){

        //Check whether hero or villain
        if(isHero(s)){

            this.heroName = name; 
            this.team = "Avenger";
        }else{
            this.villainName = name; 
            this.team = "Enemy";

        }

    }

    public void printProfile(){


    }


    public void printDetails(){
        System.out.println("Made up name "+this.heroName);
        System.out.println("Teams is "+this.team);

    }



    


}







public class Assemble{

    public static void main(String []args){
        Human h1= new Human();
        // h1.setName("Anand");
        // // h1.name="Vishal";// we are not going to allow this

        // h1.setName("Vishal");
        h1.setName("Farheen");
        h1.setPrefix("Miss");
        h1.setGender("Female");
        
        // h1.printProfile();

        // System.out.println(h1.getName());
        // System.out.println(h1.getNameWithPrefix());
        Human h2= new Human();
        h2.setName("Nitish");
        h2.setGender("Male");
        // h2.printProfile();
        // System.out.println(h2.getNameWithPrefix());
        Human h3= new Human();
        h3.setName("Anand");
        h3.setGender("Male");
        // h3.printProfile();





        // System.out.println(h3.getNameWithPrefix());

        SuperHuman s1= new SuperHuman(1);
        s1.setName("Steve");
        s1.setGender("Male");
        s1.setSuperPower("SuperStrength");

        s1.printProfile();
        Story objStory = new Story();
        
        objStory.setName(s1, "Captain America");
        objStory.printDetails();
        // boolean val = objStory.isHero(s1);

        // System.out.println(val);


        // h1.setNameGender("Anand","M");
       




        // SuperHuman s1= new SuperHuman();
        // s1.name="Steve";
        // s1.gender ="M";
        // s1.superPower ="SuperStrength";
        // System.out.println(h1.getNameAndGender());
        // System.out.println("SuperHuman name is "+s1.name+" and super power is : "+s1.superPower);
    }
}