public class Cube {
    private int side;

    public Cube(){
        side = 1;
    }

    public Cube(int x){
        if(x<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than uno!");
        }
        side = x;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int x){
        if(x<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than uno!");
        }
        side = x;
    }

    public int getSurfaceArea(){
        return 6*side*side;
    }

    public int getVolume(){
        return side*side*side;
    }

    public String toString(){
        return "Cube{side=" + side + "}";

    }


}