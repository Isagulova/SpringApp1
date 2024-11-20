package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBeanClassical", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBeanClassical", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        System.out.println(classicalMusic2.getSong());
//        //Music music = context.getBean("musicBean", Music.class);
//        //MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        //firstmusicPlayer.playMusicList();
//        //secondmusicPlayer.playMusicList();
//
//        boolean comparision = firstmusicPlayer ==secondmusicPlayer;
//        System.out.println(comparision);
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//        //WHen dependencies injected using setters
//        //MusicPlayer musicPlayer1 = new MusicPlayer();
//        // musicPlayer1.setMusic(Music music);
//        firstmusicPlayer.setVolume(20);
//        //System.out.println(musicPlayer.getName());
//        //System.out.println(musicPlayer.getVolume());
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());
        context.close();
    }}