package guru.qa.geoservice.exception;

public class DuplicateCountryNameException extends RuntimeException{
    public DuplicateCountryNameException() {
    }

    public DuplicateCountryNameException(String message) {
        super(message);
    }

    public DuplicateCountryNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicateCountryNameException(Throwable cause) {
        super(cause);
    }
}
