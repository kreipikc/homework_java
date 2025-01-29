import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;

public class Main {
    public static void main(String[] args) {
        // Task 1 (DateTime)
//        LocalDate currentDate = LocalDate.now();
//        LocalTime currentTime = LocalTime.now();
//
//        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDateTime = currentDateTime.format(formatter);
//
//        System.out.println(formattedDateTime);

        // Task 2 (DateTime)
//        LocalDate date1 = LocalDate.of(2025, 10, 1);
//        LocalDate date2 = LocalDate.of(2025, 10, 5);
//
//        System.out.println(compareDates(date1, date2));

        // Task 3 (DateTime)
//        LocalDate currentDate = LocalDate.now();
//        LocalDate newYear = LocalDate.of(currentDate.getYear(), 12, 31);
//
//        long daysUntilNewYear = ChronoUnit.DAYS.between(currentDate, newYear);
//        System.out.println("Days until New Year: " + daysUntilNewYear);

        // Task 4 (DateTime)
//        int year = 2024;
//        System.out.println("Високосный год: " + isLeapYear(year));

        // Task 5 (DateTime)
//        int month = 10;
//        int year = 2025;
//        System.out.println("Кол-вол выходных в месяце: " + countWeekendsInMonth(month, year));

        // Task 6 (DateTime)
//        Instant start = Instant.now();
//        someMethod();
//        Instant end = Instant.now();
//
//        Duration duration = Duration.between(start, end);
//        System.out.println("Время выполнения метода: " + duration.toMillis() + " мс");

        // Task 7 (DateTime)
//        String dateString = "01-10-2023";
//        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//
//        LocalDate date = LocalDate.parse(dateString, inputFormatter);
//        LocalDate newDate = date.plusDays(10);
//
//        String formattedDate = newDate.format(outputFormatter);
//        System.out.println(formattedDate);

        // Task 8 (DateTime)
//        LocalDateTime utcDateTime = LocalDateTime.now(ZoneId.of("UTC"));
//        ZoneId moscowZone = ZoneId.of("Europe/Moscow");
//
//        ZonedDateTime moscowDateTime = utcDateTime.atZone(ZoneId.of("UTC")).withZoneSameInstant(moscowZone);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        System.out.println("UTC: " + utcDateTime.format(formatter));
//        System.out.println("Moscow: " + moscowDateTime.format(formatter));

        // Task 9 (DateTime)
//        LocalDate birthDate = LocalDate.of(1990, 5, 15);
//        System.out.println("Age: " + calculateAge(birthDate));

        // Task 10 (DateTime)
//        int month = 10;
//        int year = 2023;
//        printMonthCalendar(month, year);

        // Task 11 (DateTime)
//        LocalDate startDate = LocalDate.of(2025, 1, 1);
//        LocalDate endDate = LocalDate.of(2025, 12, 31);
//
//        System.out.println("Random date: " + generateRandomDate(startDate, endDate));

        // Task 12 (DateTime)
//        LocalDateTime eventDateTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59);
//        System.out.println("Time until event: " + calculateTimeUntilEvent(eventDateTime));

        // Task 13 (DateTime)
//        LocalDateTime start = LocalDateTime.of(2024, 10, 1, 9, 0);
//        LocalDateTime end = LocalDateTime.of(2024, 10, 1, 17, 0);
//
//        System.out.println("Working hours: " + calculateWorkingHours(start, end));

        // Task 14 (DateTime)
//        LocalDate date = LocalDate.of(2025, 10, 1);
//        System.out.println("Date in Russian: " + formatDateWithLocale(date, new Locale("ru")));
//        System.out.println("Date in English: " + formatDateWithLocale(date, new Locale("en")));

        // Task 15 (DateTime)
//        LocalDate date = LocalDate.of(2025, 10, 1);
//        System.out.println("Day of week: " + getDayOfWeekInRussian(date));

        // Task 1 (Singleton, enum)
//        DatabaseConnection db1 = DatabaseConnection.getInstance();
//        DatabaseConnection db2 = DatabaseConnection.getInstance();
//
//        db1.connect();
//        db2.connect();

        // Task 2 (Singleton, enum)
//        Logger logger = Logger.getInstance();
//
//        logger.log("Первое сообщение");
//        logger.log("Второе сообщение");
//
//        logger.printLogs();

        // Task 3 (Singleton, enum)
//        Order order = new Order();
//        System.out.println("Initial status: " + order.getStatus());
//
//        order.setStatus(Order.OrderStatus.IN_PROGRESS);
//        System.out.println("Updated status: " + order.getStatus());
//
//        order.setStatus(Order.OrderStatus.DELIVERED);
//        System.out.println("Updated status: " + order.getStatus());
//
//        order.setStatus(Order.OrderStatus.CANCELLED);

        // Task 4 (Singleton, enum)
//        System.out.println(SeasonTranslator.translateSeason(SeasonTranslator.Season.WINTER));
//        System.out.println(SeasonTranslator.translateSeason(SeasonTranslator.Season.SPRING));
//        System.out.println(SeasonTranslator.translateSeason(SeasonTranslator.Season.SUMMER));
//        System.out.println(SeasonTranslator.translateSeason(SeasonTranslator.Season.AUTUMN));

        // Task 1 (IO)
//        String inputFile = "input.txt";
//        String outputFile = "output.txt";
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String upperCaseLine = line.toUpperCase();
//                writer.write(upperCaseLine);
//                writer.newLine();
//            }
//
//        } catch (IOException e) {
//            System.err.println("Error processing file: " + e.getMessage());
//        }

        // Task 2 (IO)
//        TextProcessor processor = new ReplaceDecorator(new UpperCaseDecorator(new TrimDecorator(new SimpleTextProcessor())));
//        String result = processor.process(" Hello world ");
//        System.out.println(result);

        // Task 3 (IO)
//        String inputFile = "input.txt";
//        String outputFileIO = "output_io.txt";
//        String outputFileNIO = "output_nio.txt";
//
//        long startTimeIO = System.currentTimeMillis();
//        IOvsNIO.copyFileUsingIO(inputFile, outputFileIO);
//        long endTimeIO = System.currentTimeMillis();
//        System.out.println("IO Time: " + (endTimeIO - startTimeIO) + " ms");
//
//        long startTimeNIO = System.currentTimeMillis();
//        IOvsNIO.copyFileUsingNIO(inputFile, outputFileNIO);
//        long endTimeNIO = System.currentTimeMillis();
//        System.out.println("NIO Time: " + (endTimeNIO - startTimeNIO) + " ms");

        // Task 4 (IO)
//        String source = "input.txt";
//        String dest = "output.txt";
//
//        try {
//            copyFile(source, dest);
//            System.out.println("File copied successfully.");
//        } catch (IOException e) {
//            System.err.println("Error copying file: " + e.getMessage());
//        }

        // Task 5 (IO)
//        String filePath = "input.txt";
//
//        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(Paths.get(filePath), StandardOpenOption.READ)) {
//            ByteBuffer buffer = ByteBuffer.allocate(1024);
//            final long[] position = {0};
//
//            fileChannel.read(buffer, position[0], buffer, new CompletionHandler<Integer, ByteBuffer>() {
//                @Override
//                public void completed(Integer result, ByteBuffer attachment) {
//                    if (result == -1) {
//                        System.out.println("End of file reached.");
//                        return;
//                    }
//                    attachment.flip();
//                    byte[] data = new byte[attachment.remaining()];
//                    attachment.get(data);
//                    System.out.println(new String(data));
//                    attachment.clear();
//
//                    position[0] += result;
//                    fileChannel.read(attachment, position[0], attachment, this);
//                }
//
//                @Override
//                public void failed(Throwable exc, ByteBuffer attachment) {
//                    System.err.println("Read failed: " + exc.getMessage());
//                }
//            });
//
//            Thread.sleep(5000);
//
//        } catch (Exception e) {
//            System.err.println("Error reading file: " + e.getMessage());
//        }

    }

