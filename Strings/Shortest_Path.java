package Strings;

public class Shortest_Path {
    public static float getShortestPath(String path){
        int x=0;
        int y=0;

        for(int i=0;i<path.length();i++){
            char direction= path.charAt(i);
            //south
            if(direction=='s'){
                y--;
            }
            //north
            else if(direction=='n'){
                y++;
            }
            //west
            else if(direction=='w'){
                x--;
            }
            //east
            else if(direction=='e'){
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="wneenesennn";
        System.out.println(getShortestPath(path));
    }
}
