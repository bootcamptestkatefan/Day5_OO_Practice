class IPhone extends Mobile{

    public IPhone (String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void callout(String message) {
        if (message.length()<10){
            System.out.println("<IPhone> Message: " + message);
        }
        else{
            System.out.println("<iPhone> Message cannot be sent");
            super.callout(message);
        }

    }
}