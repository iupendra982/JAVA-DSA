public class interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();

        Doggy d=new Doggy();
        d.veg();
        d.non_veg();
    }
}

interface ChessPlayer{
    void moves();//it is by default public and abstract
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen steps");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King steps");
    }
}


//multiple inheritance example
interface herbivore{
void veg();
}
interface carnivore{
void non_veg();
}
class Doggy implements herbivore,carnivore{
    public void veg(){
        System.out.println("Eats grass");
    }
    public void non_veg(){
        System.out.println("Eats flesh");
    }
}