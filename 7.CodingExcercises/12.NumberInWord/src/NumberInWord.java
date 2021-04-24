public class NumberInWord{
    public static void printNumberInWord(int number){
       String answer = "OTHER";
//       if(number == 0) {
//           answer = "ZERO";
//       } else if(number == 1){
//           answer = "ONE";
//       } else if(number == 2) {
//           answer = "TWO";
//       } else if(number == 3) {
//           answer = "THREE";
//       } else if(number == 4) {
//           answer = "FOUR";
//       } else if(number == 5) {
//           answer = "FIVE";
//       } else if(number == 6) {
//           answer = "SIX";
//       } else if(number == 7) {
//           answer = "SEVEN";
//       } else if(number == 8) {
//           answer = "EIGHT";
//       } else if(number == 9) {
//           answer = "NINE";
//       } else {
//           final String answer1 = answer;
//       }
        switch(number) {
            case 0: answer = "ZERO";
            break;
            case 1: answer = "ONE";
            break;
            case 2: answer = "TWO";
            break;
            case 3: answer = "THREE";
            break;
            case 4: answer = "FOUR";
            break;
            case 5: answer = "FIVE";
            break;
            case 6: answer = "SIX";
            break;
            case 7: answer = "SEVEN";
            break;
            case 8: answer = "EIGHT";
            break;
            case 9: answer = "NINE";
            break;
        }
        System.out.println(answer);
    }
}
