package Builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {   // 先把Builder的子类的实例，
        this.builder = builder;          // 储存在builder属性
    }

    public Object construct() {                   // 建立文件
        builder.makeTitle("Greeting");            // 标题
        builder.makeString("美好的一天");      // 字串
        builder.makeItems(new String[]{           // 项目
                "早安。",
                "午安。",
        });
        builder.makeString("到了晚上");              // 另一个字串
        builder.makeItems(new String[]{             // 另一个项目
                "晚安。",
                "祝你有个好梦。",
                "再见。",
        });

        builder.makeItems(new String[]{             // 另一个项目
                "好好学习",
                "天天向上。",
        });
        builder.makeString("如初见");              // 另一个字串            

        return builder.getResult();                 // 完成的文件就是返回值
    }
}

