class Student{
    String name;
    int roll_no;
    int age;
    String bloodGroup;

    // Student(){

    // }

    Student(String name){
        this.name = name;
        System.out.println("Name is "+name);
    }
    Student(int roll_no){
        this.roll_no = roll_no;
        System.out.println("Roll is "+roll_no);
    }
    
    


    Student(String name, int roll_no){
        this.name =name;
        this.roll_no =roll_no;
        System.out.println("Name"+name+" Roll is "+roll_no);
    }
    Student(String name, int roll_no, int age){
        this.name =name;
        this.roll_no= roll_no;
        this.age =age;
        System.out.println("Name"+name+" Roll is "+roll_no+" Age is "+age);
    }
    Student(String name, int roll_no, int age, String bloodGroup){
        this.name =name;
        this.roll_no= roll_no;
        this.age =age;
        this.bloodGroup = bloodGroup;
        System.out.println("Name"+name+" Roll is "+roll_no+" Age is "+age+" blooGroup is "+bloodGroup);
    }

    public static void main(String []args){

        new Student("Anand");
        new Student(48);
        new Student("Vishal",8);
        new Student("Disha",81,20);
        new Student("Kuber",11,20,"O+");
        
        
        
    }


}