package Device;

import Smartphone.Iphone;

public class Iphone2007 {

    public static void main(String[] args) {

        Iphone iphone1= new Iphone();

        iphone1.makeCall("");
        iphone1.answerCall();
        iphone1.endCall();

        iphone1.addNewTab();
        iphone1.showPage("https://www.youtube.com/watch?v=cnnd2uEi-dU");
        iphone1.updatePage();

        iphone1.selectMusic("");
        iphone1.playMusic(iphone1.getCurrentMusic());
        iphone1.pauseMusic();

        iphone1.closeScan();
    }
}
