package com.stackroute.services;

import com.stackroute.packet.Music;

import java.util.List;

public interface MusicService
{
    public Music saveTrack(Music music);
    public List<Music> getAllTracks();
    public void delTrack(int id);
    public Music updateTrack(Music music);
}
