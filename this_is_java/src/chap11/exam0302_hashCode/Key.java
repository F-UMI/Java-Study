package chap11.exam0302_hashCode;

import java.util.Objects;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }


    @Override
    public boolean equals(Object o) {
        if(o instanceof Key) {
            Key comparekey = (Key) o;
            if(this.number == comparekey.number) {
                return true;
            }
        }
        return false;
    }

    //논리적 동등 객체일 경우  동일한 해시코드가 리턴되도록 한다.
    //재정의 하지 않을시 value 의 값은 null 이된다.
    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
