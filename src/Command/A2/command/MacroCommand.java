package Command.A2.command;

import java.util.Stack;

public class MacroCommand implements Command {
    // 命令的集合
    private final Stack commands = new Stack();
    // 执行
    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }
    // 新增
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    // 刪除最后一个命令
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    // 全部刪除
    public void clear() {
        commands.clear();
    }
}

