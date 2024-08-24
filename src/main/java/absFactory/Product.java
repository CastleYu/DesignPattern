package absFactory;
// 产品接口
public interface Product {
    void use();
}

// 具体产品A
class ProductA implements Product {
    @Override
    public void use() {
    }
}

// 具体产品B
class ProductB implements Product {
    @Override
    public void use() {
    }
}
