package task6.notepad.note;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Note {
private String topic;
private Date createDate;
private String msg;
private String email;

    public Note(String topic, Date createDate, String msg, String email) {
        this.topic = topic;
        this.createDate = createDate;
        this.msg = msg;
        this.email = email;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        return topic + " | " + simpleDateFormat.format(createDate) +
                " | " + msg + " | "+ email ;
    }
}
