package headFirstJava;

public class Game {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("输入一个数字：");
            String result = dotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println(numOfGuess);
            }
        }
    }
}
