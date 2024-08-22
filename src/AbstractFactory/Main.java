package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link sina = factory.createLink("��������", "http://www.sina.com/");
        Link sohu = factory.createLink("�Ѻ�����", "http://www.sohu.com");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link china_yahoo = factory.createLink("Yahoo!China", "http://www.yahoo.com.cn/");
        Link xmu = factory.createLink("XMU", "http://www.xmu.edu.cn/");
        Link google = factory.createLink("Google", "http://www.google.com/");
        Link baidu = factory.createLink("Baidu", "http://www.baidus.com/");


        Tray traynews = factory.createTray("����");
        traynews.add(sina);
        traynews.add(sohu);
        traynews.add(xmu);
        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(china_yahoo);

        Tray traysearch = factory.createTray("��������");
        traysearch.add(trayyahoo);
        //traysearch.add(xmu);
        traysearch.add(google);
        traysearch.add(baidu);


        Page page = factory.createPage("LinkPage", "���Ŵ�ѧ��ϢѧԺ������ʾ��������ѧԺ��");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
