package headFirstJava;

import java.util.ArrayList;

public class DotComBust {
    //创建3个达康网站并指派名称且放入ArrayList中
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComArrayList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    //创建游戏对象
    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        //列出简短的提示
        System.out.println("你的目标是：以最少的步数击沉以下3个东东：Pets.com,eToys.com,Go2.com" + "/n" + "祝你好运");

        //对list中的每一个dotcom重复一次
        for (DotCom dotComToSet : dotComArrayList) {
            ArrayList<String> newlocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newlocation);
        }
    }

    public void startPlaying() {
        while (!dotComArrayList.isEmpty()) {
            String userGuess = helper.getUserInput("请输入位置：");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComArrayList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComArrayList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All Dot Coms are decd! your stock is now worthless");
        if (numOfGuesses <= 18) {
            System.out.println("仅仅用了" + numOfGuesses + "步");
        } else {
            System.out.println("用了" + numOfGuesses + "步");
        }
    }


}
