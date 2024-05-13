package adapter;

// 定义接口TargetA
interface TargetA {
    void performActionA();
}

// 定义接口TargetB
interface TargetB {
    void performActionB();
}

// Adapter类实现两个接口
class Adapter implements TargetA, TargetB {
    @Override
    public void performActionA() {
        System.out.println("Performing Action A");
    }

    @Override
    public void performActionB() {
        System.out.println("Performing Action B");
    }
}

// BiAdapter类继承自Adapter
public class BiAdapter extends Adapter {
    // 可以添加特定于BiAdapter的方法或属性
    public void performBothActions() {
        performActionA();
        performActionB();
    }
}

