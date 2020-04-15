public class Son extends Person {
    private String name;
    private int age;

    private void speak(){
        System.out.println("是人会说话");
    }

    private void GoSchool(){
        System.out.println("小孩要上学");
    }

    public Son() {
    }

    public Son(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Son(String name, int age, String name1, int age1) {
        super(name, age);
        this.name = name1;
        this.age = age1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
