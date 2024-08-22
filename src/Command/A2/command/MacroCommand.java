package Command.A2.command;

import java.util.Stack;

public class MacroCommand implements Command {
    // ����ļ���
    private final Stack commands = new Stack();
    // ִ��
    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }
    // ����
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    // �h�����һ������
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    // ȫ���h��
    public void clear() {
        commands.clear();
    }
}

