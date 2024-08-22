package Command.A1.drawer;

import Command.A1.command.Command;

import java.awt.*;

public class ColorCommand implements Command {
    // ���ƶ���
    protected final Drawable drawable;
    // ����ɫ��
    private final Color color;
    // ������
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // ִ��
    public void execute() {
        drawable.setColor(color);
    }
}

