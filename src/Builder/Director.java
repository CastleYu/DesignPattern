package Builder;

public class Director {
    private final Builder builder;

    public Director(Builder builder) {   // �Ȱ�Builder�������ʵ����
        this.builder = builder;          // ������builder����
    }

    public Object construct() {                   // �����ļ�
        builder.makeTitle("Greeting");            // ����
        builder.makeString("���õ�һ��");      // �ִ�
        builder.makeItems(new String[]{           // ��Ŀ
                "�簲��",
                "�簲��",
        });
        builder.makeString("��������");              // ��һ���ִ�
        builder.makeItems(new String[]{             // ��һ����Ŀ
                "����",
                "ף���и����Ρ�",
                "�ټ���",
        });

        builder.makeItems(new String[]{             // ��һ����Ŀ
                "�ú�ѧϰ",
                "�������ϡ�",
        });
        builder.makeString("�����");              // ��һ���ִ�            

        return builder.getResult();                 // ��ɵ��ļ����Ƿ���ֵ
    }
}

