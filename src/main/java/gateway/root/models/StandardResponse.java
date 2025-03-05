package gateway.root.models;

import lombok.Data;

@Data
public class StandardResponse<T> {
    private int status;
    private String message;
    private T data;
    private String timestamp;

    public StandardResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = java.time.LocalDateTime.now().toString();
    }
}
