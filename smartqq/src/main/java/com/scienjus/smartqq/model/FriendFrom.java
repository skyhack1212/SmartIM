package com.scienjus.smartqq.model;

import cn.ieclipse.smartim.model.impl.AbstractFrom;

public class FriendFrom extends AbstractFrom {
    private Friend friend;
    
    public Friend getFriend() {
        return friend;
    }
    
    public void setFriend(Friend friend) {
        this.friend = friend;
    }
    
    public String getName() {
        return getFriend().getName();
    }
    
    @Override
    public Friend getContact() {
        return getFriend();
    }
    
    @Override
    public Friend getMember() {
        return getFriend();
    }
}
