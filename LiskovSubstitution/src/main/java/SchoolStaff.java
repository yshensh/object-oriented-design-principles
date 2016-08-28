/**
 * Created by yshen on 8/28/16.
 */
public class SchoolStaff {

    private void makeAnnouncements() {
        System.out.println("SchoolStaff makes announcements.");
    }

    private void takeAttendence() {
        System.out.println("SchoolStaff takes attendence.");
    }

    private void collectPaperWork() {
        System.out.println("SchoolStaff collects papaerwork.");
    }

    private void conductHallwayDuties() {
        System.out.println("SchoolStaff conducts hallway duties.");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
        conductHallwayDuties();
    }
}
