package Proxy;

public interface Printable {
    void setPrinterName(String name);   // 命名
    String getPrinterName();            // 取得名称
    void print(String string);          // 输出字串（打印）
}

