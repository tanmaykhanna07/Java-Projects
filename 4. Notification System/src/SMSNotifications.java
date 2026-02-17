public class SMSNotifications implements Notification{
    @Override
    public void sendNotification(String message, String recipient){
        if(checkPhone(recipient)){
            System.out.println("Beep beep, you have a sms that says " + message + " ");
        }else{
            System.out.println("Enter a correct number");
        }
    }

    public boolean checkPhone(String recipient){
        return recipient.length() == 10 && (recipient.startsWith("6") || recipient.startsWith("7") || recipient.startsWith("8") || recipient.startsWith("9"));
    }
}
