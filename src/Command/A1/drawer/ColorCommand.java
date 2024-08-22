package Command.A1.drawer;

import Command.A1.command.Command;

import java.awt.*;

public class ColorCommand implements Command {
    // 绘制对象
    protected final Drawable drawable;
    // 绘制色彩
    private final Color color;
    // 构造子
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // 执行
    public void execute() {
        drawable.setColor(color);
    }
}