    // Task 2 (DateTime)
    public static String compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            return date1 + " is before " + date2;
        } else if (date1.isAfter(date2)) {
            return date1 + " is after " + date2;
        } else {
            return date1 + " is equal to " + date2;
        }
    }

    // Task 4 (DateTime)
    public static boolean isLeapYear(int year) {
        return Year.of(year).isLeap();
    }

    // Task 5 (DateTime)
    public static int countWeekendsInMonth(int month, int year) {
        YearMonth yearMonth = YearMonth.of(year, month);
        int weekends = 0;

        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                weekends++;
            }
        }

        return weekends;
    }

    // Task 6 (DateTme)
    public static void someMethod() {
        int j = 0;
        for (int i = 0; i < 1_000_000; i++) {
            j++;
        }
    }

    // Task 9 (DateTime)
    public static int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    // Task 10 (DateTime)
    public static void printMonthCalendar(int month, int year) {
        YearMonth yearMonth = YearMonth.of(year, month);

        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {
            LocalDate date = LocalDate.of(year, month, day);
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            String dayType = (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) ? "Weekend" : "Workday";
            System.out.println(date + " - " + dayType);
        }
    }

    // Task 11 (DateTime)
    public static LocalDate generateRandomDate(LocalDate startDate, LocalDate endDate) {
        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(startEpochDay, endEpochDay);

        return LocalDate.ofEpochDay(randomDay);
    }

    // Task 12 (DateTime)
    public static String calculateTimeUntilEvent(LocalDateTime eventDateTime) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        Duration duration = Duration.between(currentDateTime, eventDateTime);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        return String.format("%d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }

    // Task 13 (DateTime)
    public static long calculateWorkingHours(LocalDateTime start, LocalDateTime end) {
        return ChronoUnit.HOURS.between(start, end);
    }

    // Task 14 (DateTime)
    public static String formatDateWithLocale(LocalDate date, Locale locale) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        return date.format(formatter);
    }

    // Task 15 (DateTime)
    public static String getDayOfWeekInRussian(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ru"));
    }

    // Task 2 (IO)
    interface TextProcessor {
        String process(String text);
    }

    static class SimpleTextProcessor implements TextProcessor {
        @Override
        public String process(String text) {
            return text;
        }
    }

    abstract static class TextProcessorDecorator implements TextProcessor {
        protected TextProcessor textProcessor;

        public TextProcessorDecorator(TextProcessor textProcessor) {
            this.textProcessor = textProcessor;
        }

        @Override
        public String process(String text) {
            return textProcessor.process(text);
        }
    }

    static class UpperCaseDecorator extends TextProcessorDecorator {
        public UpperCaseDecorator(TextProcessor textProcessor) {
            super(textProcessor);
        }

        @Override
        public String process(String text) {
            return super.process(text).toUpperCase();
        }
    }

    static class TrimDecorator extends TextProcessorDecorator {
        public TrimDecorator(TextProcessor textProcessor) {
            super(textProcessor);
        }

        @Override
        public String process(String text) {
            return super.process(text).trim();
        }
    }

    static class ReplaceDecorator extends TextProcessorDecorator {
        public ReplaceDecorator(TextProcessor textProcessor) {
            super(textProcessor);
        }

        @Override
        public String process(String text) {
            return super.process(text).replace(" ", "_");
        }
    }

    // Task 4 (IO)
    public static void copyFile(String source, String dest) throws IOException {
        try (FileChannel srcChannel = FileChannel.open(Paths.get(source), StandardOpenOption.READ);
             FileChannel destChannel = FileChannel.open(Paths.get(dest), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            srcChannel.transferTo(0, srcChannel.size(), destChannel);
        }
    }
}