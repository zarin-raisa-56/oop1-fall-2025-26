//Replace a specific word in a sentence.

public class Task10 {
    
    public static void main(String[] args) {
        // মূল বাক্য
        String sentence = "Ami gram e jete chai.";

        // যেই শব্দটা বদলাতে চাই
        String targetWord = "gram";

        // নতুন শব্দ
        String newWord = "shohor";

        // শব্দ বদলানো
        String updatedSentence = sentence.replace(targetWord, newWord);

        // ফলাফল দেখানো
        System.out.println("Updated sentence: " + updatedSentence);
    }
}


