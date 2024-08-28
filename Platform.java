package project2;

public class Platform {
    private int platformNum;
    private Train train;

    public Platform(int platformNum) {
        this.platformNum = platformNum;
    }

    public int getPlatformNum() {
        return platformNum;
    }

    public void setPlatformNum(int platformNum) {
        this.platformNum = platformNum;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformNum=" + platformNum +
                ", train=" + train +
                '}';
    }
}
