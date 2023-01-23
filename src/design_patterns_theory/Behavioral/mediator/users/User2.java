package design_patterns_theory.Behavioral.mediator.users;

import design_patterns_theory.Behavioral.mediator.ApnaChatRoom;

public class User2 extends Participant {
    private String name;
    private ApnaChatRoom chat;

    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg, this);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public User2(ApnaChatRoom chat) {
        this.chat = chat;
    }
}  