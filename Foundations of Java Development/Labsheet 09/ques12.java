import java.util.ArrayList;
import java.util.HashSet;
public class ques12 {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIds = new HashSet<>();
        patientNames.add("Rahul"); patientNames.add("Priya"); patientNames.add("Aman");
        patientIds.add("P101"); patientIds.add("P102"); patientIds.add("P103");
        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIds);
        String searchName = "Priya";
        if (patientNames.contains(searchName)) System.out.println(searchName + " found in patient list.");
        else System.out.println(searchName + " not found.");
        patientNames.remove("Aman"); patientIds.remove("P103");
        System.out.println("After Removal:");
        System.out.println("Patient Names: " + patientNames);
        System.out.println("Patient IDs: " + patientIds);
    }
}
