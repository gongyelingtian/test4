package feiyong;

public class Zhuyao {
    public static void main(String[] args) {
        float feePerTerm = 2000;
        float salaryPerMonth = 4000;
        Boshi[] stu = new Boshi[2];
        for (int i = 0; i < stu.length; i++) {
            System.out.println("====");
            stu[i] = new Boshi(
                    Chuli.inputString("����:"),
                    Chuli.select("�Ա�", new String[]{"��", "Ů"}),
                    Chuli.inputInt("����", 0, 100),
                    feePerTerm, salaryPerMonth
            );
        }
        for (int i = 0; i < stu.length; i++) {
            for (int j = 0; j < 2; j++) {
                stu[i].purchaseTuition();
            }
            for (int j = 0; j < 12; j++) {
                stu[i].getSalary();
            }
            stu[i].statistics();
            System.out.println();
        }
    }
}
