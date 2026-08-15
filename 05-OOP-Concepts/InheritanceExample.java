class Parent {

    void display() {
        System.out.println("This is Parent class");
    }
}

public class InheritanceExample extends Parent {

    public static void main(String[] args) {

        InheritanceExample obj = new InheritanceExample();

        obj.display();
    }
}
