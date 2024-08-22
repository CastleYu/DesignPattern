package Command.A1.drawer;

import Command.A1.command.Command;

import java.awt.*;

public class DrawCommand implements Command {
    // ���ƶ���
    protected final Drawable drawable;
    // ����λ��
    private final Point position;
    // ������
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    // ִ��
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}

