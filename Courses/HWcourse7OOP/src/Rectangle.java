public class Rectangle {
    int height;
    int width;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }
    public int area(){

        return width * height;
    }
    public int perimeter(){
        return 2 * (width + height);
    }
    public boolean isSquare(){
        return width == height;
    }
}
