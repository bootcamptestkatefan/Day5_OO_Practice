class Mobile {

    private String name;
    private String color;
    private String brand;
    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }
    public void callout(String message) {
        System.out.println("Message: "+message);
    }
    public void basicInfo() {
        System.out.println("Name: "+name+", color: "+color+", brand: "+brand);
    }
}