
class SuperHumans{

    String name;
    String gender;
    String superPower;
    
}


class Humans{

    String name;
    String gender;

    void setNameGender(String n, String g){
        name = n;
        gender = g;

    }
    String getNameAndGender(){
        
        return "Human name is "+name+" and gender is "+gender;
    }
       
}



public class Assemble{

    public static void main(String []args){
        Humans h1= new Humans();
        h1.setNameGender("Anand","M");
       
        SuperHumans s1= new SuperHumans();
        s1.name="Steve";
        s1.gender ="M";
        s1.superPower ="SuperStrength";
        System.out.println(h1.getNameAndGender());
        System.out.println("SuperHuman name is "+s1.name+" and super power is : "+s1.superPower);
    }
}