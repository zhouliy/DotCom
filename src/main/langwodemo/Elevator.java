package langwodemo;

public class Elevator {
    private int currentFloor;
    private int destinationFloor;
    private Boolean up;
    private Boolean doorsOpen;

    public void openDoor() {
        if (!(doorsOpen == true)) {
            System.out.println("电梯正在开门");
        } else {
            System.out.println("电梯正在关门");
        }
    }

    public void goingDown() {
        if (!(up == true)) {
            System.out.println("电梯下行");
        } else {
            System.out.println("电梯上行");
        }
    }

    public void goToFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
        System.out.println("你想去的楼层:" + this.destinationFloor);
        if (destinationFloor > currentFloor){
            this.goingDown();
        }
    }
}
