package Smartphone;

import java.util.Scanner;

import Functions.Browser;
import Functions.MusicPlayer;
import Functions.Telephone;

public class Iphone implements MusicPlayer, Telephone, Browser {

    private String currentMusic;
    private final Scanner scan;

    public Iphone() {
        this.scan = new Scanner(System.in);
    }

    // Browser methods
    @Override
    public void showPage(String url) {
        System.out.println("Open page : " + url);
    }

    public void updatePage(){
        System.out.println("Updating page...");
    }

    public void addNewTab(){
        System.out.println("Opening new tab...");
    }

    // Music player methods
    @Override
    public void selectMusic(String music) {
        System.out.println("Select the song:");
        music = scan.nextLine();
        currentMusic = music;
    }

    @Override
    public void playMusic(String currentMusic) {
        System.out.println("Playing " + currentMusic + "...");
    }

    public String getCurrentMusic(){
        return currentMusic.toUpperCase();
    }

    @Override
    public void pauseMusic() {
        System.out.println("Music paused.");
    }

    // Phone methods:
    @Override
    public void makeCall(String number) {
        System.out.println("Dial the number to call: ");
        number = scan.nextLine().trim();
        if(isValidNumber(number)){
            System.out.println("Calling to " + number +"...");
        }else{
            System.out.println("Invalid number.");
        }
    }



    @Override
    public void answerCall() {
        System.out.println("Answering call...");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call...");
    }

    private boolean isValidNumber(String number){
        return number.matches("[0-9]+") && number.length() == 11;
    }

    public void closeScan(){
        scan.close();
    }
}

