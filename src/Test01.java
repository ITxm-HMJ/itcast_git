public class Test01 {

    public static void main(String[] args) {
        //多态
        Person p = new Son();
        p.setName("科比");
        String name = p.getName();
        System.out.println(name);

        GanDad g = new GanSon();
        int height = g.height;
        System.out.println(height);


    }
}
