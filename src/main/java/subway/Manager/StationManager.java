package subway.Manager;

import subway.domain.Station;
import subway.domain.StationRepository;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class StationManager {
    private static final String STATION_INSERT = "1";
    private static final String STATION_DELETE = "2";
    private static final String STATION_LOOKUP = "3";

    private final Scanner scanner;
    private StationRepository stationRepository;

    public StationManager(Scanner scanner) {
        stationRepository = new StationRepository();
        this.scanner = scanner;
    }

    public void execute(String input) { // 역 관리 실행
        if (input.equals(STATION_INSERT)) {
            String stationName = InputView.inputStation(scanner);
            StationRepository.addStation(new Station(stationName));
            OutputView.stationInsertSuccess();
        }
        if (input.equals(STATION_DELETE)) {
            InputView.inputDeleteStation(scanner);
            OutputView.stationDeleteSuccess();
        }
        if (input.equals(STATION_LOOKUP)) {
            OutputView.stationLookup(stationRepository.toString());
        }
    }
}
