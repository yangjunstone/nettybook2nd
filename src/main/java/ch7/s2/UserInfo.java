package ch7.s2;

import org.msgpack.annotation.Message;

/**
 * 需要序列化的POJO对象一定要加 @Message注解！！！
 */
@Message
public class UserInfo {
    private String userName;
    private int userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    /*
    @Override
    public String toString() {
        return "-[" + this.userName + " : " + this.userAge + "]-";
    }
    */
}
