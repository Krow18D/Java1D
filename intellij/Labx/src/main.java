public class main {
    public static void main(String[] args) {
        Geometric shapes[] = {new Circle("green",4),
                new Rectangle("pink",4,7)};
        for(Geometric shape : shapes) {
            System.out.println(shape+" "+shape.getArea());
            if(shape instanceof Circle)
            {
                Circle c1 = (Circle)shape;
                System.out.println(c1.getRadius());
            }
        }

    }

}
