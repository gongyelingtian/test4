package feiyong;

public class Boshi {
	public void statistics() {
        System.out.println(getName() + "\n" +
                "学期学费：" + getFeePerTerm() + "\n" +
                "学年学费：" + askTuition() + "\n" +
                "学生月薪水：" + getSalaryPerMonth() + "\n" +
                "学生年薪水：" + askSalary() + "\n" +
                "学生年收入：" + getMoney() + "\n" +
                "学生缴税：" + Tax.TaxManager.getTax(getMoney()));
    }
}
