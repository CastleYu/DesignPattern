package Command.A3.drawer;

import Command.A3.command.Command;

import java.awt.*;

public class DrawCommand implements Command {
    // 绘制对象
    protected final Drawable drawable;
    // 绘制位置
    private final Point position;

    // 构造子
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    // 执行
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}

