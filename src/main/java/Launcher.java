import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import graphics.Game;

public class Launcher {

    public static void main(String[] args) {
        new LwjglApplication(new Game());
    }
}
