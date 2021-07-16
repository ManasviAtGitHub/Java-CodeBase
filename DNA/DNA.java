
public class DNA{   

    // int length(){
    //     return 54;
    // }

    String findGene2(String dna_str){

        int startIndex = dna_str.indexOf("ATG");
        int tagIndex = dna_str.indexOf("TAG", startIndex+3);
        while(tagIndex!=-1){
            int diff = tagIndex - startIndex;

            if(diff%3 == 0){
                String gene = dna_str.substring(startIndex, tagIndex+3);
                return gene;

            }else{

                tagIndex = dna_str.indexOf("TAG", tagIndex+1);
            }


        }

        return "";


    }


    void findGene1(String dna_str){

        int ATG_index = dna_str.indexOf("ATG");// starting codon
        int TAG_index = dna_str.indexOf("TAG");// stopping codon
        
        if(TAG_index == -1){

            System.out.println("There is no stop codon");
        }else{

            System.out.println("ATG index "+ATG_index+" TAG index "+TAG_index);
        
            String gene = dna_str.substring(ATG_index, TAG_index+3);
        
            int diff = TAG_index - ATG_index;



            if(diff%3 == 0){

                System.out.println("Gene found : "+gene);

                // if(gene.equals("ATGGTCTGATAG")){
                //     System.out.println("Gene found : "+gene);

                // }else{

                //     System.out.println("Gene not found");
                // }

            }else{
            //  This part is redundant, we will better this by using while loop
                int newTagIndex =  dna_str.indexOf("TAG", TAG_index+1);
                int diff1 = newTagIndex - ATG_index;
                String gene1 = dna_str.substring(ATG_index, newTagIndex+3);
                if(diff1%3 == 0){

                    System.out.println("Gene found : "+gene1);
                }else{
                    System.out.println("Stop codon found but not multiple of 3");
                }


                

            }


        }
        
        
        


    }

    public static void main(String [] args){
        DNA obj = new DNA();
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

        String dna_str3 = "AGTATGGTAGAATAGTC"; 

        // dna_str with no stop codon
        String dna_str1 = "AGTATGGTCTGATGAGAGATC";

        String dna_str2 = "ATGTAG";

        // obj.findGene1(dna_str1); // No TAG
        // System.out.println("-----------------------");

        // obj.findGene1(dna_str); // perfect 
        // System.out.println("-----------------------");

        // obj.findGene1(dna_str2);
        // System.out.println("-----------------------");

        // obj.findGene1(dna_str3);
        // System.out.println("-----------------------");

        // when pattern not found index returned is -1
        // int TAG_index = dna_str1.indexOf("TAG");
        // System.out.println("Tag_index : "+TAG_index);


        String gene_str = obj.findGene2(dna_str3);
        if(gene_str.equals("")){
            System.out.println("Gene not found");
        }else{
            System.out.println("Gene "+gene_str);
        }






    }
}