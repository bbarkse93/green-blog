package shop.mtcoding.blogv2._core.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiUtil<T> {
    private boolean sucuess;
    private T data;

    public ApiUtil(boolean sucuess, T data) {
        this.sucuess = sucuess;
        this.data = data;
    }
}
