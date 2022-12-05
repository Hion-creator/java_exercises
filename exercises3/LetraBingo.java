package exercises3;

public enum LetraBingo {
    B(1,15,5), I(16,30,5), N(31,45,4), G(46, 60, 5), O(61,75,5);

    private int min;
    private int max;
    private int lon;

    LetraBingo(int min, int max, int lon){
        this.min = min;
        this.max = max;
        this.lon = lon;
    }

    public String getLetra(){
        return this.name();
    }

    public int getMin(){
        return this.min;
    }

    public int getMax(){
        return this.max;
    }

    public int getLon(){
        return this.lon;
    }
}