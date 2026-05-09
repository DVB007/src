public class ScoreCalculation {
    //float need f at the last number when declare
    public static void main(String[] args) {
        //Declaring float variables for scores in different subjects
        float mathScore = 85.5f;
        float scienceScore = 90.0f;
        float englishScore = 78.5f;
        float historyScore = 88.0f;

        //Calculating the total score
        float totalScore = mathScore + scienceScore + englishScore + historyScore;

        //Calculating the average score
        float averageScore = totalScore / 4;//Dividing by the number of subjects (4)

        //Displaying the total and average scores
        System.out.println("Total Score : " + totalScore);
        System.out.println("Average Score : " + averageScore);
    }
}
