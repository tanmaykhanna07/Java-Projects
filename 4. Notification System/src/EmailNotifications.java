public class EmailNotifications implements Notification{
    @Override
    public void sendNotification(String message, String recipient){
        if(validateMail(recipient)){
            System.out.println("Beep beep, you have a new email in your inbox which says " + message+ " ");
        }else{
            System.out.println("Wrong email brotha, check it again, come on");
        }
    }

    public boolean validateMail(String email){
        if(email.contains("@")){
            String[] parts = email.split("@");
            return parts.length == 2 && !parts[0].isEmpty() && !parts[1].isEmpty();
        }else {
            return false;
        }
    }
}
