package Command.A1.drawer;

import java.awt.Color;                          

public interface Drawable {
    void init();                
    void draw(int x, int y);
    void setColor(Color color); 
}
