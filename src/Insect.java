import java.util.Objects;

public class Insect {
    private String name;
    private int legs;

    public Insect(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
    @Override
    public String toString(){
        return "Owad {"+ "name='"+ '\'' + "; legs=" + legs + '}';
    }
    @Override
    public  int hashCode(){
        return  Objects.hash(name,legs);
    }
    @Override
    public boolean equals(Object ins){
        if(this == ins) return true;
        if(ins == null||getClass()!= ins.getClass())
            return false;
        Insect insect = (Insect) ins;
        return legs == insect.legs&&
                Objects.equals(name,insect.name);
    }
}
