package hust.soict.dsai.aims.exception;  // Đảm bảo package đúng

// Kế thừa từ Exception để tạo lớp ngoại lệ tùy chỉnh
public class PlayerException extends Exception {

    // Constructor mặc định
    public PlayerException() {
        super();  // Gọi constructor của lớp cha (Exception)
    }

    // Constructor với thông điệp ngoại lệ
    public PlayerException(String message) {
        super(message);  // Gọi constructor của lớp cha với thông điệp
    }

    // Constructor với thông điệp và nguyên nhân (Throwable)
    public PlayerException(String message, Throwable cause) {
        super(message, cause);  // Gọi constructor của lớp cha với thông điệp và nguyên nhân
    }

    // Constructor với nguyên nhân (Throwable)
    public PlayerException(Throwable cause) {
        super(cause);  // Gọi constructor của lớp cha với nguyên nhân
    }
}
