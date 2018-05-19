package stateFolder;

import java.awt.Graphics2D;

public abstract class State {
    public abstract void init();

    public abstract void draw(Graphics2D g);

    public abstract void update();

}
