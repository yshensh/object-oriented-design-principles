/**
 * Created by yshen on 8/28/16.
 */
public class School {

    public static void main(String argsp[]) {
        System.out.println("\nEnglish Teacher ....");
        EnglishTeacher et = new EnglishTeacher();
        et.performOtherResponsibilities();
        et.teach();

        System.out.println("\nSubstitute Teacher ....");
        SubstituteTeacher st = new SubstituteTeacher();
        st.performOtherResponsibilities();
    }
}
