package chapter10.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain_02 {
    public static void main(String[] args) {
        
        Queue<Message> messageQueue = new LinkedList<Message>();
        //LinkedList -> frequent add(offer) -> use, 'size' 

        Message lee = new Message("sendMail", "이호중");
        messageQueue.offer(lee);
        messageQueue.offer(new Message("sendSMS", "진광채"));
        messageQueue.offer(new Message("sendKAKAO", "리즈"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll(); // 출력 -> 선입 선출

            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냈습니다.");
                     break;
                 case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냈습니다.");
                     break;
                 case "sendKAKAO":
                    System.out.println(message.to + "님에게 카카오톡을 보냈습니다.");
                     break;
                
            
                default:
                    break;
            }//switch

        }//while

    }//main
}//class
