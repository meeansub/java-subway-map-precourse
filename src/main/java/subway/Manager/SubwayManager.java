package subway.Manager;

import subway.domain.LineStationRepository;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class SubwayManager {
    private static final String STATION_MANAGE = "1";
    private static final String LINE_MANAGE = "2";
    private static final String SECTION_MANAGE = "3";
    private static final String SUBWAY_SECTION_PRINT = "4";

    private final Scanner scanner;
    private StationManager stationManager;
    private LineManager lineManager;
    private SectionManger sectionManager;

    public SubwayManager(Scanner scanner) {
        this.scanner = scanner;

        stationManager = new StationManager(scanner);
        lineManager = new LineManager(scanner);
        sectionManager = new SectionManger(scanner);
    }

    public void manage() {
        while (true)
        {
            OutputView.mainView();
            String status = execute(InputView.inputFunction(scanner));
            if (status.equals("Q")) {
                break;
            }
        }
    }

    private String execute(String input) { // 지하철 관리 실행
        if (input.equals(STATION_MANAGE)) {
            OutputView.stationManageView();
            stationManager.execute(InputView.inputStationFunction(scanner));
        }
        if (input.equals(LINE_MANAGE)) {
            OutputView.lineManageView();
            lineManager.execute(InputView.inputLineFunction(scanner));
        }
        if (input.equals(SECTION_MANAGE)) {
            OutputView.sectionManageView();
            sectionManager.execute(InputView.inputSectionFunction(scanner));
        }
        if (input.equals(SUBWAY_SECTION_PRINT)) {
            LineStationRepository lineStationRepository = new LineStationRepository();
            OutputView.printSubwayMap(lineStationRepository.toString());
        }
        return input;
    }
}
