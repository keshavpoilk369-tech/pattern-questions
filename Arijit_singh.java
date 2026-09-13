package Song;

public class Arijit_singh {
    public static void main(String[] args){
        String lyrics = "Hum tere bin ab reh nhi sakte\n"+"Tere bina kya wajood mera\n"+"Tujhse juda agr ho jaayenge \n"+"Toh khud se hi ho jaayenge juda";

        String[] words = lyrics.split(" ");

        try{
            for(String word : words){
                System.out.print(word + " ");
                Thread.sleep(750);
            }
            System.out.println();
        } catch (InterruptedException e){
            System.err.println("Execution interrupted: " + e.getMessage());
        }
    }
}
