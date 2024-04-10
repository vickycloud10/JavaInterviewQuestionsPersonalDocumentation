import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamPractice {

    /*
    Write a program to count each character of a given string using streams

    String input = "NewtonianDynamics"

    Output:
    a = 2, s = 1, c = 1, d = 1, t = 1, e = 1, m = 1, w = 1, y = 1, i = 2, m = 1, n = 4, o = 1
    */

    public String stringCharacterCounter(String stringToBeCounted){
        return Arrays.stream(stringToBeCounted
              .toLowerCase()
              .split(""))
              .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).toString();
    }

    /*
    Difference between map and filter in streams java 8

    * Map helps us to transform object values. The map operation allows us to take in a parameter of one type
      and returns something else

    * Filter helps us to filter the given data based on given condition, i.e. it returns a boolean value. If the filter returns
      true the value will be added to the list or a collection else it won't be added

     */

    // Example 1 Map:
    /*
    * Determine the person's eligibility to vote based on their age and .
    * */

    public List<Voters> determineTheVotersEligibility(List<Voters> listOfVoters){
        return listOfVoters
                .stream()
                .map(voter -> {
            if(voter.getAge() >= 18) {
                voter.setEligibility("eligible");
            } else {
                voter.setEligibility("notEligible");
            }
            return voter;
        }).collect(Collectors.toList());
    }

    public List<Voters> getOnlyEligiblePeopleToVote(List<Voters> votersList){
        return votersList.stream()
                .filter(voters -> voters.getAge() >= 18)
                .collect(Collectors.toList());
    }
}
