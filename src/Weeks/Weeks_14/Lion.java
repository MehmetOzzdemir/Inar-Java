package Weeks.Weeks_14;

public class Lion extends Animal {
    private int tailSize;

    public Lion(){
        super();
        super.hasSwimmingSkills=false;
        this.tailSize=10;
    }
    public Lion(int tailSize){
        super(100,1.8,true,false);
        this.tailSize=tailSize;
    }

    public int getTailSize() {
        return tailSize;
    }

    public void setTailSize(int tailSize) {
        this.tailSize = tailSize;
    }

    //Annotation
    @Override
    public void eats(){
        System.out.println("Lion is eating");
    }
}
