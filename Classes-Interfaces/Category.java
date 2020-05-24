package generator.nex.rexx.completefitness;

/**
 * Created by rexx on 22-06-2018.
 */

public class Category {

    private String name;
    private int thumbnail;

    public Category(){
    }

    public Category(String name, int thumbnail){
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
