

public class Game1{
    public static void main(String[]args){
        Game g= new Game("freefire","Action",4.5f);
        g.play();
        g.summary();
    }
       
}

class Game{
    String title;
    String zonar;
    float rating;
    int playCount=0;
    Game(String title,String zonar , float rating){
        this.title= title;
        this.zonar= zonar;
        this.playCount= playCount;
        this.rating= rating;
    }
    Boolean type(){
        if(zonar != "horror"){
            return true;
        }
        else  return false;
    }
    int play(){
        playCount++;
        return playCount;
    }
    void summary(){
        System.out.println(title);
        System.out.println(zonar);
        System.out.println(playCount);
        System.out.println(type()?"Family friendly":"not" );
        System.out.println(rating);
    }
}



