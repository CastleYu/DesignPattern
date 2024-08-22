package Command.A3.drawer;

import Command.A3.command.MacroCommand;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    // 绘制色彩
    private final Color color = Color.red;
    // 绘制点的半径
    private final int radius = 6;
    // 记录
    private final MacroCommand history;

    // 构造子
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    // 再度绘制整个记录
    public void paint(Graphics g) {
        history.execute();
    }

    // 绘制
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}

