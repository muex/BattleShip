/**
 * Created by muex on 23.04.15.
 */
public class Controller {
    public void createPlayField(){

        int[][] base = {
                {0,1,1,1,1,1,0},
                {0,0,0,0,0,0,0},
                {0,1,1,1,0,1,0},
                {0,0,0,0,0,1,0},
                {0,0,0,0,0,1,0},
                {1,1,0,0,0,1,0},
                {0,0,0,0,0,0,0}
        };

        Game quark = new Game(base);

    }
}
