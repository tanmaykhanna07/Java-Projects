public class PushNotifications implements Notification{
    @Override
    public void sendNotification(String message, String recipient){
        if(checkToken(recipient)){
            System.out.println("New Notification, beep beep, that says " + message + " ");
        }else{
            System.out.println("Some unknown app is pushing notifications, fuck them we ball");
        }

    }
    public boolean checkToken(String token){
        return !token.isEmpty();
    }
}
