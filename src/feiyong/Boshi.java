package feiyong;

public class Boshi {
	public void statistics() {
        System.out.println(getName() + "\n" +
                "ѧ��ѧ�ѣ�" + getFeePerTerm() + "\n" +
                "ѧ��ѧ�ѣ�" + askTuition() + "\n" +
                "ѧ����нˮ��" + getSalaryPerMonth() + "\n" +
                "ѧ����нˮ��" + askSalary() + "\n" +
                "ѧ�������룺" + getMoney() + "\n" +
                "ѧ����˰��" + Tax.TaxManager.getTax(getMoney()));
    }
}
