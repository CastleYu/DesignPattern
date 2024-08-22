package ChainOfResponsibility;

/**
 * @param number 问题编号
 */
public record Trouble(int number) {
    // 发生问题

    public String toString() {      // 打印显示问题的字串
        return "[Trouble " + number + "]";
    }
}

