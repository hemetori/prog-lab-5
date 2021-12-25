package stored_classes;

public class Worker {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer salary; //Поле не может быть null, Значение поля должно быть больше 0
    private java.util.Date startDate; //Поле не может быть null
    private java.time.ZonedDateTime endDate; //Поле может быть null
    private Status status; //Поле может быть null
    private Organization organization; //Поле не может быть null
}
