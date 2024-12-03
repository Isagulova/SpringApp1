package ru.alishev.springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

//    @Autowired//Field injection
//    private ClassicalMusic classicalMusic;
//    @Autowired
//    private RockMusic rockMusic;


    @Autowired //Constructor injection
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


//    @Autowired//Setter injection
//    public void setClassicalMusic(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
//    @Autowired//Setter
//    public void setRockMusic(RockMusic rockMusic) {
//        this.rockMusic = rockMusic;
//    }

    public void playMusic() {
            System.out.println("Playing: " + classicalMusic.getSong());
            System.out.println("Playing: " + rockMusic.getSong());
    }
}
