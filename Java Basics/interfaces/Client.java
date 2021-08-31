interface Callback{

    void callback(int param);
}

class AnotherClient implements Callback{
    public void callback(int param){

        System.out.println("Calling from Another Client "+param);
    }

}
class Client implements Callback{

    public void callback(int param){

        System.out.println("Calling from client "+param);
    }

    void something(){

    }

    public static void main(String []args){

        // Client obj = new Client();
        Callback obj = new Client();
        obj.callback(21);

        AnotherClient obj2 =  new AnotherClient();
        obj = obj2;

        obj.callback(42);

    }
}