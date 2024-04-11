package com.danbi;

import java.util.ArrayList;
import java.util.List;

public class manager {

    private ArrayList<MusicDTO> musicDTOList = new ArrayList<>();

    // 곡추가
    public void add(MusicDTO musicDTO) {
        musicDTOList.add(musicDTO);
    }

    // 곡 전체 조회
    public ArrayList<MusicDTO> select(){
        return musicDTOList;
    }

    // 가수명 조회
    public ArrayList<MusicDTO> artistSearch(String artist){
        ArrayList<MusicDTO> search = new ArrayList<>();

        for (MusicDTO musicDTO : musicDTOList){
            if (musicDTO.getArtist().contains(artist)){
                search.add(musicDTO);
            }
        }
        return search;
    }

    // 제목 조회
    public ArrayList<MusicDTO> titleSearch(String title){
        ArrayList<MusicDTO> search = new ArrayList<>();

        for (MusicDTO musicDTO : musicDTOList){
            if (musicDTO.getTitle().contains(title)){
                search.add(musicDTO);
            }
        }
        return search;
    }


    // 곡삭제
    public boolean remove(int id) {

        MusicDTO old = null;

        for(int i = 0; i < musicDTOList.size(); i++) {
            if(musicDTOList.get(i).getId() == id) {
                old = musicDTOList.remove(i);
            }
        }

        return old != null;
    }
}
