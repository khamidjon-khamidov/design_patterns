package design_patterns_theory.Behavioral.mediator;

import design_patterns_theory.Behavioral.mediator.users.Participant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApnaChatRoomImpl implements ApnaChatRoom{
    //get current date time   
    DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");
    Date date = new Date();
    @Override  
    public void showMsg(String msg, Participant p) {
          
        System.out.println(p.getName()+"'gets message: "+msg);  
        System.out.println("\t\t\t\t"+"["+dateFormat.format(date)+"]");
    }     
}