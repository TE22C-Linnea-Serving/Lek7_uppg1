import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int points = 0;

        System.out.println("Vad är Sveriges nationaldjur?"); //Fråga 1
        System.out.println("1. Uggla"); //Alt 1
        System.out.println("2. Älg");   //Alt 2 
        System.out.println("3. Orm");   //Alt 3
        System.out.println("4. Björn"); //Alt 4
        int ans1 = tangentbord.nextInt();   //Tar in alternativet användaren valde
        if(ans1==2){    //Om det användaren skrev = 2
            points++;   //Ökar poängen med 1
        }
        System.out.println(""); //Nytt stycke

        System.out.println("vilken blomma är Japans nationalblomma?");  //Fråga 2
        System.out.println("1. Momo");  //Alt 1
        System.out.println("2. Fuji(Wisteria)");    //Alt 2
        System.out.println("3. Kinmokusei");    //Alt 3
        System.out.println("4. Sakura");    //Alt 4
        int ans2 = tangentbord.nextInt();   //Tar in alternativet användaren valde
        if(ans2==4){ //Om det valdra alternativet = 4
            points++;   //Ökar poängen med 1
        }
        System.out.println(""); //Nytt stycke

        System.out.println("Vad heter Sydkoreas huvudstad?");   //Fråga 3
        System.out.println("1. Seoul"); //Alt 1
        System.out.println("2. Tokyo"); //Alt 2
        System.out.println("3. Pusan"); //Alt 3
        System.out.println("4. Hongkong");  //Alt 4
        int ans3 = tangentbord.nextInt();   //Tar in alternativet användaren valde
        if(ans3==1){    //Om det valda alternativet = 1
            points++;   //Ökar poängen med 1
        }
        System.out.println(""); //Nytt sty

        System.out.println("Sveriges huvudstad?");  //Fråga 4
        System.out.println("1. Oslo");  //Alt 1
        System.out.println("2. Berlin");    //Alt 2
        System.out.println("3. Stockholm"); //Alt 3
        System.out.println("4. Paris"); //alt 4
        int ans4 = tangentbord.nextInt();   //Tar in alternativet användaren valde
        if(ans4==3){    //Om det valda alternativet = 3
            points++;   //Ökar poängen med 1
        }
        System.out.println(""); //Nytt stycke

        System.out.println("Hur många dagar finns det i februari?");    //Fråga 5
        System.out.println("1. 28");    //Alt 1
        System.out.println("2. 31");    //Alt 2
        System.out.println("3. 30");    //Alt 3
        System.out.println("4. 27");    //Alt 4
        int ans5 = tangentbord.nextInt();   //Tar in alternativet användaren valde
        if(ans5==1){    //Om det valda alternativet = 1
            points++;   //Ökar poängen med 1
        }
        System.out.println(""); //Nytt stycke

        System.out.println("Du fick "+points+"/5 rätt");    //Berättar för användaren hur många poäng dom fick
    }
}