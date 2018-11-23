public class Person {

    private final Mobile mobile;
    private final String personName;

    public Person(Mobile mobile, String personName) {
        this.mobile = mobile;
        this.personName = personName;
    }

    public void callout(String message){
        mobile.callout(message);
    }
}
