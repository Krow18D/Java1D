public abstract class Promotion{
    private int net,mincall;
    private boolean nolimitdtac,music,wifi;
    private String name;

    public Promotion() {
    }

    public abstract String getData();
    public boolean isNolimitdtac() {
        return nolimitdtac;
    }

    public void setNolimitdtac(boolean nolimitdtac) {
        this.nolimitdtac = nolimitdtac;
    }

    public boolean isMusic() {
        return music;
    }

    public void setMusic(boolean music) {
        this.music = music;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public int getMincall() {
        return mincall;
    }

    public void setMincall(int mincall) {
        this.mincall = mincall;
    }

}
