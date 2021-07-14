
public class DNA{   

    // int length(){
    //     return 54;
    // }


    public static void main(String [] args){
        // DNA obj = new DNA();
        // int l = obj.length();
    
        String str= "dna is made up of made nucleotides";
                //   ^ => 0                      ^=>28
        // int len = str.length();
        // System.out.println("String length is "+len);
        // int in = str.indexOf("made");
        // System.out.println("Index of 'made' : "+in);
        // int in_after = str.indexOf("made", in+1);
        // System.out.println("Index of 'made' after : "+in_after);

        String dna_str = "AGTATGGTCTGATAGAGATC";
        int ATG_index = dna_str.indexOf("ATG");
        int TAG_index = dna_str.indexOf("TAG");
        System.out.println("ATG index "+ATG_index+" TAG index "+TAG_index);
        

    }
}