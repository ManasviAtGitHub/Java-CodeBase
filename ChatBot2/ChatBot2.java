public class ChatBot2 {
    int tokenCounter = 0; //Global variable // static means you have only one copy in the program


    // to simplify print statements
    void print(String str){
        System.out.println(str);
    }


    void greetings(String greeting){
        print("Hi !!! "+ greeting);
    }

    void name(String name){

        greetings("Good Morning");
        print("What is your name : "+name);

    }
    void arriveAt(String person){
        print(person+" will arrive at 10:00 am");
    }


    void personToMeet(String person){
        print("Who do you want to meet : "+person);
        print("Let me check ....");
        print("");
        arriveAt(person);
    }

    void giveToken(){
        print("Please wait for a awhile ....");
        print("");
        tokenCounter++; //tokenCounter = tokenCounter+1;
        print("Your Token Number is : "+tokenCounter);
        print("Thank you for your patience :)");
        print("");
    }
    void record(String yourname, String person){

        name(yourname);
        personToMeet(person);
        giveToken();
    }



    public static void main(String args[]){

        // record("Farheen", "Doctor");
        // record("Aakash", "Doctor");
        // record("Melwyn", "Lawyer");
        // record("Devika", "Lawyer");

        // created an object, object is of type ChatBot2, and memory is assigned using new keyword
        ChatBot2 doctor = new ChatBot2();
        ChatBot2 lawyer = new ChatBot2();

        doctor.record("Farheen", "Doctor");
        doctor.record("Aakash", "Doctor");

        lawyer.record("Melwyn", "Lawyer");
        lawyer.record("Devika", "Lawyer");

        doctor.record("Abdullah", "Doctor");

    }
}
