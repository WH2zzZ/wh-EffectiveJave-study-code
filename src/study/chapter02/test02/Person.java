package study.chapter02.test02;


public class Person {
    private String name;

    private int age;

    private String hobby;

    private int birthday;

    public static class Builder{
        private final String name;

        private int age;

        private String hobby;

        private int birthday;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int val){
            this.age = val;
            return this;
        }

        public Builder hobby(String val){
            this.hobby = val;
            return this;
        }

        public Builder birthday(int val){
            this.birthday = val;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        name = builder.name;
        age = builder.age;
        hobby = builder.hobby;
        birthday = builder.birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
