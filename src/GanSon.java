import java.util.Objects;

public class GanSon implements GanDad {

    private int height = 177;

    public GanSon(){
    }

    public GanSon(int height){
        this.height = height;
    }

    @Override
    public void eat() {
        System.out.println("吃美食");
    }

    @Override
    public void sleep() {
        System.out.println("休息");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "GanSon{" +
                "height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GanSon)) return false;
        GanSon ganSon = (GanSon) o;
        return height == ganSon.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

}
