public class PersonalExceptions {
    public static class WeakPasswordException extends RuntimeException {
        public WeakPasswordException(String message) {
            super(message);
        }
    }

    public static class DateTimeParseException extends RuntimeException {
        public DateTimeParseException(String message) {
            super(message);
        }
    }
}
