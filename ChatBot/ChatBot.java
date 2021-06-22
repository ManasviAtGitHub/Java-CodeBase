public class ChatBot {
    static int tokenCounter = 0;

    static void print(String str){
        System.out.println(str);
    }

    static void greetings(String greeting){
        print("Hi !!! "+ greeting);
    }

    static void name(String name){

        greetings("Good Morning");
        print("What is your name : "+name);

    }
    static void arriveAt(String person){
        print(person+" will arrive at 10:00 am");
    }
    static void personToMeet(String person){
        print("Who do you want to meet : "+person);
        print("Let me check ....");
        print("");
        arriveAt(person);
    }

    static void giveToken(){
        print("Please wait for a awhile ....");
        print("");
        tokenCounter++;
        print("Your Token Number is : "+tokenCounter);
        print("Thank you for your patience :)");
        print("");
    }
    static void record(String yourname, String person){

        name(yourname);
        personToMeet(person);
        giveToken();
    }



    public static void main(String args[]){

        record("Farheen", "Doctor");
        record("Melwyn", "Doctor");
        record("Devika", "Doctor");

    }
}
