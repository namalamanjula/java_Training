class LogicalExample {

    void display() {
        System.out.println("Display method");
    }

    void reverse() {
        System.out.println("Reverse method");
    }

    int len() {
        return 10;
    }

    public static void main(String[] args) {
        LogicalExample ob = new LogicalExample();
        ob.display();
        ob.reverse();
        System.out.println("Len = " + ob.len());
    }
}