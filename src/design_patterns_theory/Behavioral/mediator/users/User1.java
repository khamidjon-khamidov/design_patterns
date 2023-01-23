package design_patterns_theory.Behavioral.mediator.users;

import design_patterns_theory.Behavioral.mediator.ApnaChatRoom;

public class User1 extends Participant {
    private String name;
    private ApnaChatRoom chat;
    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg, this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User1(ApnaChatRoom chat) {
        this.chat = chat;
    }

}