class Android extends Mobile{

    public Android (String name, String color, String brand){
        super(name, color, brand);
    }

    @Override
    public void callout(String message) {
        if (message.length()<10){
            super.callout(message);
        }
        else{
            System.out.println("<Android> Message cannot be sent");
        }
    }
}