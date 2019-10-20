public class Rectangle {
    private int side1;
    private int side2;

    Rectangle(){}

    public void setSide1(int side1) {
        if (side1 <= 0) {
            System.out.println("Сторона не може буди від'ємною :)");
        } else {
            this.side1 = side1;
        }
    }

    public void setSide2(int side2) {
        if (side2 <= 0 ) {
            System.out.println("Сторона не може буди від'ємною :)");
        } else {
            this.side2 = side2;
        }
    }

    public int getSide1() { return side1; }
    public int getSide2() { return side2; }

    public void showPerimetr() {
        System.out.println("Периметр прямокутника = " + getPerimetr());
    }

    public void showArea() {
        System.out.println("Площа прямокутника = " + getArea() );
    }

    public int getPerimetr(){
        return (side1+side2) * 2;
    }

    public int getArea(){
        return side1*side2;
    }

    public double getCoefficientOfIdentity() {
        return side1/side2;
    }

    //метод порівняння
    public void compare(Rectangle r2){
        int area1 = this.getArea();
        int area2 = r2.getArea();
        if(area1 == area2){
            System.out.println("Дані прямокутники мають однакову площу");
        }
        if(area1 > area2){
            System.out.println("Площа 1ого прямокутника більша за площу другого");
        }
        if(area1 < area2){
            System.out.println("Площа 2ого прямокутника більша за площу 1ого");
        }
    }

    //метод подібності
    public void similarityCheck(Rectangle  r2){
        if(this.getCoefficientOfIdentity() == r2.getCoefficientOfIdentity()) {
            System.out.println("Дані чотирикутники подібні");
        } else {
            System.out.println("Прямокутники, але не схожі :)");
        }
    }
}
