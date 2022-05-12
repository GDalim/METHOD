package hwMETHODtype;

public class HwReturnType01 {

    // 5 Parameterized Return Type Methods.

    String songName;
    String singerName;
    int songRating;
    String songGenre;
    boolean lyricPrinter;

    public String setSongName(String songName){
        this.songName=songName;
        return this.songName;
    }
    public String setSingerName(String singerName){
        this.singerName=singerName;
        return this.singerName;
    }
    public String setGenre(String songGenre){
        this.songGenre=songGenre;
        return this.songGenre;
    }
    public int setSongRating(int songRating){
        this.songRating=songRating;
        return this.songRating;
    }
    public boolean lyricPrinter(boolean print){
        this.lyricPrinter=print;
        return this.lyricPrinter;
    }

    public static void main(String[] args) {
        HwReturnType01 objc=new HwReturnType01();

        System.out.println("\n\nSong name : \t"+objc.setSongName("500 Miles"));
        System.out.println("Singer : \t\t"+objc.setSingerName("Unknown"));
        System.out.println("Song genre : \t"+objc.setGenre("Country Pop"));
        System.out.println("\nI would rate the song "+objc.setSongRating(9)+" out of 10!\n");
        objc.lyricPrinter(true);
        if(objc.lyricPrinter==true) {
            System.out.println("Legendary Lyric of " + objc.songName + ":\n\nIf you miss the Train! Yall know \nYall know that I am gone \nYou can hear the whistle blown \nFive Hundred Miles \n" +
                    "\nFive Hundred Miles, Five hundred Miles \nOh Hundred miles 5 hundreds mile \nYou can hear the whistle blown \nFrom Hundred miles \n"+
                    "\nLord I'm one, Lord I'm two \nLord I'm three, Oh Lord! I'm four \nLord I'm Five Hundred miles \nAway from home");
        }
    }
}
