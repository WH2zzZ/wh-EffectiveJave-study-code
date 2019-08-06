package study.chapter05.test31;

public class Man extends Person {
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Man{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
