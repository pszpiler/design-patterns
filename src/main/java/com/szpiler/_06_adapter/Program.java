package com.szpiler._06_adapter;

import com.szpiler._06_adapter.model.AudioPlayer;

public class Program {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    System.out.println(audioPlayer.play("song1.mp3"));
    System.out.println(audioPlayer.play("movie1.vlc"));
    System.out.println(audioPlayer.play("movie2.avi"));
    System.out.println(audioPlayer.play("movie3.mkv"));

  }
}
