/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ds.android.tasknet.logger;

import ds.android.tasknet.msgpasser.*;

/**
 *
 * @author Divya
 */
public class LogMessage {
    private Message msg;
    private String relation;

    public LogMessage(Message m){
        msg = m;
        relation = "";
    }

    public Message getMessage(){
        return msg;
    }

    public String getRelation(){
        return relation;
    }

    public void setMessage(Message m){
        msg = m;
    }

    public void setRelation(String r){
        relation = r;
    }
}