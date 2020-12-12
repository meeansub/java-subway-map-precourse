package validator;

public class ExceptionMessage {
    public static final String IS_NOT_VALID_FUNCTION = "[ERROR] 선택할 수 없는 기능입니다";
    public static final String STATION_NAME_OVER_TWO = "[ERROR] 역 이름은 2글자 이상이여야 합니다.";
    public static final String STATION_NAME_EXISTS = "[ERROR] 이미 등록된 역 이름입니다.";
    public static final String NOT_EXIST_DELETE_STATION = "[ERROR] 삭제할 역이 존재하지 않습니다.";
    public static final String LINE_NAME_OVER_TWO = "[ERROR] 노선 이름은 2글자 이상이여야 합니다.";
    public static final String LINE_NAME_EXISTS = "[ERROR] 이미 등록된 노선 이름입니다.";
    public static final String NOT_EXIST_LINE = "[ERROR] 삭제할 노선이 존재하지 않습니다.";
    public static final String NOT_EXIST_STATION_FOR_LINE = "[ERROR] 등록할 역이 존재하지 않습니다.";
}
